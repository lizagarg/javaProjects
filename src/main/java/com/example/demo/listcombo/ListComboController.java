package com.example.demo.listcombo;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.input.MouseEvent;

public class ListComboController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Label billdisplay;

    @FXML
    private ComboBox<String> comboItems;

    @FXML
    private ListView<String> listAvailableItems;

    @FXML
    private ListView<String> listAvailablePrice;

    @FXML
    private ListView<String> listSelectedItems;

    @FXML
    private ListView<String> listSelectedPrice;

    @FXML
    void calBill(ActionEvent event) {
    int bill=0;
    for(String prices: listSelectedPrice.getItems()) {
        bill+=Integer.parseInt(prices);
    }
        billdisplay.setText("Your Bill: "+ bill);
    }

    @FXML
    void doAddToCart(MouseEvent event) {
        if(event.getClickCount()==2) {
            listSelectedItems.getItems().add(listAvailableItems.getSelectionModel().getSelectedItem());
            listAvailablePrice.getSelectionModel().select(listAvailableItems.getSelectionModel().getSelectedIndex());
            listSelectedPrice.getItems().add(listAvailablePrice.getSelectionModel().getSelectedItem());
        }
    }

    String []burgerTypes={"Aloo Tikki", "Veg", "Non Veg"};
    String []burgerPrice={"100","150","200"};

    String []pizzaTypes={"Farmhouse", "Veg Loaded", "Onion"};
    String []pizzaPrice={"300","250","60"};



    @FXML
    void doFill(ActionEvent event) {
        listAvailableItems.getItems().clear();
        listAvailablePrice.getItems().clear();

        if(comboItems.getSelectionModel().getSelectedIndex()==1) {
            listAvailableItems.getItems().addAll(burgerTypes);
            listAvailablePrice.getItems().addAll(burgerPrice);
        }

        if(comboItems.getSelectionModel().getSelectedIndex()==2) {
            listAvailableItems.getItems().addAll(pizzaTypes);
            listAvailablePrice.getItems().addAll(pizzaPrice);
        }

        if(comboItems.getSelectionModel().getSelectedIndex()==0) {
            listAvailableItems.getItems().clear();
            listAvailablePrice.getItems().clear();
        }
    }

    @FXML
    void initialize() {
        String[] category ={"Select", "Burger", "Pizza"};
        comboItems.getItems().addAll(category);
        comboItems.getSelectionModel().select(0);

    }

}
