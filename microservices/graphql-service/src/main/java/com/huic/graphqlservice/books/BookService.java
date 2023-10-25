package com.huic.graphqlservice.books;

import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class BookService {

    private final BookServiceClient bookServiceClient;

    public BookService(BookServiceClient bookServiceClient) {
        this.bookServiceClient = bookServiceClient;
    }

    public Flux<Book> books() {
        return bookServiceClient.books();
    }

    public Mono<Book> createBook(BookMutation bookMutation) {
        return bookServiceClient.createBook(bookMutation);
    }

}
