package com.byon.graphnote.graphnote.models;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class BookWeb {

    List<Book> books;

    public BookWeb(){
        this.books = new ArrayList<>();
    }
}
