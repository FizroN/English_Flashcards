package com.projekt.english_kind_of_flashcards.model;

import java.util.ArrayList;

public class Category {
    private ArrayList<Flashcard> flashcards;
    public Category(ArrayList<Flashcard> flashcard) {
        this.flashcards = flashcard;
    }
    public Category() {
        this.flashcards = new ArrayList<>();
    }
    public ArrayList<Flashcard> getFlashcards() {
        return flashcards;
    }
    public void setFlashcards(ArrayList<Flashcard> flashcard) {
        this.flashcards = flashcard;
    }
}
