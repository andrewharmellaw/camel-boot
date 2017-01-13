package com.capgemini.brahma.config;

import com.capgemini.archaius.spring.ArchaiusBridgePropertyPlaceholderConfigurer;
import com.codahale.metrics.MetricRegistry;
import org.apache.camel.CamelContext;
import org.apache.camel.component.properties.PropertiesComponent;
import org.apache.camel.spring.boot.CamelContextConfiguration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;

/**
 * Spring Configuration class which provides all the app-specific config via @Bean-annotated methods.
 */
@Configuration
public class MyAppConfig {

    @Autowired
    CamelContext camelContext;

    /**
     * Access the camel context.
     * @return the camel context
     */
    @Bean
    CamelContextConfiguration contextConfiguration(MetricRegistry metricRegistry) {
        return new CamelContextConfiguration() {
            @Override
            public void beforeApplicationStart(CamelContext context) {
                System.out.println("your custom configuration goes here.");
                PropertiesComponent pc = new PropertiesComponent();
                pc.setLocation("file:config/env.properties");
                context.addComponent("properties", pc);

                if(context.isAllowUseOriginalMessage()) {
                    context.setAllowUseOriginalMessage(Boolean.FALSE);
                }
            }

            @Override
            public void afterApplicationStart(CamelContext camelContext) {
            }
        };
    }

    /**
     * Setup the ArchaiusBridgePropertyPlaceholderConfigurer to provide properties information to Spring, Camel, and
     * Hystrix.
     * @return the configurer
     */
    @Bean
    @Primary
    public ArchaiusBridgePropertyPlaceholderConfigurer bridgePropertyPlaceholder() {

        ArchaiusBridgePropertyPlaceholderConfigurer configurer = new ArchaiusBridgePropertyPlaceholderConfigurer();

        configurer.setIgnoreResourceNotFound(true);
        configurer.setInitialDelayMillis(5000);
        configurer.setDelayMillis(5000);
        configurer.setIgnoreDeletesFromSource(true);
        Resource[] resources = new Resource[5];
        resources[0] = new FileSystemResource("config/camel.properties");
        resources[1] = new FileSystemResource("config/env.properties");
        resources[2] = new FileSystemResource("config/hystrix.properties");
        resources[3] = new FileSystemResource("config/metrics.properties");
        resources[4] = new FileSystemResource("config/application.properties");
        configurer.setLocations(resources);

        return configurer;
    }
}
