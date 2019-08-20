package com.its4u.immo.publication.rest;

import org.eclipse.microprofile.health.HealthCheck;
import org.eclipse.microprofile.health.HealthCheckResponse;
import org.eclipse.microprofile.health.Readiness;

import javax.enterprise.context.ApplicationScoped;

@Readiness
@ApplicationScoped
public class ServiceReadinessHealthCheck implements HealthCheck {

    public HealthCheckResponse call() {
        return HealthCheckResponse.named("simple service readiness health check").up().build();
    }
}