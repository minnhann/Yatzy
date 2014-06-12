package yatzy.domain;

import java.util.ArrayList;

/**
 * Pelaaja sisältää pelaajan nimen ja pistemäärän
 *
 * @author minnhann
 */
public class Pelaaja {

    private String nimi;
    private int[] pisteet;
    private boolean[] onkoLisattyPisteita;
//    private int ykkoset;
//    private int kakkoset;
//    private int kolmoset;
//    private int neloset;
//    private int vitoset;
//    private int kutoset;
//    private int score;
//    private int bonus;
//    private int yksiPari;
//    private int kaksiParia;
//    private int kolmeSamaa;
//    private int neljaSamaa;
//    private int pieniSuora;
//    private int suuriSuora;
//    private int taysiKasi;
//    private int yatzy;
//    private int sattuma;
//    private int total;

    /**
     * Konstruktorissa asetetaan pelaajalle nimi sekä asetetaan pisteiksi nolla.
     *
     * @param nimi pelaajan nimi
     */
    public Pelaaja(String nimi) {
        this.nimi = nimi;
        this.pisteet = new int[18];
        this.onkoLisattyPisteita = new boolean[18];
        
        for(int i = 0; i < 18; i++){
            this.onkoLisattyPisteita[i] = false;
        }

    }

    public String getNimi() {
        return this.nimi;
    }

    public int getPisteet(int mitkaPisteet) {
        return pisteet[mitkaPisteet];
    }
    
    public boolean getOnkoLisattyPisteita(int kohta){
        return this.onkoLisattyPisteita[kohta];
    }

    /**
     * Kasvatetaan pelaajan pisteitä
     *
     * @param lisays lisättävien pisteiden määrä
     */
    public void lisaaPisteita(int lisays, int pisteKohta) {
        //jos pisteita jo lisätty, huomauta pelaajalle
        if (lisays >= 0 && onkoLisattyPisteita[pisteKohta] == false) {
            pisteet[pisteKohta] += lisays;
            onkoLisattyPisteita[pisteKohta] = true;
            pisteet[17] += lisays;

            if (pisteKohta < 6) {
                pisteet[6] += lisays;
                if (pisteet[6] >= 63) {
                    pisteet[7] += 25;
                }
            }
        }
    }

}
