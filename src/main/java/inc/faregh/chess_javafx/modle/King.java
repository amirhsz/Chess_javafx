/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inc.faregh.chess_javafx.modle;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author Amir
 */
public class King extends pieces {
    
    /**
     *
     * @param butid our button id
     * @param color our piece color
     */
    public King(String butid, Color color) {
        super(butid, Type.k, color);
    }

    /**
     *
     * @param pic our board
     * @return where can we go
     */
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
                    if(p.i==ibh&&p.j==jbh&&p.getType()==Type.k){
                        kings++;
                    }
                }
            }
        }
        res=kings<2;

        //no one kick him condition
        ArrayList<pieces>picc = new ArrayList<>();
        picc.addAll(Arrays.asList(pic));;
        picc.set(picc.indexOf(this), new King((ib+","+jb),color));//problem: if a !color pieces be there, than if our pieces can kick that so we cant go there because someone can kick that id(our piec can kick the !color piec) 
        for(pieces p:picc){
            if(p.getType()!=Type.k&&p.where(picc.toArray(new pieces[picc.size()]))[ib][jb]==stats.k){
                res=false;
            }
        }
        return res;
    }

}