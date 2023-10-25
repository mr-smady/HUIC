package com.huic.graphqlservice.authors;

import com.huic.graphqlservice.books.Book;
import org.springframework.graphql.data.method.annotation.SchemaMapping;
import org.springframework.stereotype.Controller;
import reactor.core.publisher.Mono;

@Controller
public class AuthorResolver {

    private final AuthorService authorService;

    public AuthorResolver(AuthorService authorService){
        this.authorService = authorService;
    }

    @SchemaMapping(typeName="Book", field="author")
    public Mono<Author> bookAuthor(Book book){
        return authorService.findById(book.getAuthorId());
    }

}
