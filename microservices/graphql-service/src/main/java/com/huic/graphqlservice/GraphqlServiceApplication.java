package com.huic.graphqlservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties(GraphqlServiceProperties.class)
public class GraphqlServiceApplication {
    public static void main(String[] args) {
        SpringApplication.run(GraphqlServiceApplication.class, args);
    }

}
