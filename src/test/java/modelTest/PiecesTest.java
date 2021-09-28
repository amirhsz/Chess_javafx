/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelTest;

import inc.faregh.chess_javafx.modle.Color;
import inc.faregh.chess_javafx.modle.King;
import inc.faregh.chess_javafx.modle.Queen;
import inc.faregh.chess_javafx.modle.pieces;
import org.junit.Test;
import static org.junit.Assert.assertArrayEquals;

/**
 *
 * @author Amir
 */
public class PiecesTest {

    @Test
    public void queenTest(){
        Queen queen = new Queen("0,0",Color.w);
        pieces pic[] = {new Queen("5,6",Color.w)};
        boolean res[][] = 
        {{false,true,true,true,true,true,true,true},
        {true,true,false,false,false,false,false,false},
        {true,false,true,false,false,false,false,false},
        {true,false,false,true,false,false,false,false},
        {true,false,false,false,true,false,false,false},
        {true,false,false,false,false,true,false,false},
        {true,false,false,false,false,false,true,false},
        {true,false,false,false,false,false,false,true}};
        assertArrayEquals("thats not true",queen.where(pic),res);
    }

}
