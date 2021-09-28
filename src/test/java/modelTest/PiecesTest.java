/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelTest;

import inc.faregh.chess_javafx.modle.Color;
import inc.faregh.chess_javafx.modle.King;
import inc.faregh.chess_javafx.modle.Queen;
import inc.faregh.chess_javafx.modle.Rook;
import inc.faregh.chess_javafx.modle.pieces;
import org.junit.Test;
import org.junit.Ignore;
import static org.junit.Assert.assertArrayEquals;

/**
 *
 * @author Amir
 */
public class PiecesTest {

    @Test
    public void queenTest(){
        Queen queen1 = new Queen("0,0",Color.b);
        Queen queen2 = new Queen("4,3",Color.b);
        Queen queen3 = new Queen("1,7",Color.b);
        
        
        boolean res1[][] = 
        {{false,true,true,true,true,true,true,true},
        {true,true,false,false,false,false,false,false},
        {true,false,true,false,false,false,false,false},
        {true,false,false,true,false,false,false,false},
        {true,false,false,false,true,false,false,false},
        {true,false,false,false,false,true,false,false},
        {true,false,false,false,false,false,true,false},
        {true,false,false,false,false,false,false,true}};
        boolean res2[][] = {
        {false,false,false,true,false,false,false,true},
        {true,false,false,true,false,false,true,false},
        {false,true,false,true,false,true,false,false},
        {false,false,true,true,true,false,false,false},
        {true,true,true,false,true,true,true,true},
        {false,false,true,true,true,false,false,false},
        {false,true,false,true,false,true,false,false},
        {true,false,false,true,false,false,true,false}};
        boolean res3[][] = {
        {false,false,false,false,false,false,true,true},
        {true,true,true,true,true,true,true,false},
        {false,false,false,false,false,false,true,true},
        {false,false,false,false,false,true,false,true},
        {false,false,false,false,true,false,false,true},
        {false,false,false,true,false,false,false,true},
        {false,false,true,false,false,false,false,true},
        {false,true,false,false,false,false,false,true}};
        
        
        assertArrayEquals("test 1 not passed(queen)",queen1.where(),res1);
        assertArrayEquals("test 2 not passed(queen)",queen2.where(),res2);
        assertArrayEquals("test 3 not passed(queen)",queen3.where(),res3);
        
    }

    @Test
    public void kingtest(){
        King king1 = new King("0,0",Color.b);
        King king2 = new King("4,3",Color.b);
        King king3 = new King("1,7",Color.b);
        
        
        boolean res1[][]={
        {false,true,false,false,false,false,false,false},
        {true,true,false,false,false,false,false,false},
        {false,false,false,false,false,false,false,false},
        {false,false,false,false,false,false,false,false},
        {false,false,false,false,false,false,false,false},
        {false,false,false,false,false,false,false,false},
        {false,false,false,false,false,false,false,false},
        {false,false,false,false,false,false,false,false},
        };
        boolean res2[][]={
        {false,false,false,false,false,false,false,false},
        {false,false,false,false,false,false,false,false},
        {false,false,false,false,false,false,false,false},
        {false,false,true,true,true,false,false,false},
        {false,false,true,false,true,false,false,false},
        {false,false,true,true,true,false,false,false},
        {false,false,false,false,false,false,false,false},
        {false,false,false,false,false,false,false,false},
        };
        boolean res3[][]={
        {false,false,false,false,false,false,true,true},
        {false,false,false,false,false,false,true,false},
        {false,false,false,false,false,false,true,true},
        {false,false,false,false,false,false,false,false},
        {false,false,false,false,false,false,false,false},
        {false,false,false,false,false,false,false,false},
        {false,false,false,false,false,false,false,false},
        {false,false,false,false,false,false,false,false},
        };
        
        
        assertArrayEquals("test 1 not passed(king)",king1.where(),res1);
        assertArrayEquals("test 2 not passed(king)",king2.where(),res2);
        assertArrayEquals("test 3 not passed(king)",king3.where(),res3);
        
    }

    @Test
    public void rooktest(){
        Rook rook1 = new Rook("0,0",Color.b);
        Rook rook2 = new Rook("4,3",Color.b);
        Rook rook3 = new Rook("1,7",Color.b);
        
        
        boolean res1[][]={
        {false,true,true,true,true,true,true,true},
        {true,false,false,false,false,false,false,false},
        {true,false,false,false,false,false,false,false},
        {true,false,false,false,false,false,false,false},
        {true,false,false,false,false,false,false,false},
        {true,false,false,false,false,false,false,false},
        {true,false,false,false,false,false,false,false},
        {true,false,false,false,false,false,false,false},
        };
        boolean res2[][]={
        {false,false,false,true,false,false,false,false},
        {false,false,false,true,false,false,false,false},
        {false,false,false,true,false,false,false,false},
        {false,false,false,true,false,false,false,false},
        {true,true,true,false,true,true,true,true},
        {false,false,false,true,false,false,false,false},
        {false,false,false,true,false,false,false,false},
        {false,false,false,true,false,false,false,false},
        };
        boolean res3[][]={
        {false,false,false,false,false,false,false,true},
        {true,true,true,true,true,true,true,false},
        {false,false,false,false,false,false,false,true},
        {false,false,false,false,false,false,false,true},
        {false,false,false,false,false,false,false,true},
        {false,false,false,false,false,false,false,true},
        {false,false,false,false,false,false,false,true},
        {false,false,false,false,false,false,false,true},
        };
        
        
        assertArrayEquals("test 1 not passed(rook)",rook1.where(),res1);
        assertArrayEquals("test 2 not passed(rook)",rook2.where(),res2);
        assertArrayEquals("test 3 not passed(rook)",rook3.where(),res3);
        
    }

}
