package com.capgemini.brahma.config;

import org.apache.camel.swagger.servlet.RestSwaggerCorsFilter;
import org.apache.camel.swagger.servlet.RestSwaggerServlet;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.embedded.FilterRegistrationBean;
import org.springframework.boot.context.embedded.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Configuration class for Camel Swagger component.
 *
 * @author Ganga Aloori
 * @author Andrew Harmel-Law
 *
 * TODO: MOVE THIS OUT TO A DEPENDENCY AND SPRING-IMPORT IT EXPLICITLY IN Application.java?
 */
@Configuration
public class CamelSwaggerServletConfig {

    @Value("${swagger.url:/apidocs}")
    private String swaggerUrl;

    @Value("${rest.api.base.url:/api/v1}")
    private String restApiBaseUrl;

    @Value("${rest.api.version:/v1}")
    private String restApiVersion;

    @Value("${rest.api.title:Example API}")
    private String restApiTitle;

    @Value("${rest.api.description:The example REST API in Brahma}")
    private String restApiDesc;

    private static final Logger LOGGER = LoggerFactory.getLogger(CamelSwaggerServletConfig.class);

    /**
     * Registers Camel Swagger Servlet with Spring application context.
     *
     * @return the Servlet registration bean for Camel Swagger servlet.
     */
    @Bean
    public ServletRegistrationBean camelSwaggerServletRegistration() {

        final RestSwaggerServlet camelSwaggerServlet = new RestSwaggerServlet();
        final ServletRegistrationBean servletRegistration = new ServletRegistrationBean(camelSwaggerServlet, swaggerUrl + "/*");
        servletRegistration.addInitParameter("base.path", removeLeadingSlash(restApiBaseUrl));
        servletRegistration.addInitParameter("api.path", swaggerUrl);
        servletRegistration.addInitParameter("api.version", restApiVersion);
        servletRegistration.addInitParameter("api.title", restApiTitle);
        servletRegistration.addInitParameter("api.description", restApiDesc);

        LOGGER.info("Camel Swagger Servlet Registered");

        return servletRegistration;
    }

    /**
     * Registers Swagger CORS filter with Spring application context.
     *
     * @return the Filter registration bean for Camel Swagger CORS filter.
     */
    @Bean
    public FilterRegistrationBean camelSwaggerCorsFilterRegistration() {

        final RestSwaggerCorsFilter swaggerCorsFilter = new RestSwaggerCorsFilter();
        final FilterRegistrationBean filterRegistration = new FilterRegistrationBean();
        filterRegistration.setFilter(swaggerCorsFilter);

        LOGGER.info("Camel Swagger CORS Filter Registered");

        return filterRegistration;
    }

    private String removeLeadingSlash(String url) {
        return url.startsWith("/") ? url.substring(1) : url;
    }
}