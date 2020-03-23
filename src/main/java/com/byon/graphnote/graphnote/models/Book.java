package com.byon.graphnote.graphnote.models;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

@Builder
@Component
public class Book {

    private String title;

    private String author;

    private Category category;

    private String theme;


}
