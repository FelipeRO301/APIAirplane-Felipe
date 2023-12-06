package br.unisep.edu.felipe.api_gateway.config;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GatewayConfig {

    @Bean
    public RouteLocator customRouteLocator(RouteLocatorBuilder builder) {
        return builder.routes()
                .route("ordem-compra-service", r -> r.path("/ordem-compra/**")
                        .uri("http://localhost:8081"))
                .route("preco-passagem-service", r -> r.path("/preco-passagem/**")
                        .uri("http://localhost:8082"))

                .build();
    }
}