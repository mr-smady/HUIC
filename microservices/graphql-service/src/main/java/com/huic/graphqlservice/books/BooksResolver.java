package com.huic.graphqlservice.books;

import com.huic.graphqlservice.authors.Author;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.graphql.data.method.annotation.SchemaMapping;
import org.springframework.stereotype.Controller;
import org.springframework.graphql.data.method.annotation.Argument;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.logging.Logger;


@Controller
public class BooksResolver {

    private static final Logger log = Logger.getLogger(BooksResolver.class.getSimpleName());

    private final BookService bookService;

    public BooksResolver(BookService bookService){

        this.bookService = bookService;
    }

    @QueryMapping
    public Flux<Book> books(){
//        return Flux.fromArray(new Book[]{
//           new Book(1L, "Book1", 1L),
//           new Book(2L, "Book2", 2L),
//        });

        return bookService.books();

    }

    @MutationMapping
    public Mono<Book> createBook(@Argument BookMutation book){
        log.info("bookMutation = "+ book);
        return bookService.createBook(book);
    }

}
