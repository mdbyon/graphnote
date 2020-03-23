package com.byon.graphnote.graphnote.adapters;

import com.byon.graphnote.graphnote.models.Book;
import com.byon.graphnote.graphnote.models.NoteEntry;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Component
public class BookManager {

    Map<String, Book> tempPersistence;

    public BookManager(){
        this.tempPersistence = new HashMap<>();
    }

    public void addBookToSystem(Book noteEntry){

    }
}
