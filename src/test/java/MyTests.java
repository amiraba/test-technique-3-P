import static org.junit.jupiter.api.Assertions.assertEquals;

import aff.Affichage;
import org.junit.jupiter.api.Test;
import ter.Terrain;
import tond.Orientation;
import tond.PosOr;
import tond.Position;
import tond.Tondeuse;

public class MyTests {

    @Test
    public void testerTondeuse() {
        int dimX=5, dimY=5, x=0, y=0;
        char c='N';

        Terrain ter = new Terrain(dimX, dimY);
        Position p = new Position(x, y);
        Orientation o = new Orientation(c);
        Tondeuse t = new Tondeuse(new PosOr(p, o));
        ter.getCellules()[p.getX()][p.getY()].occuper();

        Affichage.afficher(ter, t);
        t.seDeplacer("AGAD", ter);
        Affichage.afficher(ter, t);
    }
}