# camel-boot
A seed-project for starting new REST-API Camel/Spring Boot projects

This project can be used to kick-start Spring-Boot-wrapped-Camel projects which expose a REST API. The core use case for this is a microservice. When used in conjunction with [camel-boot-cxf-soap](https://github.com/andrewharmellaw/camel-boot-cxf-soap) (which does the same thing but exposes a SOAP API) you have a good starter for ten for most synchronous microservices architectures you may want to create.

# What's Inside?
So what do I get by seeding my project in this way? Well, you'll get a set of code and config, plus [Gradle](http://gradle.org/) build, which bootstraps an [Apache Camel](https://camel.apache.org/) app that exposes a REST API.  All this is handily packaged as a executable [Spring Boot](http://projects.spring.io/spring-boot/) fat jar.  

You also get:

 * Camel endpoint exposure via [Jetty](https://eclipse.org/jetty/)
 * integration tests via [RESTassured](https://github.com/jayway/rest-assured) which run under the integrationTest Gradle target and which start up your Spring Boot app locally in order to run them against it
 * logging via [Logstash](https://www.elastic.co/products/logstash) (with a sample config files for STDOUT and Jetty Access logging)
 * REST api docs via [Swagger](http://swagger.io/)
 * circuit breaking on downstream calls via [Hystrix](https://github.com/Netflix/Hystrix)
 * metrics collection and publishing via CodaHale [Metrics](https://dropwizard.github.io/metrics/3.1.0/) for JVM, Jetty, and Hystrix as well as your app code (we also had Camel metrics, but we never used them)
 * an embedded Jetty servlet container (_not_ the Camel one above) which exposes the hystrix stream servlet and a codahale metrics servlet

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
TBC

#### Files to change
TBC

### Spring Boot
Dependencies aside, there seems to be little Spring Boot (or indeed Spring-anything) in evidence.  This is intentional. build.gradle is a good place to start.  Note that we have excluded the Tomcat starter (so we get Jetty) as well as web-mvc.  Because Spring Boot loves to look at your classpath and do clever things based on what it finds its best to add a single dependency to your project and then, before you add any code or config, run your tests and check that ```gradle bootRun``` still works.  It's amazing the havoc that a stray servlet-api, buried down in your dependency graph can wreak.

Then note the springBoot.mainClass config - you shouldn't have to change this. We've set up a starter main class for you too (see the *Camel* section next).  All you need to know for your Spring-Boot comprehension is that this class comes from Camel and gets all the Boot-y goodness up and running.

#### Files to change
TBC

### Camel 
First thing to note with the Camel elements are the dependencies.  There should be very few surprises here if you've used Camel before.  

Second thing to note is ```src/main/java/...Application.java```.  This extends Camel's ```FatJarRouter```, and is annotated ```@SpringBootApplication``` thereby removing the need for us to have any Camel XML config at all.  It handles all that for us.  

The final things to notice are the ```src/main/java/...config/MyAppConfig.java``` and the ```@Import``` on ```Application.java```.  

Taking ```MyAppConfig.java``` first, you can see there is some boiler-plaste which illustrates how to get access to the Spring context (should you need it) and also a Spring bean instance of ```ArchaiusBridgePropertyPlaceholderConfigurer``` which loads the properties (into Spring-, Camel- and Netflix-scopes) from the files listed in the *Properties* section above.  See [github for more info on the Archaius-Spring-Adapter](https://github.com/Capgemini/archaius-spring-adapter) (which provides this class).

With the ```@Import```, we're using Spring here to bring into scope a class we have in one of our dependencies which is annotated ````@Configuration``` - this comes from [springboot-camel-metrics-publisher]() and simply starts up and registers the servlets which publish the hystrix metrics stream, the codahale metrics, and a thread dump servlet.

Now that you know what the provided moving parts are you can take a look at the example route and associated tests... (TBC)

#### Files to change
TBC

### Metrics
TBC

### Hystrix
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
