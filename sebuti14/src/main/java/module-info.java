module com.example.sebuti14 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.sebuti14 to javafx.fxml;
    exports com.example.sebuti14;
}