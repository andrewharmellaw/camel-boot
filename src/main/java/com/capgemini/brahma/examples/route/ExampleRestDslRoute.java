package com.capgemini.brahma.examples.route;

import org.apache.camel.LoggingLevel;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.model.rest.RestBindingMode;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * An example Camel REST DSL route which uses a Jetty binding as an HTTP listener, binds to JSON payloads, and exposes
 * Swagger API docs.
 *
 * The separate rest("...") and from("direct:...") implementation is a handy pattern as it separates the exposure of the
 * logic (the REST API) form its implementation (in from("direct:...").
 */
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

    @Value("${camel.route.endpoint}")
    private String otherCamelProperty;

    private final String camelPropertyKey = "{{camel.route.endpoint}}";

    @Override
    public void configure() throws Exception {

        restConfiguration()
                .component("servlet")
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
                .get().description("Get hello.").route()
                .to("direct:myroute");
        
        from("properties:camel.route.endpoint")
                .log(LoggingLevel.INFO, "Boom value is {{camel.route.endpoint}}")     //Just to show that it prints this property value here but doesn't accept the same format as route endpoint!! Weird!
        	    .transform(constant("BOOOOOOOM!!!!!"));

    }
}
