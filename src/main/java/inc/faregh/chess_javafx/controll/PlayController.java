/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inc.faregh.chess_javafx.controll;

import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;

/**
 *
 * @author Amir
 */
public class PlayController implements Initializable {

    @FXML 
    private Button btns[][];
    
    @FXML
    private void action(ActionEvent e){
        
    }
    @Override
    public void initialize(URL location, ResourceBundle resources) {
        for(int i = 0 ; i<7 ; i++){
            for(int j = 0 ; j<7 ; j++){
                Button now = new Button();
                now.setId(Integer.toString(i)+","+Integer.toString(j));
                now.setOnAction(e->{
                    action(e);
                });
                btns[i][j] = now;
            }
        }
    }
}
