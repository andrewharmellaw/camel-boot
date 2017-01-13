package com.capgemini.brahma.config;

import org.apache.camel.component.servlet.CamelHttpTransportServlet;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Configuration class for Camel HTTP Servlet component.
 *
 * @author Ganga Aloori
 */
@Configuration
public class CamelHttpServletConfig {

    @Value("${rest.api.base.url:/api/v1}")
    private String restApiBaseUrl;

    private static final Logger LOGGER = LoggerFactory.getLogger(CamelHttpServletConfig.class);

    /**
     * Registers Camel HTTP Servlet with Spring application context.
     *
     * @return the Servlet registration bean for Camel HTTP servlet.
     */
    @Bean
    public ServletRegistrationBean camelHttpServletRegistration() {

        final CamelHttpTransportServlet camelHttpServlet = new CamelHttpTransportServlet();
        final ServletRegistrationBean servletRegistration = new ServletRegistrationBean(camelHttpServlet, restApiBaseUrl +"/*");
        servletRegistration.setName("CamelServlet");

        LOGGER.info("Camel HTTP Transport Servlet Registered");

        return servletRegistration;
    }
}