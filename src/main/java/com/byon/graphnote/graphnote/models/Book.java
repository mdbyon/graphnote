package com.byon.graphnote.graphnote.models;

import lombok.*;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Builder
public class Book {

    private String title;

    private String author;

    private Category category;

    private List<String> themes;

    private List<NoteEntry> noteEntryList;



}
