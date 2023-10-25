package com.huic.bookservice;

import com.huic.bookservice.dto.Book;
import com.huic.bookservice.dto.BookMutation;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.logging.Logger;

@RestController
public class BookController {

    private static final Logger log = Logger.getLogger(BookController.class.getSimpleName());

    private final BookService bookService;

    public BookController(BookService bookService) {
        this.bookService = bookService;
    }

    @GetMapping
    public Flux<Book> findAll() {
        return bookService.findAll();
    }

    @PostMapping
    public ResponseEntity<Mono<Book>> create(@RequestBody BookMutation bookMutation) {
        log.info(bookMutation.toString());
        return new ResponseEntity<>(bookService.create(bookMutation), HttpStatus.CREATED);
    }

}
