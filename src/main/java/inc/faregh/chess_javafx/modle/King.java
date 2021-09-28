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
public class King extends pieces {
    

    public King(String butid, Color color) {
        super(butid, Type.k, color);
    }

    @Override
    public boolean[][] where(){
        boolean res[][] = (boolean[][])Array.newInstance(boolean.class,8,8);
        for(int ib = 0 ; ib<8 ; ib++){
            if(ib == i || ib == i-1 || ib == i+1){
                for(int jb = 0 ; jb<8 ; jb++){
                    if(jb == j-1 || jb == j+1 || (ib != i && jb == j)){
                        res[ib][jb] = true;
                    }else{
                        res[ib][jb] = false;
                    }
                }
            }else{
                res[ib][0] = false;
                res[ib][1] = false;
                res[ib][2] = false;
                res[ib][3] = false;
                res[ib][4] = false;
                res[ib][5] = false;
                res[ib][6] = false;
                res[ib][7] = false;
            }
        }
        return res;
    }
}
