/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inc.faregh.chess_javafx.controll;

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
        System.out.println(pieces.get(click.getId()));
    }

    @FXML
    public void initialize(){
        HBox boardhirozental[] = {new HBox(),new HBox(),new HBox(),new HBox(),new HBox(),new HBox(),new HBox(),new HBox()}; 
        for(int i = 0 ; i<7 ; i++){
            boardhirozental[i].setPrefSize(board.getPrefWidth(),board.getPrefHeight()/8);
            for(int j = 0 ; j<7 ; j++){
                Button here = new Button();
                here.setPrefSize(boardhirozental[i].getPrefWidth(),boardhirozental[i].getPrefHeight());
                here.setId(setid(i,j));
                here.setOnAction(e->{
                    action(e);
                });
                boardhirozental[i].getChildren().add(here);
                btns[i][j]=here;
            }
            board.getChildren().add(boardhirozental[i]);
        }
        for(int i = 0 ; i<7 ; i++){
            for(int j = 0 ; j<7 ; j++){
                if(pieces.get(setid(i,j))!=null){
                    try {
                        pieces.get(setid(i,j)).seticon(btns[i][j]);
                    } catch (Exception ex) {System.out.println(ex.getMessage());}
                }
            }
        }
    }

    private String setid(int i, int j){
        return Integer.toString(i)+","+Integer.toString(j);
    }

}
