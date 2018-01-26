import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import ter.Cellule;
import tond.*;
import aff.Affichage;
import ter.Terrain;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Logger logger = LoggerFactory.getLogger(Main.class);
        Scanner sc = new Scanner(System.in);
        try {
            String strTerrain = sc.nextLine();
            String[] splitted = strTerrain.split("\\s+");
            int dimX= Integer.parseInt(splitted[0]);
            int dimY= Integer.parseInt(splitted[1]);
            Terrain ter=null;
            try{
                 ter = new Terrain(dimX, dimY);
            }catch(Exception e){
               logger.error("Dimensions non valides.");
            }

            int x=0;
            int y=0;
            String strPosInitiale = sc.nextLine();
            splitted = strPosInitiale.split("\\s+");
            try {
                 x = Integer.parseInt(splitted[0]);
                 y = Integer.parseInt(splitted[1]);
                if (x > dimX || y > dimY) {
                    throw new Exception("Position invalide");
                }
            }catch(Exception e){
                logger.error(e.toString());
            }finally {
                Position p = new Position(x, y);
                Orientation o = new Orientation(splitted[2].charAt(0));
                Tondeuse t = new Tondeuse(new PosOr(p, o));


                ter.getCellules()[p.getX()][p.getY()].occuper();


                String seq = sc.nextLine();

                Affichage.afficher(ter, t);

                t.seDeplacer(seq, ter);
                Affichage.afficher(ter, t);

            /*for (int j = 0; j < 3; j++) {
                for (int i = 0; i < 3; i++) {
                    logger.debug(ter.getCellules()[j][i].getX() + "-" + ter.getCellules()[j][i].getY() + "-" + ter.getCellules()[i][j].isOccupee());
                }
            }*/
            }
        }catch(Exception e){
                logger.error("Erreur de saise. Veuillez réessayer SVP.\n"+ e);
        }
    }
}
