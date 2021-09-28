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
import org.junit.Ignore;
import static org.junit.Assert.assertArrayEquals;

/**
 *
 * @author Amir
 */
public class PiecesTest {

    @Test
    @Ignore("working at king")
    public void queenTest(){
        Queen queen1 = new Queen("0,0",Color.b);
        Queen queen2 = new Queen("0,0",Color.b);
        Queen queen3 = new Queen("0,0",Color.b);
        
        
        pieces pic[] = {new Queen("5,6",Color.b)};
        
        
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
        {false,true,true,true,true,true,true,true},
        {true,true,false,false,false,false,false,false},
        {true,false,true,false,false,false,false,false},
        {true,false,false,true,false,false,false,false},
        {true,false,false,false,true,false,false,false},
        {true,false,false,false,false,true,false,false},
        {true,false,false,false,false,false,true,false},
        {true,false,false,false,false,false,false,true}};
        boolean res3[][] = {
        {false,true,true,true,true,true,true,true},
        {true,true,false,false,false,false,false,false},
        {true,false,true,false,false,false,false,false},
        {true,false,false,true,false,false,false,false},
        {true,false,false,false,true,false,false,false},
        {true,false,false,false,false,true,false,false},
        {true,false,false,false,false,false,true,false},
        {true,false,false,false,false,false,false,true}};
        
        
        assertArrayEquals("test 1 not passed(queen)",queen1.where(pic),res1);
        assertArrayEquals("test 2 not passed(queen)",queen2.where(pic),res2);
        assertArrayEquals("test 3 not passed(queen)",queen3.where(pic),res3);
        
    }

    @Test
    public void kingtest(){
        King king1 = new King("0,0",Color.b);
        King king2 = new King("4,3",Color.b);
        King king3 = new King("1,7",Color.b);
        
        
        pieces pic[] = {new King("3,4",Color.b)};
        
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
        {false,false,true,true,false,false,false,false},
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
        
        assertArrayEquals("test 1 not passed(king)",king1.where(pic),res1);
        assertArrayEquals("test 2 not passed(king)",king2.where(pic),res2);
        assertArrayEquals("test 3 not passed(king)",king3.where(pic),res3);
        
    }

}
