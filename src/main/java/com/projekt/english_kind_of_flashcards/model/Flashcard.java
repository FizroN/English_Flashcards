package com.projekt.english_kind_of_flashcards.model;

import java.util.ArrayList;

public class Flashcard {
    private String phrase;
    private ArrayList<String> translations = new ArrayList<>();
    public Flashcard(String phrase, ArrayList<String> translations) {
        this.phrase = phrase;
        this.translations = translations;
    }
    public Flashcard() {
        this.phrase = null;
        this.translations = new ArrayList<>();
    }
    public String getPhrase() {
        return phrase;
    }
    public ArrayList<String> getTranslations() {
        return translations;
    }
    public void setPhrase(String phrase) {
        this.phrase = phrase;
    }
    public void setTranslations(ArrayList<String> translations) {
        this.translations = translations;
    }
}
