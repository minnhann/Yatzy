package yatzy.domain;

import java.util.ArrayList;

public class Pelaaja {

    private String nimi;
    private int pisteet;

    public Pelaaja(String nimi) {
        this.nimi = nimi;
        this.pisteet = 0;

    }

    public String getNimi() {
        return this.nimi;
    }

    public int getPisteet() {
        return this.pisteet;
    }

    public void lisaaPisteita(int lisays) {
        if (lisays >= 0) {
            this.pisteet += lisays;
        }
    }

}
