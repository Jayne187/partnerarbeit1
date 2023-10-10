module com.example.apr_medienbibliothek {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.apr_medienbibliothek to javafx.fxml;
    exports com.example.apr_medienbibliothek;
}