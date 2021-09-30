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
                        if(isemp[ib][jb]){
                            res[ib][jb] = stats.u;
                        }else{
                            res[ib][jb] = stats.k;
                            if(jb==j){//down or up
                                for(int jbh=jb+1;jbh<8;jbh++){
                                    res[ib][jbh]=stats.n;
                                }
                            }else if(ib==i){//righ or left
                                for(int ibh=ib+1;ibh<8;ibh++){
                                    res[ibh][jb]=stats.n;
                                }
                            }else if(ib-i==jb-j){//righ-down

                            }else if(i-ib==jb-j){//left-down

                            }else if(ib-i==j-jb){//right-up

                            }else if(i-ib==j-jb){//left-up

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
