package com.frostmaster.email;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Slf4j
@EnableEurekaClient
@SpringBootApplication
@EnableJpaRepositories
public class Application {

    public static void main(String[] args) {
        log.info("Version: {}", Application.class.getPackage().getImplementationVersion());
        SpringApplication.run(Application.class, args);
    }
}