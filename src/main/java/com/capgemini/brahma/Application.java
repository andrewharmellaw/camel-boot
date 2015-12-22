package com.capgemini.brahma;

import org.apache.camel.model.rest.RestBindingMode;
import org.apache.camel.spring.boot.FatJarRouter;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application extends FatJarRouter {

    private int port;

    public Application() {
        this.port = Integer.parseInt((System.getenv("PORT") != null ? System.getenv("PORT") : "10000"));
    }

//    @Override
//    public void configure() {
//
//        restConfiguration()
//                .component("netty4-http")
//                .bindingMode(RestBindingMode.json)
//                .dataFormatProperty("prettyPrint", "true")
//                .host("0.0.0.0")
//                .contextPath("/")
//                .port(port)
//                .apiContextPath("/api-doc")
//                .apiProperty("api.title", "User API")
//                .apiProperty("api.version", "1.2.3")
//                .apiProperty("cors", "true");
//
//        rest("/hello").description("Say hello.")
//                .produces("application/json")
//                .get().description("Get hello.").route().transform(constant("hello"));

//        rest("/hi").description("Say hi.")
//                .produces("application/json")
//                .get().description("Get hi.").route().transform(constant("hi"));
//    }

}