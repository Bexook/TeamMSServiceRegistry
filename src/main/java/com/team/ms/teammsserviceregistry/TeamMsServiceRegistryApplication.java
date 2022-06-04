package com.team.ms.teammsserviceregistry;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class TeamMsServiceRegistryApplication {

    public static void main(String[] args) {
        SpringApplication.run(TeamMsServiceRegistryApplication.class, args);
    }

}
