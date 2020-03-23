package com.byon.graphnote.graphnote.adapters;

import com.byon.graphnote.graphnote.models.Book;
import com.byon.graphnote.graphnote.models.NoteEntry;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Component
public class NoteManager {

    Map<String, NoteEntry> tempPersistence;

    @Autowired
    BookManager bookManager;

    public NoteManager(){
        this.tempPersistence = new HashMap<>();
    }

    public void addNoteToSystem(NoteEntry noteEntry){
        tempPersistence.put(noteEntry.getId(), noteEntry);
        createAnEntryForItsBook(noteEntry.getBookTitle());
    }

    private void createAnEntryForItsBook(String title){
        if(!bookManager.tempPersistence.containsKey(title)){
            Book currentBook = Book.builder().title(title).build();
            bookManager.tempPersistence.put(title, currentBook);
        }
    }

    public Map<String, NoteEntry> getPersistence(){
        return this.tempPersistence;
    }
}
