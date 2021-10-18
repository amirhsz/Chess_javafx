/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inc.faregh.chess_javafx.modle;

/**
 *
 * @author Amir
 */
public enum Color {

    /**
     * color white
     */
    w
    ,

    /**
     * color black
     */
    b;

    @Override
    public String toString(){
        String result = null;
        String littler = super.name();
        switch(littler){
            case "w":
                result = "white";
                break;
            case "b":
                result = "black";
                break;
        }
        return result;
    }
}
