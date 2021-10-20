module com.example.demo28 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.demo28 to javafx.fxml;
    exports com.example.demo28;
}