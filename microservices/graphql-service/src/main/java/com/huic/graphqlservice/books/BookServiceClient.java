package com.huic.graphqlservice.books;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Component
public class BookServiceClient {
    private final WebClient client;

    public BookServiceClient(@Qualifier("bookClient") WebClient client) {
        this.client = client;
    }

    public Flux<Book> books() {
        return client.get()
                .retrieve()
                .bodyToFlux(Book.class);
    }

    public Mono<Book> createBook(BookMutation bookMutation) {
        return client.post()
                .bodyValue(bookMutation)
                .retrieve()
                .bodyToMono(Book.class);
    }

}
