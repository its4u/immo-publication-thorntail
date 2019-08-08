package com.its4u.immo.publication.rest;

import org.jboss.arquillian.container.test.api.RunAsClient;
import org.jboss.arquillian.junit.Arquillian;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.wildfly.swarm.arquillian.DefaultDeployment;

import static io.restassured.RestAssured.get;
import static org.hamcrest.Matchers.equalTo;

@RunWith(Arquillian.class)
@DefaultDeployment
public class HelloWorldEndpointTest {

    @RunAsClient
    @Test
    public void testHello() {
        get("/hello")
        .then()
        .statusCode(200)
        .body("message", equalTo("Hello from Thorntail!"));
    }
}
