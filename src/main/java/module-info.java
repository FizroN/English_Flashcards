module com.projekt.english_kind_of_flashcards {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.projekt.english_kind_of_flashcards to javafx.fxml;
    exports com.projekt.english_kind_of_flashcards;
}