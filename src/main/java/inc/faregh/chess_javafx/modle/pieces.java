/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inc.faregh.chess_javafx.modle;

import java.lang.reflect.Array;


/**
 *
 * @author Amir
 */
public abstract class pieces {

    /**
     * our button id
     */
    protected String butid;

    /**
     * our piece type
     */
    protected Type type;

    /**
     * our piece color
     */
    protected Color color;
    
    /**
     * our row of button
     */
    protected int i;

    /**
     *our column of button
     */
    protected int j;

    /**
     *
     * @param butid our button id
     * @param type our piece type
     * @param color our piece color
     */
    protected pieces(String butid, Type type, Color color) {
        this.butid = butid;
        i = Integer.parseInt(this.butid.substring(0, this.butid.indexOf(",")));
        j = Integer.parseInt(this.butid.substring(this.butid.indexOf(",")+1));
        this.type = type;
        this.color = color;
    }

    /**
     *
     * @return our button that we are there id
     */
    public String getButid() {
        return butid;
    }

    /**
     *
     * @return our row in the game board
     */
    public int getI() {
        return i;
    }

    /**
     *
     * @return our column in the game board
     */
    public int getJ() {
        return j;
    }

    /**
     *
     * @param butid id of our button
     */
    public void setButid(String butid) {
        this.butid = butid;
        i = Integer.parseInt(this.butid.substring(0, this.butid.indexOf(",")));
        j = Integer.parseInt(this.butid.substring(this.butid.indexOf(",")+1));
    }

    /**
     *
     * @return our piece type
     */
    public Type getType() {
        return type;
    }

    /**
     *
     * @return our piece color
     */
    public Color getColor() {
        return color;
    }

    private String[][] buts(){
        String but[][] = (String[][])Array.newInstance(String.class,8,8);
        for(int ib = 0 ; ib <8 ; ib++){
            for(int jb = 0 ; jb <8 ; jb++){
                but[ib][jb] = Integer.toString(ib)+","+Integer.toString(jb);
            }
        }
        return but;
    }

    /**
     *
     * @param pic our board state
     * @return where are empty
     */
    protected boolean[][][] isemp(pieces pic[]){
        String but[][] = buts();
        boolean res[][][] = (boolean[][][]) Array.newInstance(boolean.class,8,8,2);
        for(int ib = 0 ; ib <8 ; ib++){
            for(int jb = 0 ; jb <8 ; jb++){
                for (pieces p : pic) {
                    res[ib][jb][0] = !p.getButid().equals(but[ib][jb]);
                    if(!res[ib][jb][0]){
                        res[ib][jb][1] = p.getColor() != color;
                        break;
                    }
                }
            }
        }
        return res;
    }

    /**
     *
     * @param res the array that we want to fill it
     * @return all of null on the board to no where
     */
    protected stats[][] fill(stats[][] res){
        stats changed[][] = (stats[][])Array.newInstance(stats.class,8,8);
        for(int ib = 0; ib<8;ib++){
            for(int jb = 0; jb<8;jb++){
                if(res[ib][jb]==null)changed[ib][jb]=stats.n;
                else{
                    changed[ib][jb]=res[ib][jb];
                }
            }
        }
        return changed;
    }

    /**
     *
     * @param pic our board
     * @return we should implement this method in all of sub classes and return where can we go
     */
    public stats[][] where(pieces pic[]){
        return null;
    }

}
