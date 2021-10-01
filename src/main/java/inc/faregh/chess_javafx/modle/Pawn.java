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
public class Pawn extends pieces {

    public Pawn(String butid, Color color) {
        super(butid, Type.p, color);
    }

    @Override 
    public stats[][] where(pieces pic[]){
        boolean isemp[][][] = super.isemp(pic);
        stats res[][] = (stats[][])Array.newInstance((stats.class),8,8);
        if(color==Color.b){
            if(isemp[i-1][j][0]){
                res[i-1][j]=stats.u;
            }
            if(isemp[i-1][j+1][1]){
                res[i-1][j+1]=stats.k;
            }
            if(isemp[i-1][j-1][1]){
                res[i-1][j-1]=stats.k;
            }
        }else{
            if(isemp[i+1][j][0]){
                res[i+1][j]=stats.u;
            }
            if(isemp[i+1][j+1][1]){
                res[i+1][j+1]=stats.k;
            }
            if(isemp[i+1][j-1][1]){
                res[i+1][j-1]=stats.k;
            }
        }
        res=super.fill(res);
        return res;
    }

}
