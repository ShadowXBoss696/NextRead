package com.bookcorner.common.config;

import jakarta.annotation.PostConstruct;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.client.ConditionalOnDiscoveryEnabled;
import org.springframework.cloud.netflix.eureka.EurekaInstanceConfigBean;
import org.springframework.context.annotation.Configuration;

import java.util.Random;
import java.util.UUID;

@Configuration
@ConditionalOnDiscoveryEnabled
@RequiredArgsConstructor
public class EurekaInstanceConfig {

    private final EurekaInstanceConfigBean eurekaInstanceConfigBean;

    @Value("${spring.application.name}")
    private String appName;

    @PostConstruct
    public void postConstruct() throws Exception {
        String instanceId = appName + "-" + UUID.randomUUID().toString().substring(0, 8);
        eurekaInstanceConfigBean.setInstanceId(instanceId);
    }
}
