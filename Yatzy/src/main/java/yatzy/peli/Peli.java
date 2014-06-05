package yatzy.peli;

import java.util.ArrayList;
import yatzy.domain.Noppa;
import yatzy.domain.Pelaaja;

/**
 *
 *
 * Peli -luokka sisältää pelin oleelliset toiminnot sekä säätelee pelin
 * etenemistä
 *
 * @author minnhann
 */
public class Peli {

    /**
     * Noppayhdistelmät, jossa talletettuna erilaiset noppien kombinaatiot
     */
    private NoppaYhdistelmat yhdistelmat;

    /**
     * Lista pelin nopista, 5 kappaletta
     */
    public Noppa[] nopat;

    /**
     * Lista pelaajista, 1-4
     */
    public ArrayList<Pelaaja> pelaajat;
    /**
     * Kertoo kenen vuoro menossa
     */
    private int vuoro;
    /**
     * Pitää kirjaa heitoista jokaisen vuoron aikana
     */
    private int heitot;

    /**
     * Konstruktorisa luodaan noppayhdistelmät, nopat, pelaajat, asetetaan
     * pelivuoro ensimmäiselle pelaajalle ja asetetaan heitot nollaan
     */
    public Peli() {
        yhdistelmat = new NoppaYhdistelmat();
        nopat = new Noppa[5];
        this.luoNopat();
        pelaajat = new ArrayList<Pelaaja>();
        this.vuoro = 1;
        this.heitot = 0; //tarkista lopuksi, onko heitot alussa 0 vai 1!!

    }

    private void luoNopat() {
        for (int i = 0; i < nopat.length; i++) {
            nopat[i] = new Noppa();
        }

    }

    /**
     * Luodaan pelaajat ja talletetaan listaan
     * 
     * @param lkm pelaajien lukumäärä
     */
    public void luoPelaajat(int lkm) {
        for (int i = 0; i < lkm; i++) {
            pelaajat.add(new Pelaaja("Pelaaja" + (i + 1)));
        }
    }

    /**
     * Heitetaan jokaista noppaa yksitellen
     */
    public void heitaNoppia() {
        if (heitot == 3) {
//            System.out.println("Ei heittoja jäljellä");
            return;
        }
        for (Noppa noppa : nopat) {
            noppa.heitaNoppaa();
        }
        heitot++;
    }

    /**
     * Vaihdetaan pelaajan vuoroa järjestyksessä seuraavalle pelaajalle
     */
    public void vaihdaVuoroa() {
        this.vuoro = (this.vuoro + 1) % (pelaajat.size() + 1);
        this.heitot = 0;
    }

    public int getHeitot() {
        return this.heitot;
    }

    public int getVuoro() {
        return this.vuoro;
    }

    /**
     *
     * Kasvatetaan valitun pelaajan pisteitä halutun lisäyksen verran.
     * 
     * @param pelaajanNimi pelaaja, jolle lisätään pisteitä
     * @param lisays pisteet, jotka lisätään
     */
    public void kasvataPelaajanPisteita(Pelaaja pelaajanNimi, int lisays) {
        for (Pelaaja pelaaja : pelaajat) {
            if (pelaaja.equals(pelaajanNimi)) {
                pelaaja.lisaaPisteita(lisays);
            }
        }
    }

}
