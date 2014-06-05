package yatzy.domain;

import java.util.ArrayList;

/**
 * Pelaaja sisältää pelaajan nimen ja pistemäärän
 * 
 * @author minnhann
 */
public class Pelaaja {

    private String nimi;
    private int pisteet;

    /**
     * Konstruktorissa asetetaan pelaajalle nimi sekä asetetaan pisteiksi
     * nolla.
     * @param nimi pelaajan nimi
     */
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

    /**
     * Kasvatetaan pelaajan pisteitä
     * 
     * @param lisays lisättävien pisteiden määrä
     */
    public void lisaaPisteita(int lisays) {
        if (lisays >= 0) {
            this.pisteet += lisays;
        }
    }

}
