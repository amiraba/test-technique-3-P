package tond;

import ter.Terrain;

public class Tondeuse {
    private PosOr posOr;

    public Tondeuse (PosOr posOr){
        this.posOr= posOr;
    }

    public void seDeplacer(String seq, Terrain ter){
        for (int i=0; i<seq.length(); i++){
            seDeplacerElem(seq.charAt(i), ter);
        }
    }
    private void seDeplacerElem(char c, Terrain ter){
        if (c=='A'){
            this.posOr.getXy().avancer(this, ter);
            //this.posOr.setXy(this.posOr.getXy().avancer(this.posOr));
        }else{
            this.posOr.getO().sOrienter(c, this);
        }
    }
    public PosOr getPosOr() {
        return posOr;
    }

    public void setPosOr(PosOr posOr) {
        this.posOr = posOr;
    }
}
