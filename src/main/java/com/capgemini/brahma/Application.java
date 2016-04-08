package com.capgemini.brahma;

import com.capgemini.jetty.logger.JettyServerCustomizer;
import org.apache.camel.spring.boot.FatJarRouter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

import com.capgemini.brahma.config.CamelHttpServletConfig;
import com.capgemini.camel.metrics.publisher.configuration.MetricsServletConfiguration;

/**
 * The heart of the Spring Boot-ed Camel application.  This should stay very small, with all the work being done
 * elsewhere in routes, processors, splitters, aggregators, service activators etc.
 *
 * The one thing which might change is the addition of further explicit Spring Configuration imports via the @Import
 * annotation.  If these configurations are app-specific, they should go in the MyAppConfig class, but if they are
 * contained in existing JAR files, then add there here as shown below for MetricsServletConfiguration,
 * JettyServletCustomizer and CamelHttpServletConfig.
 */
@Import({MetricsServletConfiguration.class, JettyServerCustomizer.class, CamelHttpServletConfig.class})
@SpringBootApplication
public class Application extends FatJarRouter {

    private static final Logger LOGGER = LoggerFactory.getLogger(Application.class);

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

}