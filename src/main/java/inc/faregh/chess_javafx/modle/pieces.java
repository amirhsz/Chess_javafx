/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inc.faregh.chess_javafx.modle;

import com.sun.xml.internal.bind.v2.runtime.unmarshaller.XsiNilLoader;
import java.util.Arrays;


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

    protected String[][] buts(){
        String[][] but = {};
        for(int ib = 0 ; ib <8 ; ib++){
            for(int jb = 0 ; jb <8 ; jb++){
                but[ib][jb] = Integer.toString(ib)+","+Integer.toString(jb);
            }
        }
        return but;
    }

    protected boolean[][] isemp(pieces pic[]){
        String[][] but = buts();
        boolean[][] res = {};
        for(int ib = 0 ; ib <8 ; ib++){
            for(int jb = 0 ; jb <8 ; jb++){
                if(Arrays.binarySearch(pic, but[ib][jb])<0){
                    res[ib][jb] = true;
                }else{
                    res[ib][jb] = false;
                }
            }
        }
        return res;
    }

    public boolean[][] where(pieces pic[]){
        return null;
    }
}
