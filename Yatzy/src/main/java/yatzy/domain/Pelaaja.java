package yatzy.domain;

import java.util.ArrayList;

/**
 * Pelaaja sisältää pelaajan nimen ja pistemäärän
 *
 * @author minnhann
 */
public class Pelaaja {

    private String nimi;
    private int ykkoset;
    private int kakkoset;
    private int kolmoset;
    private int neloset;
    private int vitoset;
    private int kutoset;
    private int bonus;
    private int score;
    private int yksiPari;
    private int kaksiParia;
    private int kolmeSamaa;
    private int neljaSamaa;
    private int pieniSuora;
    private int suuriSuora;
    private int taysiKasi;
    private int yatzy;
    private int sattuma;
    private int total;

    /**
     * Konstruktorissa asetetaan pelaajalle nimi sekä asetetaan pisteiksi nolla.
     *
     * @param nimi pelaajan nimi
     */
    public Pelaaja(String nimi) {
        this.nimi = nimi;
        

    }

    public String getNimi() {
        return this.nimi;
    }

    public int getPisteet() {
        return 0;
    }

    /**
     * Kasvatetaan pelaajan pisteitä
     *
     * @param lisays lisättävien pisteiden määrä
     */
    public void lisaaPisteita(int lisays, int pisteKohta) {
        if (lisays >= 0) {
            pisteKohta += lisays;
        }
    }

}
