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
public class Rook extends pieces {

    public Rook(String butid, Color color) {
        super(butid, Type.r, color);
    }

    @Override 
    public boolean[][] where(){
        boolean res[][] = (boolean[][])Array.newInstance(boolean.class,8,8);
        for(int ib = 0 ; ib<8 ; ib++){
            for(int jb = 0 ; jb<8 ; jb++){
                if((jb==j&&ib!=i)||(ib==i&&jb!=j)){
                    res[ib][jb] = true;
                }else{
                    res[ib][jb] = false;
                }
            }
        }
        return res;
    }
}
