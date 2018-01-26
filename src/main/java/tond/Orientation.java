package tond;
public class Orientation {
    private char c;
    private  char[] orientations= {'N','E','S','W'};

    public Orientation(char c) {
        this.c = c;
    }

    public void sOrienter(char d, Tondeuse t){ //S'orienter(NEWS) en fx de la direction (DGA)
        int i= new String(this.orientations).indexOf(t.getPosOr().getO().getC());
        switch (d){
            case 'D':
                t.getPosOr().getO().setC(orientations[mod(i+1, this.orientations.length)]);
                break;
            case 'G':
                t.getPosOr().getO().setC(orientations[mod(i-1, this.orientations.length)]);
                break;
        }

    }
    public char getC() {
        return c;
    }

    public void setC(char c) {
        this.c = c;
    }
    private int mod(int i, int n){
        int x= i%n;
        if (x<0)
            x=x+n;
        return x;
    }
}
