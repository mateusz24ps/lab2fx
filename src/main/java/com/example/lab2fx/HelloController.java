package com.example.lab2fx;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class HelloController {
    @FXML
    private Label welcomeText;
    @FXML
    private TextField promien;
    @FXML
    private TextField wysokosc;
    @FXML
    private TextField grubosc;
    @FXML
    public Button btnMain;

    @FXML
    public void onBtnAction(ActionEvent actionEvent){
        System.out.println("");
    }
    int r,h,grub;
    public void submit(ActionEvent event){
        r = Integer.parseInt(promien.getText());
        h = Integer.parseInt(wysokosc.getText());
        grub = Integer.parseInt(grubosc.getText());
        System.out.println();
    }

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }
}