package com.its4u.immo.publication.rest;

import javax.enterprise.context.ApplicationScoped;

import org.eclipse.microprofile.health.*;

@Liveness
@ApplicationScoped
public class ServiceLivenessHealthCheck implements HealthCheck {

    public HealthCheckResponse call() {
        return HealthCheckResponse.named("simple service liveness health check").up().build();
    }
}