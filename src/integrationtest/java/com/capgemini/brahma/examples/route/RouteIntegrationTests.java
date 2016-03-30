package com.capgemini.brahma.examples.route;

import com.jayway.restassured.RestAssured;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.boot.test.WebIntegrationTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import com.capgemini.brahma.Application;

import static com.jayway.restassured.RestAssured.when;
import static org.hamcrest.CoreMatchers.equalTo;

/**
 * An example integraiton test which uses RESTAssured.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = Application.class)
@WebIntegrationTest("server.port:1111")
public class RouteIntegrationTests {

    @Before
    public void setUp() throws Exception {
        RestAssured.baseURI = "http://localhost";
    }

    @Test
    public void restGetHelloTest() throws Exception {
        RestAssured.port = 1111;  // TODO  : this should be loaded from config
        when().get("/api/v1/hello").then().body(equalTo("\"BOOOOOOOM!!!!!\""));
    }

}
