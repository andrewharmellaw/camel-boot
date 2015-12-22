package com.capgemini.brahma.examples.route;

import org.apache.camel.LoggingLevel;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.model.rest.RestBindingMode;
import org.springframework.stereotype.Component;

@Component
public class ExampleNettyRoute extends RouteBuilder {

    /**
     * Test this by running the app (e.g. ./gradlew bootRun) and hitting http://localhost:18080)
     * @throws Exception
     */
//    @Override
//    public void configure() throws Exception {
//
//        from("jetty:http://0.0.0.0:18080"). // TODO: load this from properties, the hostname and the port (then use in tests)
//                setBody().simple("helloWorld");
//    }


    @Override
    public void configure() throws Exception {

//        // indicate that we want to use 'servlet' as the component for the rest DSL
//        // and we want to enable json binding mode
//        restConfiguration().component("servlet").bindingMode(RestBindingMode.json)
//                // and output using pretty print
//                .dataFormatProperty("prettyPrint", "true").port(1111).host("localhost");
//
//        rest("/rest")
//                .get("/hello").to("direct:hello")
//                .get("/bye").consumes("application/json").to("direct:bye")
//                .post("/bye").to("mock:update");
//
//        from("direct:hello")
//                .log(LoggingLevel.INFO, "Called direct:hello")
//                .transform().constant("Hello World");
//        from("direct:bye")
//                .transform().constant("Bye World");

    }

}
