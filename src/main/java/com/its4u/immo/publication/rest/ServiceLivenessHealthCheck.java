package com.its4u.immo.publication.rest;

import org.eclipse.microprofile.health.HealthCheck;
import org.eclipse.microprofile.health.HealthCheckResponse;
import org.eclipse.microprofile.health.Liveness;

import javax.enterprise.context.ApplicationScoped;

@Liveness
@ApplicationScoped
public class ServiceLivenessHealthCheck implements HealthCheck {

    public HealthCheckResponse call() {
        return HealthCheckResponse.named("simple service liveness health check").up().build();
    }
}