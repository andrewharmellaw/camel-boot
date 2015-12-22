package com.capgemini.brahma.examples.route;

import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.model.rest.RestBindingMode;
import org.springframework.stereotype.Component;

@Component
public class ExampleRestDslRoute extends RouteBuilder {

    @Override
    public void configure() throws Exception {

        Integer port = Integer.parseInt((System.getenv("PORT") != null ? System.getenv("PORT") : "10000"));
        
        restConfiguration()
                .component("netty4-http")
                .bindingMode(RestBindingMode.json)
                .dataFormatProperty("prettyPrint", "true")
                .host("0.0.0.0")
                .contextPath("/")
                .port(port)
                .apiContextPath("/api-doc")
                .apiProperty("api.title", "User API")
                .apiProperty("api.version", "1.2.3")
                .apiProperty("cors", "true");

        rest("/hello").description("Say hello.")
                .produces("application/json")
                .get().description("Get hello.").route().transform(constant("hello"));

//        // indicate that we want to use 'servlet' as the component for the rest DSL
//        // and we want to enable json binding mode
//        restConfiguration().component("jetty").bindingMode(RestBindingMode.json)
//                // and output using pretty print
//                .dataFormatProperty("prettyPrint", "true")
//                .contextPath("/rest").port(8080);
//
//        // this user REST service is json only
//        rest("/pets").description("Pet rest service")
//                .consumes("application/json").produces("application/json")
//
//                .get("/{id}").description("Find pet by id").outType(Pet.class)
//                .to("bean:petService?method=getPet(${header.id})");

    }
}
