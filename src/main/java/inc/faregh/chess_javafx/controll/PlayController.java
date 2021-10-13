/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inc.faregh.chess_javafx.controll;

import inc.faregh.chess_javafx.modle.*;
import static inc.faregh.chess_javafx.modle.App.pieces;
import java.lang.reflect.Array;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

/**
 *
 * @author Amir
 */
public class PlayController{

    private Button btns[][]=(Button[][]) Array.newInstance((Button.class),8,8);

    @FXML
    private VBox board;

    @FXML
    private void action(ActionEvent e){
        Button click = (Button)e.getSource();
        System.out.println(click.getId());
    }

    @FXML
    public void initialize(){
        HBox boardhirozental[] = {new HBox(),new HBox(),new HBox(),new HBox(),new HBox(),new HBox(),new HBox(),new HBox()}; 
        for(int i = 0 ; i<7 ; i++){
            boardhirozental[i].setPrefHeight(Integer.MAX_VALUE);
            for(int j = 0 ; j<7 ; j++){
                Button here = new Button();
                here.setPrefSize(Integer.MAX_VALUE,Integer.MAX_VALUE);
                here.setId(setid(i,j));
                here.setOnAction(e->{
                    action(e);
                });
                btns[i][j]=here;
                boardhirozental[i].getChildren().add(here);
            }
            board.getChildren().add(boardhirozental[i]);
        }
    }

    private String setid(int i, int j){
        return Integer.toString(i)+","+Integer.toString(j);
    }

}
