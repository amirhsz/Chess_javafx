/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inc.faregh.chess_javafx.controll;

import static inc.faregh.chess_javafx.modle.App.pieces;
import inc.faregh.chess_javafx.modle.Color;
import inc.faregh.chess_javafx.modle.Type;
import inc.faregh.chess_javafx.modle.pieces;
import inc.faregh.chess_javafx.modle.stats;
import java.lang.reflect.Array;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundImage;
import javafx.scene.layout.BackgroundPosition;
import javafx.scene.layout.BackgroundRepeat;
import javafx.scene.layout.BackgroundSize;
import javafx.scene.layout.Border;
import javafx.scene.layout.BorderStroke;
import javafx.scene.layout.BorderStrokeStyle;
import javafx.scene.layout.BorderWidths;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

/**
 *
 * @author Amir
 */
public class PlayController{

    private Button btns[][]=(Button[][]) Array.newInstance((Button.class),8,8),select;
    private boolean isselected = false;

    @FXML
    private VBox board;

    @FXML
    private void action(ActionEvent e){
        Button click = (Button) e.getSource();
        if(isselected){
            
            //try{moveicon(select,click);}catch(Exception ex){}
            for(Button row[]:btns){for(Button now:row){now.setBorder(Border.EMPTY);}}
            isselected = false;
        }else{
            if(pieces.containsKey(click.getId())){
                pieces pic = pieces.get(click.getId());
                sethere(click);
                for(int i = 0 ; i<8 ; i++){
                    for(int j = 0 ; j<8 ; j++){
                       if(pic.where(pieces.values().toArray(new pieces[pieces.size()]))[i][j]==stats.k){
                           setk(btns[i][j]);
                       }
                       if(pic.where((pieces[]) pieces.values().toArray(new pieces[pieces.size()]))[i][j]==stats.u){
                           setu(btns[i][j]);
                       }
                    }
                }
                System.out.println(pic);
                select=click;
                isselected = true;
            }
        }
    }

    @FXML
    public void initialize(){
        HBox boardhirozental[] = {new HBox(),new HBox(),new HBox(),new HBox(),new HBox(),new HBox(),new HBox(),new HBox()}; 
        for(int i = 0 ; i<8 ; i++){
            boardhirozental[i].setPrefSize(board.getPrefWidth(),board.getPrefHeight()/8);
            for(int j = 0 ; j<8 ; j++){
                Button here = new Button();
                here.setPrefSize(boardhirozental[i].getPrefWidth(),boardhirozental[i].getPrefHeight());
                here.setId(setid(i,j));
                here.setOnAction(e->{
                    action(e);
                });
                /*here.setStyle("-fx-background-color: #99ccff");
                if((i+j)%2==0){
                    here.setStyle("-fx-background-color: #ccccff");
                }*/
                //here.setPadding(new Insets(10,10,10,10));
                boardhirozental[i].getChildren().add(here);
                btns[i][j]=here;
            }
            board.getChildren().add(boardhirozental[i]);
        }
        for(int i = 0 ; i<8 ; i++){
            for(int j = 0 ; j<8 ; j++){
                if(pieces.get(setid(i,j))!=null){
                    try {
                        seticon(btns[i][j]);
                    } catch (Exception ex) {System.out.println(ex.getMessage());}
                }
            }
        }
    }

    private String setid(int i, int j){
        return Integer.toString(i)+","+Integer.toString(j);
    }

    private void seticon(Button here) throws Exception{
        String butid = pieces.get(here.getId()).getButid();
        pieces now = pieces.get(here.getId());
        if(here.getId().equals(butid)){
            Color color = now.getColor();
            Type type = now.getType();
            String path = "/images/"+color.toString()+"/"+type.toString()+".jpg";
            String realpath = getClass().getResource(path).toExternalForm();
            Image image = new Image(realpath,here.getPrefHeight(),here.getPrefWidth()
            ,false,false);
            BackgroundImage back = new BackgroundImage(image,BackgroundRepeat.NO_REPEAT,
            BackgroundRepeat.NO_REPEAT,BackgroundPosition.CENTER,BackgroundSize.DEFAULT);
            here.setBackground(new Background(back));
        }else{
            throw new Exception("thats not my button");
        }
    }

    private int[] extid(String id){
        int res[] = {Integer.parseInt(id.substring(0,id.indexOf(","))),
                    Integer.parseInt(id.substring(id.indexOf(",")+1))};
        return res;
    }

    private void moveicon(Button old,Button now) throws Exception {
        pieces selectpic = pieces.get(select.getId());
        selectpic.setButid(now.getId());
        pieces.remove(select.getId());
        pieces.put(now.getId(), selectpic);
        seticon(now);
        removeicon(old);
    }

    private void removeicon(Button tar){
        tar.setBackground(Background.EMPTY);
    }

    private void sethere(Button click){
        BorderStroke stroke = new BorderStroke(javafx.scene.paint.Color.GREEN
                            ,BorderStrokeStyle.SOLID,null,BorderWidths.DEFAULT);
        Border bord = new Border(stroke);
        click.setBorder(bord);
    }

    private void setu(Button click){
        BorderStroke stroke = new BorderStroke(javafx.scene.paint.Color.YELLOW
                            ,BorderStrokeStyle.SOLID,null,BorderWidths.DEFAULT);
        Border bord = new Border(stroke);
        click.setBorder(bord);
    }

    private void setk(Button click){
        BorderStroke stroke = new BorderStroke(javafx.scene.paint.Color.RED
                            ,BorderStrokeStyle.SOLID,null,BorderWidths.DEFAULT);
        Border bord = new Border(stroke);
        click.setBorder(bord);
    }

}
