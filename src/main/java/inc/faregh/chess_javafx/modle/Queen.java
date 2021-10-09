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
        for(int ib = 0 ; ib<8 ; ib++){
            for(int jb = 0 ; jb<8 ; jb++){
                if(res[ib][jb]==null){
                    if((jb==j&&ib!=i)||(ib==i&&jb!=j)||(Math.abs(ib-i)==Math.abs(jb-j)&&jb!=j)){
                        if(isemp[ib][jb][0]){
                            res[ib][jb] = stats.u;
                        }else{
                            if(isemp[ib][jb][1]){
                                res[ib][jb]=stats.k;
                            }else{
                                res[ib][jb]=stats.n;
                            }
                            if(jb==j&&ib!=i){//down or up
                                if(i>ib){//down
                                    for(int p=1;p<ib+1;p++){
                                        res[ib-p][jb]=stats.n;
                                    }
                                }else{//up
                                    for(int p=1;p<8-ib;p++){
                                        res[ib+p][jb]=stats.n;
                                    }
                                }
                            }else if(ib==i&&jb!=j){//righ or left
                                if(j>jb){//left
                                    for(int p=1;p<jb+1;p++){
                                        res[ib][jb-p]=stats.n;
                                    }
                                }else{//righ
                                    for(int p=1;p<8-jb;p++){
                                        res[ib][jb+p]=stats.n;
                                    }
                                }
                            }else if(ib-i==jb-j && ib-i>=0){//righ-down
                                for(int p = 1 ; p<Math.min(8-jb, 8-ib) ; p++){
                                    res[ib+p][jb+p]=stats.n;
                                }
                            }else if(i-ib==jb-j && i-ib>=0){//left-down
                                for(int p = 1 ; p<Math.min(8-jb, ib+1) ; p++){
                                    res[ib-p][jb+p]=stats.n;
                                }                                
                            }else if(ib-i==j-jb && ib-i>=0){//right-up
                                for(int p = 1 ; p<Math.min(jb+1, 8-jb) ; p++){
                                    res[ib+p][jb-p]=stats.n;//ib=3,jb=2,i=4,j=3
                                }
                            }else if(i-ib==j-jb && i-ib>=0){//left-up
                               for(int p = 1 ; p<Math.min(jb, ib)+1 ; p++){
                                    res[ib-p][jb-p]=stats.n;
                                }
                            }
                        }
                    }
                }
            }
        }
        res=super.fill(res);
        return res;
    }

}
