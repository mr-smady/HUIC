package com.huic.authorservice;

import com.huic.authorservice.data.AuthorRepository;
import com.huic.authorservice.dto.Author;
import com.huic.authorservice.dto.AuthorMutation;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class AuthorService {

    private final AuthorRepository authorRepository;

    public AuthorService(AuthorRepository authorRepository) {
        this.authorRepository = authorRepository;
    }

    public Flux<Author> findAll() {
        return authorRepository.findAll().map(Author::new);
    }

    public Mono<Author> create(AuthorMutation authorMutation) {
        return authorRepository.save(authorMutation.toEntity()).map(Author::new);
    }

    public Mono<Author> findById(Long id) {
        return authorRepository.findById(id).map(a -> new Author(a));
    }
}
