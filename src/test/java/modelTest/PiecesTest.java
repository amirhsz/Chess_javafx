/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelTest;

import inc.faregh.chess_javafx.modle.*;
import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

/**
 *
 * @author Amir
 */
public class PiecesTest {

    pieces pic[] = {new King("0,2",Color.b),new King("4,3",Color.b),new King("1,7",Color.b)};

    @Test
    @Ignore
    public void queenTest(){
        Queen queen1 = new Queen("0,0",Color.b);
        Queen queen2 = new Queen("4,3",Color.b);
        Queen queen3 = new Queen("1,7",Color.b);
        
        
        stats res1[][] = 
        {{stats.n,stats.u,stats.u,stats.u,stats.u,stats.u,stats.u,stats.u},
        {stats.u,stats.u,stats.n,stats.n,stats.n,stats.n,stats.n,stats.n},
        {stats.u,stats.n,stats.u,stats.n,stats.n,stats.n,stats.n,stats.n},
        {stats.u,stats.n,stats.n,stats.u,stats.n,stats.n,stats.n,stats.n},
        {stats.u,stats.n,stats.n,stats.n,stats.u,stats.n,stats.n,stats.n},
        {stats.u,stats.n,stats.n,stats.n,stats.n,stats.u,stats.n,stats.n},
        {stats.u,stats.n,stats.n,stats.n,stats.n,stats.n,stats.u,stats.n},
        {stats.u,stats.n,stats.n,stats.n,stats.n,stats.n,stats.n,stats.u}};
        stats res2[][] = {
        {stats.n,stats.n,stats.n,stats.u,stats.n,stats.n,stats.n,stats.u},
        {stats.u,stats.n,stats.n,stats.u,stats.n,stats.n,stats.u,stats.n},
        {stats.n,stats.u,stats.n,stats.u,stats.n,stats.u,stats.n,stats.n},
        {stats.n,stats.n,stats.u,stats.u,stats.u,stats.n,stats.n,stats.n},
        {stats.u,stats.u,stats.u,stats.n,stats.u,stats.u,stats.u,stats.u},
        {stats.n,stats.n,stats.u,stats.u,stats.u,stats.n,stats.n,stats.n},
        {stats.n,stats.u,stats.n,stats.u,stats.n,stats.u,stats.n,stats.n},
        {stats.u,stats.n,stats.n,stats.u,stats.n,stats.n,stats.u,stats.n}};
        stats res3[][] = {
        {stats.n,stats.n,stats.n,stats.n,stats.n,stats.n,stats.u,stats.u},
        {stats.u,stats.u,stats.u,stats.u,stats.u,stats.u,stats.u,stats.n},
        {stats.n,stats.n,stats.n,stats.n,stats.n,stats.n,stats.u,stats.u},
        {stats.n,stats.n,stats.n,stats.n,stats.n,stats.u,stats.n,stats.u},
        {stats.n,stats.n,stats.n,stats.n,stats.u,stats.n,stats.n,stats.u},
        {stats.n,stats.n,stats.n,stats.u,stats.n,stats.n,stats.n,stats.u},
        {stats.n,stats.n,stats.u,stats.n,stats.n,stats.n,stats.n,stats.u},
        {stats.n,stats.u,stats.n,stats.n,stats.n,stats.n,stats.n,stats.u}};
        
        
        assertArrayEquals("test 1 not passed(queen)",queen1.where(pic),res1);
        assertArrayEquals("test 2 not passed(queen)",queen2.where(pic),res2);
        assertArrayEquals("test 3 not passed(queen)",queen3.where(pic),res3);
        
    }

