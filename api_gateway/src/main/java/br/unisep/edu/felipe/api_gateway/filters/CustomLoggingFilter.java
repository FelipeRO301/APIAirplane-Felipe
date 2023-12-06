package br.unisep.edu.felipe.api_gateway.filters;

import org.springframework.cloud.gateway.filter.GatewayFilter;
import org.springframework.cloud.gateway.filter.factory.AbstractGatewayFilterFactory;
import org.springframework.stereotype.Component;

@Component
public class CustomLoggingFilter extends AbstractGatewayFilterFactory<CustomLoggingFilter.Config> {

    public CustomLoggingFilter() {
        super(Config.class);
    }

    @Override
    public GatewayFilter apply(Config config) {

        return (exchange, chain) -> {
            System.out.println("Custom Filter Logging: " + exchange.getRequest().getURI());
            return chain.filter(exchange);
        };
    }

    public static class Config {

    }
}