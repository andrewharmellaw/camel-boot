package com.capgemini.brahma;

import org.apache.camel.spring.boot.FatJarRouter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

/**
 *
 * @author chackey
 */
@SpringBootApplication
public class Application extends FatJarRouter {

//    @Override
//    public void configure() throws Exception {
//        from("netty-http:http://0.0.0.0:18080").
//                setBody().simple("ref:helloWorld");
//    }

    @Bean
    String helloWorld() {
        return "helloWorld";
    }

}