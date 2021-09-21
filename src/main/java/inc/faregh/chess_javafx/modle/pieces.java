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
public abstract class pieces {
    protected String butid;
    protected Type type;
    protected Color color;
    protected int i,j;

    public pieces(String butid, Type type, Color color) {
        this.butid = butid;
        i = Integer.parseInt(this.butid.substring(0, this.butid.indexOf(",")));
        j = Integer.parseInt(this.butid.substring(this.butid.indexOf(",")+1));
        this.type = type;
        this.color = color;
    }

    public String getButid() {
        return butid;
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

}
