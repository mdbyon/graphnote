package com.byon.graphnote.graphnote.models;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@NoArgsConstructor
@Getter
@Setter
public class NoteEntry {

    private String id;
    private String theme;
    private LocalDateTime timestamp;
    private String note;
    private String bookTitle;

}
