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
public enum Type {

    /**
     * king(شاه)
     */
    k
    ,

    /**
     * queen(وزیر)
     */
    q
    ,

    /**
     * rook(رخ)
     */
    r
    ,

    /**
     * bishop(فیل)
     */
    b
    ,

    /**
     * knight(اسب)
     */
    n
    ,

    /**
     * pawn(سرباز)
     */
    p;

    @Override
    public String toString(){
        String result = null;
        String litller = super.name();
        switch(litller){
            case "k":
                result = "king";
                break;
            case "q":
                result = "queen";
                break;
            case "r":
                result = "rook";
                break;
            case "b":
                result = "bishop";
                break;
            case "n":
                result = "knight";
                break;
            case "p":
                result = "pawn";
                break;
        }
        return result;
    }

}
