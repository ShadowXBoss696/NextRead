package com.bookcorner.configserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * Spring Cloud Config Server Application
 *
 * <p>Provides centralized configuration management for microservices
 * in the BookCorner platform. Integrates with Eureka for service discovery
 * and serves configuration from native filesystem storage.</p>
 *
 * @author BookCorner Team
 */
@SpringBootApplication
@EnableConfigServer
@EnableDiscoveryClient
public class ConfigServerApplication {

    /**
     * Main method to bootstrap the Config Server application
     *
     * @param args command-line arguments
     */
    public static void main(String[] args) {
        SpringApplication.run(ConfigServerApplication.class, args);
    }
}
