package com.huic.graphqlservice.authors;

import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

@Service
public class AuthorService {

    private final AuthorServiceClient client;

    public AuthorService(AuthorServiceClient client){
        this.client = client;
    }

    public Mono<Author> findById(Long authorId) {
        return client.findById(authorId);
    }
}
