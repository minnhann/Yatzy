package yatzy.domain;

import java.util.Random;

public class Noppa {

    private int arvo;
    private int heitot;
    private Random random = new Random();

    public Noppa() {
        this.arvo = random.nextInt(6) + 1;
//        this.heitot = 0;

    }

    public int getArvo() {
        return arvo;
    }

//    public int getHeittoKerrat() {
//        return heitot;
//    }
    
    public void setArvo(int uusiArvo){
        this.arvo = uusiArvo;
    }

//    public void lisaaHeitto() {
//        this.heitot++;
//    }

//    public boolean onkoHeittojaJaljella() {
//        if (this.heitot < 3) {
//            return true;
//        }
//        return false;
//    }
//
    public void heitaNoppaa() {
        if (this.heitot < 3) {
            this.arvo = random.nextInt(6) + 1;
//            this.heitot++;
        }
    }

}
