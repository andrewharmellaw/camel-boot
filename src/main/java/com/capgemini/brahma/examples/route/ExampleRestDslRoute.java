package com.capgemini.brahma.examples.route;

import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.model.rest.RestBindingMode;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class ExampleRestDslRoute extends RouteBuilder {

	
    @Value("${rest.api.base.url:/api/v1}")
    private String restApiBaseUrl;

    @Value("${rest.api.version:/v1}")
    private String restApiVersion;
    
    @Value("${rest.api.title:Example API}")
    private String restApiTitle;
    
    @Value("${rest.api.description:The example REST API in Brahma}")
    private String restApiDesc;
    
    @Override
    public void configure() throws Exception {

        // TODO: this should be loaded from config
        Integer port = Integer.parseInt((System.getenv("PORT") != null ? System.getenv("PORT") : "10000"));

        restConfiguration()
                .component("jetty")
                .bindingMode(RestBindingMode.json)
                .dataFormatProperty("prettyPrint", "true")
                .host("0.0.0.0")
                .contextPath(restApiBaseUrl)
                .port(port)
                .apiContextPath("/api-doc")
                .apiProperty("api.description", restApiDesc)
                .apiProperty("api.title", restApiTitle)
                .apiProperty("api.version", restApiVersion) 
                .apiProperty("cors", "true");

        rest("/hello").description("Say hello.")
                .produces("application/json")
                .get().description("Get hello.").route().transform(constant("BOOOOOOOM!!!!!"));

    }
}
