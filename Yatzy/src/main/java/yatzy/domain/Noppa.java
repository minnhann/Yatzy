package yatzy.domain;

import java.util.Random;

public class Noppa {

    private int arvo;
    private Random random = new Random();
    private boolean lukittu;

    public Noppa() {
        this.arvo = random.nextInt(6) + 1;
        this.lukittu = false;

    }

    public int getArvo() {
        return arvo;
    }

    public void setArvo(int uusiArvo) {
        this.arvo = uusiArvo;
    }

    public void heitaNoppaa() {
        if (this.lukittu) {
            return;
        }
        this.arvo = random.nextInt(6) + 1;
    }
}

