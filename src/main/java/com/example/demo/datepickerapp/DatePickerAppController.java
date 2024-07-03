package com.example.demo.datepickerapp;

import java.net.URL;
import java.time.LocalDate;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;

public class DatePickerAppController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private DatePicker dtpicker;

    @FXML
    private Label outputDate;

    @FXML
    void doShowDate(ActionEvent event) {
        String dt= dtpicker.getEditor().getText();
        outputDate.setText(dt);
        LocalDate dtt= dtpicker.getValue();
        String str=dtt.getMonth()+" "+ dtt.getDayOfMonth()+"  "+ dtt.getYear();
        outputDate.setText(str);
    }

    @FXML
    void initialize() {
        assert dtpicker != null : "fx:id=\"dtpicker\" was not injected: check your FXML file 'DatePickerAppView.fxml'.";
        assert outputDate != null : "fx:id=\"outputDate\" was not injected: check your FXML file 'DatePickerAppView.fxml'.";

    }

}
