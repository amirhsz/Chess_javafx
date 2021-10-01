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

    

    @Test
    @Ignore
    public void queenTest(){
        Queen queen1 = new Queen("0,0",Color.b);
        Queen queen2 = new Queen("4,3",Color.b);
        Queen queen3 = new Queen("1,7",Color.b);
        
        
        pieces pic[] = {
        new Queen("0,0",Color.b),
        new Queen("1,7",Color.b),
        new Queen("4,3",Color.b),
        new Queen("0,3",Color.b),
        new Queen("3,0",Color.b),
        new Queen("3,3",Color.b)
        };
        
        
        stats res1[][] = 
        {{stats.n,stats.u,stats.u,stats.k,stats.n,stats.n,stats.n,stats.n},
        {stats.u,stats.u,stats.n,stats.n,stats.n,stats.n,stats.n,stats.n},
        {stats.u,stats.n,stats.u,stats.n,stats.n,stats.n,stats.n,stats.n},
        {stats.k,stats.n,stats.n,stats.k,stats.n,stats.n,stats.n,stats.n},
        {stats.n,stats.n,stats.n,stats.n,stats.n,stats.n,stats.n,stats.n},
        {stats.n,stats.n,stats.n,stats.n,stats.n,stats.n,stats.n,stats.n},
        {stats.n,stats.n,stats.n,stats.n,stats.n,stats.n,stats.n,stats.n},
        {stats.n,stats.n,stats.n,stats.n,stats.n,stats.n,stats.n,stats.n}};
        stats res2[][] = {
        {stats.n,stats.n,stats.n,stats.n,stats.n,stats.n,stats.n,stats.u},
        {stats.u,stats.n,stats.n,stats.n,stats.n,stats.n,stats.u,stats.n},
        {stats.n,stats.u,stats.n,stats.n,stats.n,stats.u,stats.n,stats.n},
        {stats.n,stats.n,stats.u,stats.k,stats.u,stats.n,stats.n,stats.n},
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
    @Ignore
    public void kingtest(){
        King king1 = new King("0,0",Color.b);
        King king2 = new King("4,3",Color.b);
        King king3 = new King("1,7",Color.b);
        
        
        pieces pic[] = {
        new King("0,0",Color.b),
        new King("1,7",Color.b),
        new King("4,3",Color.b),
        new Queen("7,1",Color.w)
        };
        
        
        stats res1[][]={
        {stats.n,stats.n,stats.n,stats.n,stats.n,stats.n,stats.n,stats.n},
        {stats.u,stats.n,stats.n,stats.n,stats.n,stats.n,stats.n,stats.n},
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
        {stats.n,stats.n,stats.u,stats.n,stats.n,stats.n,stats.n,stats.n},
        {stats.n,stats.n,stats.u,stats.n,stats.u,stats.n,stats.n,stats.n},
        {stats.n,stats.n,stats.n,stats.n,stats.n,stats.n,stats.n,stats.n},
        {stats.n,stats.n,stats.n,stats.n,stats.n,stats.n,stats.n,stats.n},
        };
        stats res3[][]={
        {stats.n,stats.n,stats.n,stats.n,stats.n,stats.n,stats.u,stats.u},
        {stats.n,stats.n,stats.n,stats.n,stats.n,stats.n,stats.u,stats.n},
        {stats.n,stats.n,stats.n,stats.n,stats.n,stats.n,stats.n,stats.u},
        {stats.n,stats.n,stats.n,stats.n,stats.n,stats.n,stats.n,stats.n},
        {stats.n,stats.n,stats.n,stats.n,stats.n,stats.n,stats.n,stats.n},
        {stats.n,stats.n,stats.n,stats.n,stats.n,stats.n,stats.n,stats.n},
        {stats.n,stats.n,stats.n,stats.n,stats.n,stats.n,stats.n,stats.n},
        {stats.n,stats.n,stats.n,stats.n,stats.n,stats.n,stats.n,stats.n},
        };
        
        
        assertArrayEquals("test 1 not passed(king)",king1.where(pic),res1);
        assertArrayEquals("test 2 not passed(king)",king2.where(pic),res2);
        assertArrayEquals("test 3 not passed(king)",king3.where(pic),res3);
        
    }

    @Test
    public void rooktest(){
        Rook rook = new Rook("4,3",Color.b);
        
        
        pieces pic[] = {
        new Rook("4,3",Color.b),
        new Rook("2,3",Color.w),
        new Rook("6,3",Color.w),
        new Rook("4,1",Color.w),
        new Rook("4,5",Color.w),
        };
        
        
        stats res[][]={
        {stats.n,stats.n,stats.n,stats.n,stats.n,stats.n,stats.n,stats.n},
        {stats.n,stats.n,stats.n,stats.n,stats.n,stats.n,stats.n,stats.n},
        {stats.n,stats.n,stats.n,stats.k,stats.n,stats.n,stats.n,stats.n},
        {stats.n,stats.n,stats.n,stats.u,stats.n,stats.n,stats.n,stats.n},
        {stats.n,stats.k,stats.u,stats.n,stats.u,stats.k,stats.n,stats.n},
        {stats.n,stats.n,stats.n,stats.u,stats.n,stats.n,stats.n,stats.n},
        {stats.n,stats.n,stats.n,stats.k,stats.n,stats.n,stats.n,stats.n},
        {stats.n,stats.n,stats.n,stats.n,stats.n,stats.n,stats.n,stats.n},
        };
        
        
        assertArrayEquals("test 1 not passed(rook)",rook.where(pic),res);
        
    }

    @Test
    @Ignore
    public void bishoptest(){
        Bishop bishop = new Bishop("4,3",Color.b);
        
        
        pieces pic[] = {
        new Bishop("4,3",Color.b),
        new Bishop("3,2",Color.b),
        new Bishop("3,4",Color.b),
        new Bishop("6,1",Color.b),
        new Bishop("6,5",Color.b)
        };
        stats res[][]={
        {stats.n,stats.n,stats.n,stats.n,stats.n,stats.n,stats.n,stats.n},
        {stats.n,stats.n,stats.n,stats.n,stats.n,stats.n,stats.n,stats.n},
        {stats.n,stats.n,stats.n,stats.n,stats.n,stats.n,stats.n,stats.n},
        {stats.n,stats.n,stats.k,stats.n,stats.k,stats.n,stats.n,stats.n},
        {stats.n,stats.n,stats.n,stats.n,stats.n,stats.n,stats.n,stats.n},
        {stats.n,stats.n,stats.u,stats.n,stats.u,stats.n,stats.n,stats.n},
        {stats.n,stats.k,stats.n,stats.n,stats.n,stats.k,stats.n,stats.n},
        {stats.n,stats.n,stats.n,stats.n,stats.n,stats.n,stats.n,stats.n},
        };
        
        
        assertArrayEquals("test not passed(bishop)",bishop.where(pic),res);
        
    }

}
