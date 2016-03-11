package com.capgemini.brahma.examples.route;

import org.apache.camel.LoggingLevel;
import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;

/**
 * Route for JMS example to produce and consume messages from queue
 * @author - Santosh Singh
 */
@Component
public class ExampleJmsRoute extends RouteBuilder{

    @Override
    public void configure() throws Exception {

        //Producer
        from("timer://jmsTimer?fixedRate=true&period=60000")
            .routeId("jmsProducerRoute")
            .setBody()
            .simple("helloWorld at ${date:now:yyyy-MM-dd HH:mm:ss}")
            .log(LoggingLevel.INFO, "${body}")
            .to("activemq:queue:testQueue"); // TODO: load this from properties

        //Consumer
        from("activemq:queue:testQueue")
            .routeId("jmsConsumerRoute")
            .log(LoggingLevel.INFO, "${body}");
    }

}
