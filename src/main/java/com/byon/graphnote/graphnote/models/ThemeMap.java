package com.byon.graphnote.graphnote.models;

import lombok.Builder;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Component
public class ThemeMap {

    Map<String, List<Book>> themeMap;

    public ThemeMap(){
        this.themeMap = new HashMap<>();
    }

}
