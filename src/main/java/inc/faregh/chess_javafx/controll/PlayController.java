/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inc.faregh.chess_javafx.controll;

import static inc.faregh.chess_javafx.modle.App.pieces;
import inc.faregh.chess_javafx.modle.Color;
import inc.faregh.chess_javafx.modle.pieces;
import inc.faregh.chess_javafx.modle.stats;
import java.lang.reflect.Array;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderStrokeStyle;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

/**
 *
 * @author Amir
 */
public class PlayController{

    private Button select;

    private HBox rows[];

    private boolean isselected;

    private Color turn;

    @FXML
    private VBox board;

    @FXML
    public void initialize(){
        init();
    }

    @FXML
    private void action(ActionEvent e){
        Button click = (Button) e.getSource();
        String butid = click.getId();
        pieces pic;
        if(isselected){
            if(go(select,click)){
                changeturn();
            }
            removebords();
            isselected = false;
        }else{
            if(pieces.containsKey(butid)){
                pic = pieces.get(butid);
                if(pic.getColor()==turn){
                    select = click;
                    select.getStyleClass().add("select");
                    initborders(pic);
                    isselected = true;
                }
            }
        }
    }

    private String makeid(int i, int j){
        return Integer.toString(i)+","+Integer.toString(j);
    }

    private void init() {
        isselected = false;
        turn = Color.w;
        rows = (HBox[])Array.newInstance(HBox.class, 8);

        double prefheight = board.getPrefHeight();
        double prefwidth = board.getPrefWidth();
        for(int i = 0 ; i<8 ; i++){
            rows[i]=new HBox();
            rows[i].setPrefSize(prefwidth, prefheight);
            for(int j = 0 ; j<8 ; j++){
                Button here = new Button();
                here.setPrefSize(prefwidth, prefheight);
                here.setId(makeid(i,j));
                here.setOnAction(this::action);
                here.setStyle("");
                if(pieces.containsKey(here.getId())){
                    setclass(here);
                }
                if((i+j)%2==0){
                    here.getStyleClass().add("odd");
                }else{
                    here.getStyleClass().add("not_odd");
                }
                rows[i].getChildren().add(here);
            }
            board.getChildren().add(rows[i]);
        }
    }

    private void setclass(Button here) {
        switch(pieces.get(here.getId()).getType()){
            case r:
                here.getStyleClass().add("rook");
                break;
            case b:
                here.getStyleClass().add("bishop");
                break;
            case n:
                here.getStyleClass().add("knight");
                break;
            case k:
                here.getStyleClass().add("king");
                break;
            case q:
                here.getStyleClass().add("queen");
                break;
            case p:
                here.getStyleClass().add("pawn");
                break;
        }
        switch(pieces.get(here.getId()).getColor()){
            case w:
                here.getStyleClass().add("white");
                break;
            case b:
                here.getStyleClass().add("black");
                break;
        }
    }

    private void initborders(pieces pic) {
        for(int i = 0 ; i<8 ; i++){
            for(int j = 0 ; j<8 ; j++){
                stats now = pic.where(pieces.values().toArray(new pieces[pieces.size()]))[i][j];
                rows[i].getChildren().get(j).getStyleClass().add(getbordclass(now));
            }
        }
    }

    private String getbordclass(stats now){
        String result = null;
        switch(now){
            case u:
                result = "usual";
                break;
            case k:
                result = "kick";
                break;
        }
        return result;
    }

    private void removebords() {
        for(int i = 0 ; i<8 ; i++){
            for(int j = 0 ; j<8 ; j++){
                rows[i].getChildren().get(j).getStyleClass().remove("select");
                rows[i].getChildren().get(j).getStyleClass().remove("usual");
                rows[i].getChildren().get(j).getStyleClass().remove("kick");
            }
        }
    }

    private void changeturn() {
        if(turn==Color.w){
            turn = Color.b;
        }else{
            turn = Color.w;
        }
    }

    private boolean go(Button select, Button click) {
        boolean result = false;
        try{
            BorderStrokeStyle click_stroke = click.getBorder().getStrokes().get(0).getBottomStyle();
            if(click_stroke.equals(BorderStrokeStyle.DASHED)//usual
            ||click_stroke.equals(BorderStrokeStyle.DOTTED)){//kick
                result = true;
                go_to(select,click);
            }
        }catch(Exception e){}
        return result;
    }

    private void go_to(Button select, Button click) {
        pieces pic = pieces.get(select.getId());
        String type = pic.getType().toString();
        String color = pic.getColor().toString();

        try{
        pieces click_pic = pieces.get(click.getId());
        String click_type = click_pic.getType().toString();
        String click_color = click_pic.getColor().toString();
        click.getStyleClass().removeAll(click_type,click_color);
        }catch(Exception e){}

        pic.setButid(click.getId());
        pieces.remove(select.getId());
        pieces.put(click.getId(), pic);

        select.getStyleClass().removeAll(type,color);
        click.getStyleClass().addAll(type,color);
    }

}