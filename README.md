# camel-boot
A seed-project for starting new REST-API Camel/Spring Boot projects

This project can be used to kick-start Spring-Boot-wrapped-Camel projects which expose a REST API. The core use case for this is a microservice. When used in conjunction with [camel-boot-cxf-soap](https://github.com/andrewharmellaw/camel-boot-cxf-soap) (which does the same thing but exposes a SOAP API) you have a good starter for ten for most synchronous microservices architectures you may want to create.

# What's Inside?
So what do I get by seeding my project in this way? Well, you'll get a set of code, tests (unit and integration) and config, plus [Gradle](http://gradle.org/) build, which bootstraps an [Apache Camel](https://camel.apache.org/) app that exposes a REST API.  All this is handily packaged as a executable [Spring Boot](http://projects.spring.io/spring-boot/) fat jar.  

You also get:

 * Camel endpoint exposure via [Jetty](https://eclipse.org/jetty/)
 * integration tests via [RESTassured](https://github.com/jayway/rest-assured) which run under the integrationTest Gradle target and which start up your Spring Boot app locally in order to run them against it
 * logging via [Logstash](https://www.elastic.co/products/logstash) (with a sample config files for STDOUT and Jetty Access logging)
 * REST api docs via [Swagger](http://swagger.io/)
 * circuit breaking on downstream calls via [Hystrix](https://github.com/Netflix/Hystrix)
 * metrics collection and publishing via CodaHale [Metrics](https://dropwizard.github.io/metrics/3.1.0/) for JVM, Jetty, and Hystrix as well as your app code (we also had Camel metrics, but we never used them)
 * an embedded Jetty servlet container (_not_ the Camel one above) which exposes the [Hystrix metrics-event-stream servlet](https://github.com/Netflix/Hystrix/tree/master/hystrix-contrib/hystrix-metrics-event-stream) and the [Codahale Metrics servlets](https://dropwizard.github.io/metrics/3.1.0/manual/servlets/)

# Usage
## Quickstart
To use this seed project, fork this repository, and rename it as desired.  Then run the following gradle tasks:
 * ```gradle clean test``` - runs the example unit tests
 * ```gradle clean integrationTest ``` - runs the example unit tests
 * ```gradle bootRun``` - starts the Spring-Boot app
 * ```gradle clean test integrationtest install``` - runs all tests (unit and integration, packages the spring boot fat jar and installs it in your local repo
 
## In Depth
We have a design goal to reduce the amount of code which distracts form your business logic.  To this end, we've focussed on removing XML-config, ketp the dependencies clean and lean, and provided a structure which should give clear indication where to put your code.  It can however result in things looking a little magical. Here are how the various elements are set up:

### Properties 
Environment-dependent config information is read from a set of .properties files which are located external to the JAR file.  The ones for developent are located in the ```config``` directory.  These are split up so as to prevent any one file from getting too dense.  They are loaded and shared with Spring, Camel, and Hystrix via the [archaius-spring-adapter](https://github.com/Capgemini/archaius-spring-adapter) which is configured as a Spring ```@Bean``` in the MyAppConfig class.  The idea is to build a JAR which will work in _all_ environments, and then configure it with env-specific properties files deployed alongside it.

#### Files to change
TBC

#### Further reading
* [archaius-spring-adapter](https://github.com/Capgemini/archaius-spring-adapter)
* [Netflix Archaius](https://github.com/Netflix/archaius)

### Spring Boot
The core of the Spring Boot app is the ```Application``` class.  This has the ```@SpringBootApplication``` annotation and gets us most of the way towards the fat jar goodness we desire.  Note that the ```@EnableAutoConfiguration``` annotation is NOT used.  We prefer to do things a little more explicitly which we find helps us avoid many of the Spring-magic problems most people encounter at some point or other.

This aside, you may notice that there seems to be little Spring Boot (or indeed Spring-anything) in evidence.  This is intentional. If you want to see what is there in the seed, ```build.gradle``` is a good place to start.  Note that we have excluded the Tomcat starter (so we get Jetty instead) as well as web-mvc.  We don't need them in our projects. 

We have ended up doing this because Spring Boot loves to look at your classpath and do clever things based on what it finds.  While this is definitely a boon in most situations, it is possible that this can give you major headaches.  We have found that it is best therefore to add single dependencies to your project and then, before you add any code or config, run your tests and check that ```gradle bootRun``` still works.  It's amazing the havoc that a stray servlet-api, buried down in your dependency graph can wreak.

Finally note that we've managed to do away with all that nasty XML Spring config.  As mentioned in the *Properties* section above, when we do need to create a bean, we do by creating a ```@Bean``` method it in the ```@Configuration``` annotated ```MyAppConfig``` class, or we explicitly import is with an explicit ```@Import``` at the top of the ```Application``` class.

Taking the ```MyAppConfig``` class first, you can see there is some boiler-plate which illustrates how to get access to the Spring context (should you need it) and also a Spring bean instance of ```ArchaiusBridgePropertyPlaceholderConfigurer``` which loads the properties (into Spring-, Camel- and Netflix-scopes) from the files listed in the *Properties* section above.  See [github for more info on the Archaius-Spring-Adapter](https://github.com/Capgemini/archaius-spring-adapter) (which provides this class).

With the ```@Import```, we're using Spring here to explicitly bring into config-scope another class which is again annotated ```@Configuration```.  This one comes from one of our dependencies - [springboot-camel-metrics-publisher]() in this case - and simply starts up and registers the servlets which publish the Hystrix metrics stream, the Codahale metrics, and allows thread dumps.  (For more information on all of these, see the relevant sections below.)

This indicates a convention. If we want to add more configuration ```@Bean```s fo our app alone, we add them to ```MyAppConfig```.  If we are bringing them in from a dependency, explicitly declare them in ```Application``` via an ```@Import```.

#### Files to change
TBC

#### Further reading
* [Spring Boot Reference Guide](http://docs.spring.io/spring-boot/docs/current-SNAPSHOT/reference/htmlsingle/)

### Camel 
First thing to note with the Camel elements are the dependencies.  There should be very few surprises here if you've used Camel before.  

The Second thing to look at again is ```src/main/java/...Application.java```.  This extends Camel's ```FatJarRouter```, and as already mentioned is annotated ```@SpringBootApplication``` thereby removing the need for us to have any Camel XML config at all.  This tiny piece of typing means that when we do ```gradle bootRun``` (or ```java -jar YourApp.jar```) you will see your Camel context starting up inside a Spring context with next to no effort on your part.  

The rest (no pun intended) is up to you.  We typically create our Camel routes in the ```route``` package. There is an example REST one in there for you already.  We have also added an example RESTassured integration test which runs when you run ```gradle integrationTest```.

#### Files to change
TBC

#### Further reading
* [Camel: Spring Boot](https://camel.apache.org/spring-boot.html)
* [Camel: REST DSL](https://camel.apache.org/rest-dsl.html)

### Swagger
The example REST DSL route class generates and publishes Swagger files at http://localhost:xx/xxxxxxxxx.  To view these in the Swagger broswer you need to ..... TBC.

### Logging
We use SLF4J and Logstash for our logging.  In addition to the expected STDOUT logging which goes by default to file and console, there is also HTTP access logging (also to file).

#### Files to change
TBC

#### Further reading
* [Logstash Documentation](https://www.elastic.co/guide/en/logstash/2.2/index.html)

### Metrics
Its always nice to have an idea what your app is doing.  We make heavy use of CodaHale Metrics to give us this information.  As already mentioned, instrumented aspects of the seed project are:
* JVM
* Jetty
* Hystrix
* [Apache HTTPClient](https://hc.apache.org/httpcomponents-client-ga/index.html) (via the separate [circuit-broken-camel-rest-client](https://github.com/andrewharmellaw/circuit-broken-camel-rest-client) library)
* App Code
Camel is also instrumented, but we never made use of this data so its not included in this at this time.

#### Files to change
TBC

#### Further reading
* [Metrics Manual](https://dropwizard.github.io/metrics/3.1.0/manual/)

### Hystrix
TBC

#### Files to change
TBC

#### Further reading
TBC

# Acknowledgements
The idea for these projects was pretty much stolen from Netflix's [Karyon](https://github.com/Netflix/karyon).  It then evolved as we built more and more Microservice-based solutions at Capgemini.  

There is little original thought in all that has been pulled together here - we're just sharing our glue code, and the build files, and some examples which illustrate some nice ways to do things.  The core is based on:

 1. [Apache Camel](https://camel.apache.org/)
 1. [Spring-Boot](http://projects.spring.io/spring-boot/)
 1. Netflix's [Archaius](https://github.com/Netflix/archaius) and [Hystrix](https://github.com/Netflix/hystrix)
 1. [CodaHale's Metrics](https://dropwizard.github.io/metrics/3.1.0/)
 1. [Swagger](http://swagger.io/)
 1. [logstash](https://github.com/elastic/logstash)
 1. [Jetty](https://eclipse.org/jetty/)

# Contributors
 * [@andrewharmellaw](http://github.com/andrewharmellaw)
 * [@azmadu](http://github.com/azmadu)
 * [@gaythu-rajan](http://github.com/gayathu-rajan)
 * [@nikhilvibhav](http://github.com/nikhilvibhav)
 * [@santosh2020](http://github.com/santosh2020)
 
If you submit a PR, please add your name to this list.  
