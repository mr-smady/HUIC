package com.huic.authorservice;

import com.huic.authorservice.dto.Author;
import com.huic.authorservice.dto.AuthorMutation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
public class AuthorController {

    private final AuthorService authorService;

    public AuthorController(AuthorService authorService) {
        this.authorService = authorService;
    }

    @GetMapping
    public Flux<Author> findAll() {
        return authorService.findAll();
    }

    @GetMapping("/{id}")
    public Mono<Author> findById(@PathVariable Long id) {
        return authorService.findById(id);
    }

    @PostMapping
    public Mono<Author> create(AuthorMutation authorMutation) {
        return authorService.create(authorMutation);
    }

}
