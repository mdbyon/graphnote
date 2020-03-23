package com.byon.graphnote.graphnote.api;

import com.byon.graphnote.graphnote.adapters.NoteManager;
import com.byon.graphnote.graphnote.models.NoteEntry;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

@RestController
public class NoteController {

    NoteManager noteManager;

    @Autowired
    public NoteController(NoteManager noteManager) {
        this.noteManager = noteManager;
    }

    @GetMapping(value = "/getNotes")
    public ResponseEntity<List<NoteEntry>> getNotes() {
        List<NoteEntry> noteEntries = new ArrayList<NoteEntry>();
        Set<String> set = noteManager.getPersistence().keySet();

        for (String id : set) {
            noteEntries.add(noteManager.getPersistence().get(id));
        }
        return new ResponseEntity<>(noteEntries, HttpStatus.ACCEPTED);
    }

    @PostMapping(value = "/postNote", consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Void> postNote(@RequestBody NoteEntry noteEntry) {
        noteManager.addNoteToSystem(noteEntry);
        return new ResponseEntity(HttpStatus.ACCEPTED);
    }

}
