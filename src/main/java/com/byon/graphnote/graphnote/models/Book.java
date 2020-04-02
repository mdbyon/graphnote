package com.byon.graphnote.graphnote.models;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Builder
@Document(collection = "books")
public class Book {

    @Id
    private String title;

    private String author;

    private Category category;

    private List<String> themes;

    private List<NoteEntry> noteEntryList;


}
