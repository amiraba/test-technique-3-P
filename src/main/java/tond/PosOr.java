package tond;

public class PosOr { //Position/Orientation
    private Position xy;
    private Orientation o;

    public PosOr(Position xy, Orientation o){
        this.xy=xy;
        this.o=o;
    }

    public Position getXy() {
        return xy;
    }

    public void setXy(Position xy) {
        this.xy = xy;
    }

    public Orientation getO() {
        return o;
    }

    public void setO(Orientation o) {
        this.o = o;
    }

}
