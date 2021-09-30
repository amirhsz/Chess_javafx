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
public class Bishop extends pieces {

    public Bishop(String butid, Color color) {
        super(butid, Type.b, color);
    }

    @Override
    public stats[][] where(pieces pic[]){
        boolean isemp[][] = super.isemp(pic);
        stats res[][] = (stats[][])Array.newInstance(stats.class,8,8);
        for(int ib = 0 ; ib<8 ; ib++){
            for(int jb = 0 ; jb<8 ; jb++){
                if(res[ib][jb]==null){
                    if((Math.abs(ib-i)==Math.abs(jb-j)&&jb!=j)&&isemp[ib][jb]){
                        res[ib][jb] = stats.u;
                    }
                }
            }
        }
        res=super.fill(res);
        return res;
    }

}
