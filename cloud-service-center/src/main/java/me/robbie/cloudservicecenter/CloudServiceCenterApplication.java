package me.robbie.cloudservicecenter;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
@Slf4j
public class CloudServiceCenterApplication {

    public static void main(String[] args) {

        SpringApplication.run(CloudServiceCenterApplication.class, args);
        log.info("Cloud service center(Eureka server) is started.");
    }

}

