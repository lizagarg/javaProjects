module com.example.demo {
    requires javafx.controls;
    requires javafx.fxml;

    requires com.dlsc.formsfx;

    opens com.example.demo to javafx.fxml;
    exports com.example.demo;

    exports com.example.demo.basics;
    opens com.example.demo.basics to javafx.fxml;

    exports com.example.demo.chk_rad;
    opens com.example.demo.chk_rad to javafx.fxml;

    exports com.example.demo.listcombo;
    opens com.example.demo.listcombo to javafx.fxml;

    exports com.example.demo.datepickerapp;
    opens com.example.demo.datepickerapp to javafx.fxml;

}