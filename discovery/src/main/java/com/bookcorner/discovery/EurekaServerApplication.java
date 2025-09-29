package com.bookcorner.discovery;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * Eureka Server Application
 *
 * <p>Acts as a service registry for microservices in the BookCorner platform,
 * enabling service discovery and load balancing.</p>
 *
 * @author BookCorner Team
 */
@SpringBootApplication
@EnableEurekaServer
public class EurekaServerApplication {

    /**
     * Main method to bootstrap the Eureka Server application
     *
     * @param args command-line arguments
     */
    public static void main(String[] args) {
        SpringApplication.run(EurekaServerApplication.class, args);
    }
}
