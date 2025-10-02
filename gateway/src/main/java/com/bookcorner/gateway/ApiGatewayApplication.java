package com.bookcorner.gateway;

import com.bookcorner.common.Globals;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.ComponentScan;

/**
 * API Gateway Application
 *
 * <p>Serves as the entry point for all client requests to the BookCorner platform,
 * routing requests to appropriate microservices and handling cross-cutting concerns.</p>
 *
 * @author BookCorner Team
 */
@SpringBootApplication
@ComponentScan(basePackages = Globals.BASE_PACKAGE)
@EnableDiscoveryClient
public class ApiGatewayApplication {

    /**
     * Main method to bootstrap the API Gateway application
     *
     * @param args command-line arguments
     */
    public static void main(String[] args) {
        SpringApplication.run(ApiGatewayApplication.class, args);
    }
}
