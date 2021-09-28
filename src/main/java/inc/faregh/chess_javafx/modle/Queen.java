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
public class Queen extends pieces {

    public Queen(String butid, Color color) {
        super(butid, Type.q, color);
    }

    @Override
    public boolean[][] where(pieces[] pic){
        boolean[][] isemp = super.isemp(pic);
        boolean[][] res = {};
        for(int ib = 0 ; ib<8 ; ib++){
            for(int jb = 0 ; jb<8 ; jb++){
                if(jb == j || ib == i || Math.abs(ib - i)==Math.abs(jb - j)){
                    res[ib][jb] = true;
                }else{
                    res[ib][jb] = false;
                }
            }
        }
        return res;
    }

}
