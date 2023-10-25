package com.huic.graphqlservice.authors;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Component
public class AuthorServiceClient {

    private final WebClient client;

    public AuthorServiceClient(@Qualifier("authorClient") WebClient authorClient) {
        this.client = authorClient;
    }

    public Flux<Author> authors() {
        return client.get()
                .retrieve()
                .bodyToFlux(Author.class);
    }

    public Mono<Author> createAuthor(AuthorMutation authorMutation) {
        return client.post()
                .bodyValue(authorMutation)
                .retrieve()
                .bodyToMono(Author.class);
    }

    public Mono<Author> findById(Long authorId) {
        return client.get()
                .uri("/" + authorId)
                .retrieve()
                .bodyToMono(Author.class);
    }
}
