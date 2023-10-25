package com.huic.authorservice.data;

import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AuthorRepository extends ReactiveCrudRepository<AuthorEntity, Long> {
}
