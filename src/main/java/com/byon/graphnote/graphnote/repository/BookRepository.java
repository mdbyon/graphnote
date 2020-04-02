package com.byon.graphnote.graphnote.repository;

import com.byon.graphnote.graphnote.models.Book;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface BookRepository extends MongoRepository<Book, String> {

    public Book findByTitle(String title);

}
