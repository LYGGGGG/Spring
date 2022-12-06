package com.tutorialspoint;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/*
@author YG
@create 2022/12/6   13:42
*/
//@Configuration
public class TextEditorConfig {
    @Bean
    public TextEditor textEditor() {
        return new TextEditor(spellChecker());
    }

    @Bean
    public SpellChecker spellChecker() {
        return new SpellChecker();
    }
}