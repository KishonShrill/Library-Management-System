module org.betteriligancity.lms {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.kordamp.ikonli.javafx;
    requires atlantafx.base;

    opens org.betteriligancity.lms to javafx.fxml;
    exports org.betteriligancity.lms;
    exports org.betteriligancity.lms.controller;
    opens org.betteriligancity.lms.controller to javafx.fxml;
}