    @Test
    public void kingtest(){
        King king1 = new King("0,0",Color.b);
        King king2 = new King("4,3",Color.b);
        King king3 = new King("1,7",Color.b);
        
        
        stats res1[][]={
        {stats.n,stats.u,stats.n,stats.n,stats.n,stats.n,stats.n,stats.n},
        {stats.u,stats.u,stats.n,stats.n,stats.n,stats.n,stats.n,stats.n},
        {stats.n,stats.n,stats.n,stats.n,stats.n,stats.n,stats.n,stats.n},
        {stats.n,stats.n,stats.n,stats.n,stats.n,stats.n,stats.n,stats.n},
        {stats.n,stats.n,stats.n,stats.n,stats.n,stats.n,stats.n,stats.n},
        {stats.n,stats.n,stats.n,stats.n,stats.n,stats.n,stats.n,stats.n},
        {stats.n,stats.n,stats.n,stats.n,stats.n,stats.n,stats.n,stats.n},
        {stats.n,stats.n,stats.n,stats.n,stats.n,stats.n,stats.n,stats.n},
        };
        stats res2[][]={
        {stats.n,stats.n,stats.n,stats.n,stats.n,stats.n,stats.n,stats.n},
        {stats.n,stats.n,stats.n,stats.n,stats.n,stats.n,stats.n,stats.n},
        {stats.n,stats.n,stats.n,stats.n,stats.n,stats.n,stats.n,stats.n},
        {stats.n,stats.n,stats.u,stats.u,stats.u,stats.n,stats.n,stats.n},
        {stats.n,stats.n,stats.u,stats.n,stats.u,stats.n,stats.n,stats.n},
        {stats.n,stats.n,stats.u,stats.u,stats.u,stats.n,stats.n,stats.n},
        {stats.n,stats.n,stats.n,stats.n,stats.n,stats.n,stats.n,stats.n},
        {stats.n,stats.n,stats.n,stats.n,stats.n,stats.n,stats.n,stats.n},
        };
        stats res3[][]={
        {stats.n,stats.n,stats.n,stats.n,stats.n,stats.n,stats.u,stats.u},
        {stats.n,stats.n,stats.n,stats.n,stats.n,stats.n,stats.u,stats.n},
        {stats.n,stats.n,stats.n,stats.n,stats.n,stats.n,stats.u,stats.u},
        {stats.n,stats.n,stats.n,stats.n,stats.n,stats.n,stats.n,stats.n},
        {stats.n,stats.n,stats.n,stats.n,stats.n,stats.n,stats.n,stats.n},
        {stats.n,stats.n,stats.n,stats.n,stats.n,stats.n,stats.n,stats.n},
        {stats.n,stats.n,stats.n,stats.n,stats.n,stats.n,stats.n,stats.n},
        {stats.n,stats.n,stats.n,stats.n,stats.n,stats.n,stats.n,stats.n},
        };
        
        
        /*assertArrayEquals("test 1 not passed(king)",king1.where(pic),res1);
        assertArrayEquals("test 2 not passed(king)",king2.where(pic),res2);
        assertArrayEquals("test 3 not passed(king)",king3.where(pic),res3);*/
        for(int i = 0 ; i<8 ; i++){
            for(int j = 0 ; j<8 ; j++){
                System.out.println(king1.where(pic)[i][j]);
            }
            System.out.println();
        }
        
    }

    @Test
    @Ignore
    public void rooktest(){
        Rook rook1 = new Rook("0,0",Color.b);
        Rook rook2 = new Rook("4,3",Color.b);
        Rook rook3 = new Rook("1,7",Color.b);
        
        
        stats res1[][]={
        {stats.n,stats.u,stats.u,stats.u,stats.u,stats.u,stats.u,stats.u},
        {stats.u,stats.n,stats.n,stats.n,stats.n,stats.n,stats.n,stats.n},
        {stats.u,stats.n,stats.n,stats.n,stats.n,stats.n,stats.n,stats.n},
        {stats.u,stats.n,stats.n,stats.n,stats.n,stats.n,stats.n,stats.n},
        {stats.u,stats.n,stats.n,stats.n,stats.n,stats.n,stats.n,stats.n},
        {stats.u,stats.n,stats.n,stats.n,stats.n,stats.n,stats.n,stats.n},
        {stats.u,stats.n,stats.n,stats.n,stats.n,stats.n,stats.n,stats.n},
        {stats.u,stats.n,stats.n,stats.n,stats.n,stats.n,stats.n,stats.n},
        };
        stats res2[][]={
        {stats.n,stats.n,stats.n,stats.u,stats.n,stats.n,stats.n,stats.n},
        {stats.n,stats.n,stats.n,stats.u,stats.n,stats.n,stats.n,stats.n},
        {stats.n,stats.n,stats.n,stats.u,stats.n,stats.n,stats.n,stats.n},
        {stats.n,stats.n,stats.n,stats.u,stats.n,stats.n,stats.n,stats.n},
        {stats.u,stats.u,stats.u,stats.n,stats.u,stats.u,stats.u,stats.u},
        {stats.n,stats.n,stats.n,stats.u,stats.n,stats.n,stats.n,stats.n},
        {stats.n,stats.n,stats.n,stats.u,stats.n,stats.n,stats.n,stats.n},
        {stats.n,stats.n,stats.n,stats.u,stats.n,stats.n,stats.n,stats.n},
        };
        stats res3[][]={
        {stats.n,stats.n,stats.n,stats.n,stats.n,stats.n,stats.n,stats.u},
        {stats.u,stats.u,stats.u,stats.u,stats.u,stats.u,stats.u,stats.n},
        {stats.n,stats.n,stats.n,stats.n,stats.n,stats.n,stats.n,stats.u},
        {stats.n,stats.n,stats.n,stats.n,stats.n,stats.n,stats.n,stats.u},
        {stats.n,stats.n,stats.n,stats.n,stats.n,stats.n,stats.n,stats.u},
        {stats.n,stats.n,stats.n,stats.n,stats.n,stats.n,stats.n,stats.u},
        {stats.n,stats.n,stats.n,stats.n,stats.n,stats.n,stats.n,stats.u},
        {stats.n,stats.n,stats.n,stats.n,stats.n,stats.n,stats.n,stats.u},
        };
        
        
        /*assertArrayEquals("test 1 not passed(rook)",rook1.where(pic),res1);
        assertArrayEquals("test 2 not passed(rook)",rook2.where(pic),res2);
        assertArrayEquals("test 3 not passed(rook)",rook3.where(pic),res3);*/
        for(int i = 0 ; i < 8 ; i++){
            for(int j = 0 ; j < 8 ; j++){
                System.out.println(rook1.where(pic)[i][j]);
            }
        }
        
    }

