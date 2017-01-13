package com.capgemini.brahma.examples.route;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.boot.test.WebIntegrationTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.junit4.SpringRunner;

import com.capgemini.brahma.Application;
import com.jayway.restassured.RestAssured;

import static com.jayway.restassured.RestAssured.when;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.springframework.boot.test.context.SpringBootTest.WebEnvironment.DEFINED_PORT;

/**
 * An example integraiton test which uses RESTAssured.
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = Application.class, webEnvironment= DEFINED_PORT)
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
