package com.huic.bookservice;

import com.huic.bookservice.data.BookRepository;
import com.huic.bookservice.dto.Book;
import com.huic.bookservice.dto.BookMutation;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class BookService {

    private final BookRepository bookRepository;

    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public Flux<Book> findAll() {
        return bookRepository.findAll().map(b -> new Book(b));
    }

    public Mono<Book> create(BookMutation bookMutation) {
        return bookRepository.save(bookMutation.toEntity()).map(b -> new Book(b));
    }
}
