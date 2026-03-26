module com.cmc.bai410 {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.cmc.bai410 to javafx.fxml;
    exports com.cmc.bai410;
}
