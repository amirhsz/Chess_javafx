/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inc.faregh.chess_javafx.controll;

import java.io.FileWriter;
import java.io.IOException;  
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;
import javafx.scene.control.ToggleGroup;

public class Genrate_game {

    @FXML
    private Slider slider;

    @FXML
    private Button start;

    @FXML
    private Label time;

    @FXML
    private ToggleGroup group;

    public void saveaction(ActionEvent e){
        try{
            FileWriter config = new FileWriter(this.getClass().getResource("").getPath()+".config");
            config.write("hi");
        }catch(IOException ex){
            System.out.println(ex.getMessage());
        }
    }
    public void initialize() {
        slider.valueProperty().addListener((observable, oldValue, newValue) -> {
            time.setText("Time: "+newValue.intValue()+" min");
        });
    }

}
