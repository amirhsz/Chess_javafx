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

    public Queen(String butid, Color color) {
        super(butid, Type.q, color);
    }

    @Override
    public stats[][] where(pieces[] pic){
        boolean isemp[][] = super.isemp(pic);
        stats res[][] = (stats[][])Array.newInstance((stats.class),8,8);
        for(int ib = 0 ; ib<8 ; ib++){
            for(int jb = 0 ; jb<8 ; jb++){
                if(res[ib][jb]==null){
                    if((jb==j&&ib!=i)||(ib==i&&jb!=j)||(Math.abs(ib-i)==Math.abs(jb-j)&&jb!=j)){
                        System.out.println(isemp[ib][jb]+", "+ib+", "+jb);
                        if(isemp[ib][jb]){
                            res[ib][jb] = stats.u;
                        }else{
                            res[ib][jb] = stats.k;
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
                            }else if(ib-i==jb-j){//righ-down
                                for(int p = 1 ; p<Math.min(8-jb, 8-ib) ; p++){
                                    res[ib+p][jb+p]=stats.n;
                                }
                            }else if(i-ib==jb-j){//left-down
                                for(int p = 1 ; p<Math.min(jb+1, 8-jb) ; p++){
                                    res[ib+p][jb-p]=stats.n;
                                }
                            }else if(ib-i==j-jb){//right-up
                                for(int p = 1 ; p<Math.min(8-jb, ib+1) ; p++){
                                    res[ib-p][jb+p]=stats.n;
                                }
                            }else if(i-ib==j-jb){//left-up
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
