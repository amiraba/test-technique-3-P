package tond;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import ter.Terrain;

public class Position {
    Logger logger = LoggerFactory.getLogger(Position.class);
    private int x;
    private int y;

    public Position (int x, int y){
        this.x=x;
        this.y=y;
    }

    public void avancer(Tondeuse t, Terrain ter){
        switch (t.getPosOr().getO().getC()){
            case 'N':
                if (y+1< ter.getMaxY() && ter.getCellules()[x][y+1].isOccupee()==false){ //Aussi éviter les collisions entre les tondeuses
                    ter.getCellules()[t.getPosOr().getXy().getX()][t.getPosOr().getXy().getY()].nonOccuper();
                    t.getPosOr().getXy().setY(y+1);
                    ter.getCellules()[t.getPosOr().getXy().getX()][t.getPosOr().getXy().getY()].occuper();
                }

                break;

            case 'S':
                if (y-1>0 && ter.getCellules()[x][y-1].isOccupee()==false) {
                    ter.getCellules()[t.getPosOr().getXy().getX()][t.getPosOr().getXy().getY()].nonOccuper();
                    t.getPosOr().getXy().setY(y - 1);
                    ter.getCellules()[t.getPosOr().getXy().getX()][t.getPosOr().getXy().getY()].occuper();
                }
                break;

            case 'E':
                if (x+1< Terrain.getMaxX() && ter.getCellules()[x+1][y].isOccupee()==false) {
                    ter.getCellules()[t.getPosOr().getXy().getX()][t.getPosOr().getXy().getY()].nonOccuper();
                    t.getPosOr().getXy().setX(x+1);
                    ter.getCellules()[t.getPosOr().getXy().getX()][t.getPosOr().getXy().getY()].occuper();
                }

                break;

            case 'W':
                if (x-1>0 && ter.getCellules()[x-1][y].isOccupee()==false){
                    ter.getCellules()[t.getPosOr().getXy().getX()][t.getPosOr().getXy().getY()].nonOccuper();
                    t.getPosOr().getXy().setX(x-1);
                    ter.getCellules()[t.getPosOr().getXy().getX()][t.getPosOr().getXy().getY()].occuper();
                }
                break;
            default:
                logger.error("Action non identifiée. Elle sera donc ignorée.");
        }
        // posOr.getXy();
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }
}
