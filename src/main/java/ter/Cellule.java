package ter;

public class Cellule {
    int x;
    int y;
    boolean occupee;

    public Cellule(int x, int y){
        super();
        this.x=x;
        this.y=y;
        occupee=false;
    }
    public void occuper(){
        occupee=true;
    }

    public void nonOccuper(){
        occupee=false;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public boolean isOccupee() {
        return occupee;
    }
}
