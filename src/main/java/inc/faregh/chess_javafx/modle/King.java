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
public class King extends pieces {
    

    public King(String butid, Color color) {
        super(butid, Type.k, color);
    }

    @Override
    public stats[][] where(pieces pic[]){
        boolean isemp[][][] = super.isemp(pic);
        stats res[][] = (stats[][])Array.newInstance((stats.class),8,8);
        for(int ib=i-1;ib<=i+1;ib++){
            for(int jb=j-1;jb<=j+1;jb++){
                if(ib>=0&&jb>=0&&ib<=7&&jb<=7&&!(ib==i&&jb==j)&&cango(ib,jb,pic)){
                    if(isemp[ib][jb][0]){
                        res[ib][jb]=stats.u;
                    }else{
                        if(isemp[ib][jb][1]){
                            res[ib][jb]=stats.k;
                        }else{
                            res[ib][jb]=stats.n;
                        }
                    }
                }
            }
        }
        res=super.fill(res);
        return res;
    }

    private boolean cango(int ib,int jb,pieces pic[]){
        boolean res = true;
        // no king condition
        int kings = 0;
        for(int ibh=ib-1;ibh<=ib+1;ibh++){
            for(int jbh=jb-1;jbh<=jb+1;jbh++){
                for(pieces p:pic){
                    if(p.getI()==ibh&&p.getJ()==jbh&&p.getType()==Type.k){
                        kings++;
                    }
                }
            }
        }
        res=kings<2;
        //no one kick him condition
        for(pieces p:pic){
            if(p.getType()!=Type.k&&p.where(pic)[ib][jb]==stats.u&&p.getColor()!=color){
                res=false;
            }
        }
        return res;
    }

}