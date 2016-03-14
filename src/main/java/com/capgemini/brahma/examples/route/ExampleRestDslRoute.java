package com.capgemini.brahma.examples.route;

import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.model.rest.RestBindingMode;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class ExampleRestDslRoute extends RouteBuilder {

	
    @Value("${rest.api.base.url}")
    private String restApiBaseUrl;

    @Value("${rest.api.version}")
    private String restApiVersion;
    
    @Value("${rest.api.title}")
    private String restApiTitle;
    
    @Value("${rest.api.description}")
    private String restApiDesc;

    @Value("${rest.api.port}")
    private String restApiPort;
    
    @Override
    public void configure() throws Exception {

        restConfiguration()
                .component("netty4-http")
                .bindingMode(RestBindingMode.json)
                .dataFormatProperty("prettyPrint", "true")
                .host("0.0.0.0")
                .contextPath(restApiBaseUrl)
                .port(restApiPort)
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
