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
public class Knight extends pieces {

    /**
     *
     * @param butid our button id
     * @param color our piece color
     */
    public Knight(String butid, Color color) {
        super(butid, Type.n, color);
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
        for(int ib = i-3 ; ib<=i+3 ; ib++){
            for(int jb = j-3 ; jb<=j+3 ; jb++){
                if(jb>=0&&ib>=0&&ib<=7&&jb<=7&&res[ib][jb]==null){
                    if(((Math.abs(i-ib)==2&&Math.abs(j-jb)==1)||(Math.abs(i-ib)==1&&Math.abs(j-jb)==2))){
                        if(isemp[ib][jb][0]){
                            res[ib][jb]=stats.u;
                        }else{
                            if(isemp[ib][jb][1]){
                                res[ib][jb]=stats.k;
                            }else{
                                res[ib][jb]=stats.n;
                            }
                        }
                    }
                }
            }
        }
        res=super.fill(res);
        return res;
    }

}
