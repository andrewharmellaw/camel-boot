# camel-boot
A seed-project for starting new REST-API Camel/Spring Boot projects

This project is to be used to kick-start Camel/Spring-Boot projects (e.g. microservices) which expose a REST API.  When used in conjunction with [camel-boot-cxf-soap](https://github.com/andrewharmellaw/camel-boot-cxf-soap) (which does the same thing but exposes SOAP APIs) you have a good starter for ten for most microservices you may want to create.

# What's Inside?
So what do I get by seeding my project in this way? Well, you'll get a set of code and config, plus gradle build, which bootstraps a Camel app exposing a REST API and is packaged as a Spring Boot fat jar.  

You also get:

 * Camel endpoint exposure via Jetty 
 * integration tests via RESTassured which run under the integrationTest target and which start up your spring-boot app locally in order to run
 * logging via Logstash (with a sample config file)
  * for stdout and http-access logging
 * REST api docs via Swagger
 * circuit breaking via Hystrix
 * metrics collection and publishing via CodaHale's Metrics 
  * for JVM, Jetty, and Hystrix as well as our app code (we also had Camel metrics, but we never used them)
 * an embedded Jetty servlet container (not the Camel one above) which exposes the hystrix stream servlet and a codahale metrics servlet

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
