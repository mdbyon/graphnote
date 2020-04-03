package com.byon.graphnote.graphnote.controllers;

import com.byon.graphnote.graphnote.models.Book;
import com.byon.graphnote.graphnote.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class BookController {

    @Autowired
    BookRepository bookRepository;

    @GetMapping(value = "/books", produces = MediaType.APPLICATION_JSON_VALUE)
    public @ResponseBody ResponseEntity<List<Book>> showAllBooks(){
        List<Book> currBooks = bookRepository.findAll();
        return new ResponseEntity<>(currBooks, HttpStatus.ACCEPTED);
    }

    @GetMapping(value = "/books/{title}", produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public Book findBook(@PathVariable String title){
        return bookRepository.findByTitle(title);
    }



}
