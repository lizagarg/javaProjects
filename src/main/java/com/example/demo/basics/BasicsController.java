package com.example.demo.basics;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class BasicsController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextField lbla;

    @FXML
    private TextField lblans;

    @FXML
    private TextField lblb;

    @FXML
    void doClear(ActionEvent event) {
        lblans.setText(" ");
    }

    @FXML
    void doMult(ActionEvent event) {
        int a = Integer.parseInt(lbla.getText());
        int b = Integer.parseInt(lblb.getText());
        int result = a * b;
        lblans.setText(String.valueOf(result));
    }

    @FXML
    void doSum(ActionEvent event) {
        int a = Integer.parseInt(lbla.getText());
        int b = Integer.parseInt(lblb.getText());
        int result = a + b;
        lblans.setText(String.valueOf(result));
    }

    @FXML
    void initialize() {
        assert lbla != null : "fx:id=\"lbla\" was not injected: check your FXML file 'BasicsView.fxml'.";
        assert lblans != null : "fx:id=\"lblans\" was not injected: check your FXML file 'BasicsView.fxml'.";
        assert lblb != null : "fx:id=\"lblb\" was not injected: check your FXML file 'BasicsView.fxml'.";

    }

}
