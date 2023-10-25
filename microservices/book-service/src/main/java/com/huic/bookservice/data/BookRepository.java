package com.huic.bookservice.data;

import com.huic.bookservice.data.BookEntity;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepository extends ReactiveCrudRepository<BookEntity, Long> {

}
