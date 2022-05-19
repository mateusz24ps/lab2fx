package com.example.lab2fx;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class HelloController {
    @FXML
    private TextField promien;
    @FXML
    private TextField wysokosc;
    @FXML
    private TextField grubosc;
    @FXML
    private TextArea stal;
    @FXML
    private TextArea nier;


    @FXML
    int r,h,grub;
    @FXML

    public void submit(ActionEvent event){
        r = Integer.parseInt(promien.getText());
        h = Integer.parseInt(wysokosc.getText());
        grub = Integer.parseInt(grubosc.getText());

        Double pole = (2*3.14*r*r+2*3.14*r*h);

        stal.setText("Stal waży: " + Double.toString(pole*7.85) + " kg. I kosztuje: " + (pole*10*3) +" zł.");

        //nier.setText(toString("Stal nierdzewna waży: " + pole*7.85 +" kg."));

        nier.setText("Stal nierdzewna waży: " + Double.toString(pole*10) + " kg. I kosztuje: " + (pole*10*5) +" zł.");
    }


}