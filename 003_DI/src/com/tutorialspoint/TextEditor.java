package com.tutorialspoint;

/*
@author YG
@create 2022/12/5   17:44
*/

public class TextEditor {
    private SpellChecker spellChecker;

    // 有参构造器
    public TextEditor(SpellChecker spellChecker) {
        System.out.println("Inside TextEditor constructor.");
        this.spellChecker = spellChecker;
    }

    public void spellCheck(){
        spellChecker.checkSpelling();
    }
}
