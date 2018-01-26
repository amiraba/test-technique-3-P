package aff;

import ter.Terrain;
import tond.Tondeuse;

public class Affichage {

    public static void afficher(Terrain ter, Tondeuse t){
        System.out.println("Snapshot Terrain:");
        for (int j=ter.getMaxY()-1; j>=0; j--){
            for (int i=-1; i<ter.getMaxX(); i++){
                if (i==-1)
                    System.out.print(j+" !"); // afficher le numéro de la ligne à chaque fois (colonne -1)
                else if (t.getPosOr().getXy().getX()==i && t.getPosOr().getXy().getY()==j){
                    System.out.print(" "+t.getPosOr().getO().getC()+" !");
                }else{
                    System.out.print("   !");
                }
            }
            System.out.print("\n");
        }
        System.out.print("  ");
        for (int i=0; i<ter.getMaxX(); i++){
            System.out.print("! "+i+" ");
        }
        System.out.println();

    }
}
