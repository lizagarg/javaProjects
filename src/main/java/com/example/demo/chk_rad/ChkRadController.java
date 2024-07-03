package com.example.demo.chk_rad;

import java.net.URL;
import java.util.Optional;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;

public class ChkRadController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextField acdisplbl;

    @FXML
    private CheckBox aclbl;

    @FXML
    private RadioButton comlbl;

    @FXML
    private TextField disclbl;

    @FXML
    private TextField fandisplbl;

    @FXML
    private CheckBox fanlbl;

    @FXML
    private ToggleGroup grp1;

    @FXML
    private RadioButton houselbl;

    @FXML
    private TextField netlbl;

    @FXML
    private TextField unitdisplbl;

    @FXML
    private TextField unitlbl;

    int fans=0;
    int acs=0;
    @FXML
    void doInput(ActionEvent event) {
        TextInputDialog dialog = new TextInputDialog("");
        dialog.setTitle("Input Units");
        dialog.setContentText("Please enter number of units:");
        Optional<String> result = dialog.showAndWait();
        if (result.isPresent()) {
            if ((result.get()).equals("")) {
                this.showMyMsg("Fill Value");
            } else {
                fans = Integer.parseInt(result.get());
            }
        } else {
            this.showMyMsg("no");
        }
    }

    @FXML
    void doInputac(ActionEvent event) {
        TextInputDialog dialog = new TextInputDialog("");
        dialog.setTitle("Input Units");
        dialog.setContentText("Please enter number of units:");
        Optional<String> result = dialog.showAndWait();
        if (result.isPresent()) {
            if ((result.get()).equals("")) {
                this.showMyMsg("Fill Value");
            } else {
                acs = Integer.parseInt(result.get());
            }
        } else {
            this.showMyMsg("no");
        }
    }



    void showMyMsg(String msg) {
        Alert alert = new Alert(Alert.AlertType.WARNING);
        alert.setTitle("Warning");
        alert.setHeaderText("Header");
        alert.setContentText(msg);
        alert.showAndWait();
    }

    int bill=0;
    int fanbill=0;
    int acbill=0;
    int discount=0;
    int unitbill=0;

    @FXML
    void doCalBill(ActionEvent event) {
        bill=0;
        fanbill=0;
        acbill=0;
        unitbill=0;
        if (!this.fanlbl.isSelected() && !this.aclbl.isSelected() && !this.comlbl.isSelected() && !this.houselbl.isSelected()) {
            this.showMyMsg("Select the appropriate option for you");
        } else {
            if (this.fanlbl.isSelected()) {
                this.bill += 50*fans;
                this.fanbill = 50*fans;
            }

            if (this.aclbl.isSelected()) {
                this.bill += 100*acs;
                this.acbill = 100*acs;
            }

            if(this.houselbl.isSelected()) {
                if(unitlbl.getText().equals(String.valueOf(0))) {
                    this.bill += ((Integer.parseInt(unitlbl.getText()) * 10) * 10 / 100);
                    this.unitbill += (Integer.parseInt(unitlbl.getText()) * 10) * 10 / 100;
                    unitdisplbl.setText(String.valueOf(unitbill));
                } else {
                    this.bill+=0;
                    this.unitbill+=0;
                    unitdisplbl.setText(String.valueOf(unitbill));
                }

            }

            if(this.comlbl.isSelected()) {
                if (unitlbl.getText().equals(String.valueOf(0))) {
                    this.bill += ((Integer.parseInt(unitlbl.getText()) * 10) * 20 / 100);
                    this.unitbill += (Integer.parseInt(unitlbl.getText()) * 10) * 20 / 100;
                    unitdisplbl.setText(String.valueOf(unitbill));
                }
                else{
                    this.bill+=0;
                    this.unitbill+=0;
                    unitdisplbl.setText(String.valueOf(unitbill));
                }
            }

            this.netlbl.setText("" + this.bill);
            this.fandisplbl.setText(""+ this.fanbill);
            this.acdisplbl.setText(""+ this.acbill);
        }
    }





    @FXML
    void initialize() {
        assert acdisplbl != null : "fx:id=\"acdisplbl\" was not injected: check your FXML file 'ChkRadView.fxml'.";
        assert aclbl != null : "fx:id=\"aclbl\" was not injected: check your FXML file 'ChkRadView.fxml'.";
        assert comlbl != null : "fx:id=\"comlbl\" was not injected: check your FXML file 'ChkRadView.fxml'.";
        assert disclbl != null : "fx:id=\"disclbl\" was not injected: check your FXML file 'ChkRadView.fxml'.";
        assert fandisplbl != null : "fx:id=\"fandisplbl\" was not injected: check your FXML file 'ChkRadView.fxml'.";
        assert fanlbl != null : "fx:id=\"fanlbl\" was not injected: check your FXML file 'ChkRadView.fxml'.";
        assert grp1 != null : "fx:id=\"grp1\" was not injected: check your FXML file 'ChkRadView.fxml'.";
        assert houselbl != null : "fx:id=\"houselbl\" was not injected: check your FXML file 'ChkRadView.fxml'.";
        assert netlbl != null : "fx:id=\"netlbl\" was not injected: check your FXML file 'ChkRadView.fxml'.";
        assert unitdisplbl != null : "fx:id=\"unitdisplbl\" was not injected: check your FXML file 'ChkRadView.fxml'.";
        assert unitlbl != null : "fx:id=\"unitlbl\" was not injected: check your FXML file 'ChkRadView.fxml'.";

    }

}
