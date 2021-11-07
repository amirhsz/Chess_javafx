/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inc.faregh.chess_javafx.controll;

import static inc.faregh.chess_javafx.controll.MainController.hide;
import java.io.IOException;  
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;
import javafx.scene.control.ToggleGroup;
import javafx.stage.Stage;

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
        try {
            /*JSONObject config = new JSONObject(System.getProperty("user.dir")+"\\config.json");
            config.append("time", slider.getValue());
            config.append("Theme", group.getSelectedToggle());*/
            Parent play = FXMLLoader.load(getClass().getResource("/fxml/Play.fxml"));
            Stage playstg = new Stage();
            playstg.setScene(new Scene(play));
            playstg.setTitle("Play");
            playstg.show();
            hide(e);
        } catch (IOException ex) {System.out.println(ex.getMessage());}
    }
    public void initialize() {
        slider.valueProperty().addListener((observable, oldValue, newValue) -> {
            time.setText("Time: "+newValue.intValue()+" min");
        });
    }

}
