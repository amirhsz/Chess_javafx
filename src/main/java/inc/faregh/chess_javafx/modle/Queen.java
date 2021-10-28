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
public class Queen extends pieces {

    /**
     *
     * @param butid our button id
     * @param color our piece color
     */
    public Queen(String butid, Color color) {
        super(butid, Type.q, color);
    }

    /**
     *
     * @param pic our board
     * @return where can we go
     */
    @Override
    public stats[][] where(pieces[] pic){
        boolean isemp[][][] = super.isemp(pic);
        stats res[][] = (stats[][])Array.newInstance((stats.class),8,8);

        Moves.Oblique(i, j, isemp, res);
        Moves.up_down_left_right(i, j, isemp, res);

        res=super.fill(res);
        return res;
    }

}
