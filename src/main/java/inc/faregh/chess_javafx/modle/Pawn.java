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

    /**
     *
     * @param butid our button id
     * @param color our piece color
     */
    public Pawn(String butid, Color color) {
        super(butid, Type.p, color);
    }

    /**
     *
     * @param pic our board
     * @return where can we go
     */
    @Override 
    public stats[][] where(pieces pic[]){
        boolean isemp[][][] = super.isemp(pic);
        stats res[][] = (stats[][])Array.newInstance((stats.class),8,8);
        if((i!=0||i!=7)){
            if(color==Color.b){
                if(i==6){res[i-2][j]=stats.u;}
                if(isemp[i-1][j][0]){
                    res[i-1][j]=stats.u;
                }
                if(j!=7&&isemp[i-1][j+1][1]){
                    res[i-1][j+1]=stats.k;
                }
                if(j!=0&&isemp[i-1][j-1][1]){
                    res[i-1][j-1]=stats.k;
                }
            }else{
                if(i==1){res[i+2][j]=stats.u;}
                if(isemp[i+1][j][0]){
                    res[i+1][j]=stats.u;
                }
                if(j!=7&&isemp[i+1][j+1][1]){
                    res[i+1][j+1]=stats.k;
                }
                if(j!=0&&isemp[i+1][j-1][1]){
                    res[i+1][j-1]=stats.k;
                }
            }
        }
        res=super.fill(res);
        return res;
    }

}
