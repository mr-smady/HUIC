package com.huic.graphqlservice;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.web.reactive.function.client.WebClient;

import java.util.logging.Logger;

@Configuration(proxyBeanMethods = false)
public class ServiceClientConfig {

    private static final Logger log = Logger.getLogger(ServiceClientConfig.class.getSimpleName());

    private final GraphqlServiceProperties properties;

    public ServiceClientConfig(GraphqlServiceProperties properties){
        this.properties = properties;
    }
    @Bean("bookClient")
    public WebClient bookClient() {
        log.info(properties.getBookServiceEndpoint());
        return WebClient.builder()
                .baseUrl(properties.getBookServiceEndpoint())
                .defaultHeader(HttpHeaders.CONTENT_TYPE, MediaType.APPLICATION_JSON_VALUE)
                .defaultHeader(HttpHeaders.ACCEPT, MediaType.APPLICATION_JSON_VALUE)
                .build();
    }

    @Bean("authorClient")
    public WebClient authorClient() {
        log.info(properties.getBookServiceEndpoint());
        return WebClient.builder()
                .baseUrl(properties.getAuthorServiceEndpoint())
                .defaultHeader(HttpHeaders.CONTENT_TYPE, MediaType.APPLICATION_JSON_VALUE)
                .defaultHeader(HttpHeaders.ACCEPT, MediaType.APPLICATION_JSON_VALUE)
                .build();
    }
}
