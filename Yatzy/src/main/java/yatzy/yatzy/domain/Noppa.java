package yatzy.yatzy.domain;

import java.util.Random;

public class Noppa {

    private int arvo;
    private int heitot;
    private Random random = new Random();

    public Noppa() {
        this.arvo = random.nextInt(6);
        this.heitot = 0;

    }

    public int getArvo() {
        return arvo;
    }

    public int getHeittoKerrat() {
        return heitot;
    }

    public void lisaaHeitto() {
        this.heitot++;
    }

    public boolean onkoHeittojaJaljella() {
        if (this.heitot < 3) {
            return true;
        }
        this.heitot = 0;
        return false;
    }

}
