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
public class Moves {

     private static boolean fillpos(int ib, int jb, boolean[][][] isemp, stats[][] res) {
        if(isemp[ib][jb][0]){//we can go there and there is empty
            res[ib][jb] = stats.u;
        }else{
            if(isemp[ib][jb][1]){//we can kick the piec
                res[ib][jb]=stats.k;
            }else{//we can kick the piec
                res[ib][jb]=stats.n;
            }
            return true;
        }
        return false;
    }

    private static String tobutid(int i , int j){
        return i+","+j;
    }

    public static void up_down_left_right(int i, int j, boolean[][][] isemp, stats[][] res){
        for(int ih = i-1 ; ih>-1 ; ih--){//up
            if(fillpos(ih,j,isemp,res))break;
        }
        for(int ih = i+1 ; ih<8 ; ih++){//down
            if(fillpos(ih,j,isemp,res))break;
        }
        for(int jh = j-1 ; jh>-1 ; jh--){//left
            if(fillpos(i,jh,isemp,res))break;
        }
        for(int jh = j+1 ; jh<8 ; jh++){//right
            if(fillpos(i,jh,isemp,res))break;
        }
    }

    public static void Oblique(int i, int j, boolean[][][] isemp, stats[][] res){
        for(int p = 1 ; i-p>-1&&j-p>-1 ; p++){//up-left(-i,-j)
            if(fillpos(i-p,j-p,isemp,res))break;
        }
        for(int p = 1 ; i-p>-1&&j+p<8 ; p++){//up-right(-i,+j)
            if(fillpos(i-p,j+p,isemp,res))break;
        }
        for(int p = 1 ; i+p<8&&j-p>-1 ; p++){//down-left(+i,-j)
            if(fillpos(i+p,j-p,isemp,res))break;
        }
        for(int p = 1 ; i+p<8&&j+p<8 ; p++){//down-right(+i,+j)
            if(fillpos(i+p,j+p,isemp,res))break;
        }
    }

}
