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
    protected String butid;
    protected Type type;
    protected Color color;
    protected int i,j;
    protected pieces(String butid, Type type, Color color) {
        this.butid = butid;
        i = Integer.parseInt(this.butid.substring(0, this.butid.indexOf(",")));
        j = Integer.parseInt(this.butid.substring(this.butid.indexOf(",")+1));
        this.type = type;
        this.color = color;
    }

    public String getButid() {
        return butid;
    }

    public int getI() {
        return i;
    }

    public int getJ() {
        return j;
    }

    public void setButid(String butid) {
        this.butid = butid;
        i = Integer.parseInt(this.butid.substring(0, this.butid.indexOf(",")));
        j = Integer.parseInt(this.butid.substring(this.butid.indexOf(",")+1));
    }

    public Type getType() {
        return type;
    }

    public Color getColor() {
        return color;
    }

    public String[][] buts(){
        String but[][] = (String[][])Array.newInstance(String.class,8,8);
        for(int ib = 0 ; ib <8 ; ib++){
            for(int jb = 0 ; jb <8 ; jb++){
                but[ib][jb] = Integer.toString(ib)+","+Integer.toString(jb);
            }
        }
        return but;
    }

    public boolean[][] where(){
        return null;
    }

}