    @Test
    @Ignore
    public void bishoptest(){
        Bishop bishop1 = new Bishop("0,0",Color.b);
        Bishop bishop2 = new Bishop("4,3",Color.b);
        Bishop bishop3 = new Bishop("1,7",Color.b);
        
        
        stats res1[][]={
        {stats.n,stats.n,stats.n,stats.n,stats.n,stats.n,stats.n,stats.n},
        {stats.n,stats.u,stats.n,stats.n,stats.n,stats.n,stats.n,stats.n},
        {stats.n,stats.n,stats.u,stats.n,stats.n,stats.n,stats.n,stats.n},
        {stats.n,stats.n,stats.n,stats.u,stats.n,stats.n,stats.n,stats.n},
        {stats.n,stats.n,stats.n,stats.n,stats.u,stats.n,stats.n,stats.n},
        {stats.n,stats.n,stats.n,stats.n,stats.n,stats.u,stats.n,stats.n},
        {stats.n,stats.n,stats.n,stats.n,stats.n,stats.n,stats.u,stats.n},
        {stats.n,stats.n,stats.n,stats.n,stats.n,stats.n,stats.n,stats.u},
        };
        stats res2[][]={
        {stats.n,stats.n,stats.n,stats.u,stats.n,stats.n,stats.n,stats.n},
        {stats.n,stats.n,stats.n,stats.u,stats.n,stats.n,stats.n,stats.n},
        {stats.n,stats.n,stats.n,stats.u,stats.n,stats.n,stats.n,stats.n},
        {stats.n,stats.n,stats.n,stats.u,stats.n,stats.n,stats.n,stats.n},
        {stats.n,stats.u,stats.u,stats.n,stats.u,stats.u,stats.u,stats.u},
        {stats.n,stats.n,stats.n,stats.u,stats.n,stats.n,stats.n,stats.n},
        {stats.n,stats.n,stats.n,stats.u,stats.n,stats.n,stats.n,stats.n},
        {stats.n,stats.n,stats.n,stats.u,stats.n,stats.n,stats.n,stats.n},
        };
        stats res3[][]={
        {stats.n,stats.n,stats.n,stats.n,stats.n,stats.n,stats.n,stats.u},
        {stats.u,stats.u,stats.u,stats.u,stats.u,stats.u,stats.u,stats.n},
        {stats.n,stats.n,stats.n,stats.n,stats.n,stats.n,stats.n,stats.u},
        {stats.n,stats.n,stats.n,stats.n,stats.n,stats.n,stats.n,stats.u},
        {stats.n,stats.n,stats.n,stats.n,stats.n,stats.n,stats.n,stats.u},
        {stats.n,stats.n,stats.n,stats.n,stats.n,stats.n,stats.n,stats.u},
        {stats.n,stats.n,stats.n,stats.n,stats.n,stats.n,stats.n,stats.u},
        {stats.n,stats.n,stats.n,stats.n,stats.n,stats.n,stats.n,stats.u},
        };
        
        
        assertArrayEquals("test 1 not passed(bishop)",bishop1.where(pic),res1);
        assertArrayEquals("test 2 not passed(bishop)",bishop2.where(pic),res2);
        assertArrayEquals("test 3 not passed(bishop)",bishop3.where(pic),res3);
        
    }

}
