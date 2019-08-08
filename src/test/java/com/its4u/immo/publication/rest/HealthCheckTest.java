package com.its4u.immo.publication.rest;

import org.jboss.arquillian.container.test.api.RunAsClient;
import org.jboss.arquillian.junit.Arquillian;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.wildfly.swarm.arquillian.DefaultDeployment;

import static io.restassured.RestAssured.get;
import static org.hamcrest.Matchers.equalTo;

@RunWith(Arquillian.class)
@DefaultDeployment(type = DefaultDeployment.Type.JAR)
public class HealthCheckTest {

    @RunAsClient
    @Test
    public void testHealth() {
        get("/health")
                .then()
                .statusCode(200)
                .body("status", equalTo("UP"));
    }
}
