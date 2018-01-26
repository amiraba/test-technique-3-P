package ter;

public class Terrain {
    private static int maxX;
    private  static int maxY;
    private Cellule[][] cellules;

    public Terrain(int maxX, int maxY){
        this.maxX=maxX;
        this.maxY=maxY;
        cellules = new Cellule[maxY][maxX];
        for (int j=0; j<maxY; j++){
            for ( int i=0; i<maxX; i++ ){
                this.cellules[j][i]= new Cellule(i,j);
            }
        }
    }
    public static int getMaxX() {
        return maxX;
    }

    public static int getMaxY() {
        return maxY;
    }

    public Cellule[][] getCellules() {
        return cellules;
    }

    public void setCellules(Cellule[][] cellules) {
        this.cellules = cellules;
    }
}
