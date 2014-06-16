package yatzy.peli;

import java.util.ArrayList;
import yatzy.domain.Noppa;
import yatzy.domain.Pelaaja;
import yatzy.gui.PeliKayttoliittyma;

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
    
    private int kierros;
    
    private PeliKayttoliittyma kayttis;

    /**
     * Konstruktorisa luodaan noppayhdistelmät, nopat, pelaajat, asetetaan
     * pelivuoro ensimmäiselle pelaajalle ja asetetaan heitot nollaan
     */
    public Peli() {
        yhdistelmat = new NoppaYhdistelmat();
        nopat = new Noppa[5];
        this.luoNopat();
        pelaajat = new ArrayList<Pelaaja>();
        this.vuoro = 0;
        this.heitot = 1;
        this.kierros = 1;
        kayttis = new PeliKayttoliittyma(this);

    }

    /**
     * Luodaan viisi noppaa.
     */
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
            pelaajat.add(new Pelaaja("Pelaaja " + (i + 1)));
        }
    }

    /**
     * Heitetaan jokaista noppaa yksitellen
     */
    public void heitaNoppia() {
        if (heitot == 3) {
            return;
        }
        for (Noppa noppa : nopat) {
            noppa.heitaNoppaa();
        }
        heitot++;
    }

    /**
     * Vaihdetaan pelaajan vuoroa järjestyksessä seuraavalle pelaajalle ja
     * arvotaan seuraavalle pelaajalle uudet nopat. Lisäksi asetetaan heittojen
     * lukumäärä yhteen vastaamaan seuraavan pelaajan tilannetta.
     */
    public void vaihdaVuoroa() {
        this.vuoro = (this.vuoro + 1) % pelaajat.size();
        arvoUudetNopatSeuraavalleVuorolle();
        this.heitot = 1;
        if(this.vuoro == 0){
            this.kierros++;
        }
    }
    
    /**
     * Arvotaan uudet nopat, jotka ovat kaikki lukitsemattomia.
     */
    public void arvoUudetNopatSeuraavalleVuorolle() {
        for (Noppa noppa : nopat) {
            if (noppa.onkoLukittu()) {
                noppa.vaihdaNopanLukitus();
            }
            noppa.heitaNoppaa();
        }
    }

    public int getHeitot() {
        return this.heitot;
    }

    public int getVuoro() {
        return this.vuoro;
    }
    
    public int getKierros(){
        return this.kierros;
    }
    
    public boolean loppuikoPeli(){
        if(this.kierros == 19){
            return true;
        }
        return false;
    }
    
    public String tarkistaVoittaja(){
        String voittaja = "";
        int parhaatPisteet = 0;
        
        for(Pelaaja pelaaja : this.pelaajat){
            if(pelaaja.getPisteet(17) > parhaatPisteet){
                voittaja = pelaaja.getNimi();
                parhaatPisteet = pelaaja.getPisteet(17);
            } else if(pelaaja.getPisteet(17) == parhaatPisteet){
                voittaja += " ja " + pelaaja.getNimi();
            }
        }
        return voittaja;
    }
    /**
     *
     * Kasvatetaan vuorossa olevan pelaajan pisteita, ja lisätään uusi
     * pistemäärä oikeaan kohtaan pelaajan pistetaulukkoa. Lopuksi vaihdetaan
     * vuoroa.
     *
     * @param monesko mihin pistekohtaan pisteitä halutaan lisätä
     */
    public void lisaaPelaajallePisteita(int monesko) {
        int pisteet = 0;
        if (monesko == 0 || monesko == 1 || monesko == 2 || monesko == 3 || monesko == 4 || monesko == 5) {
            pisteet = (monesko + 1) * yhdistelmat.montakoSamaaNumeroa(nopat, monesko + 1);
        } else if (monesko == 8) {
            pisteet = yhdistelmat.yksiPari(nopat);
        } else if (monesko == 9) {
            pisteet = yhdistelmat.kaksiParia(nopat);
        } else if (monesko == 10) {
            pisteet = yhdistelmat.kolmeSamanlaista(nopat);
        } else if (monesko == 11) {
            pisteet = yhdistelmat.neljaSamanlaista(nopat);
        } else if (monesko == 12) {
            pisteet = yhdistelmat.pieniSuora(nopat);
        } else if (monesko == 13) {
            pisteet = yhdistelmat.suuriSuora(nopat);
        } else if (monesko == 14) {
            pisteet = yhdistelmat.taysikasi(nopat);
        } else if (monesko == 15) {
            pisteet = yhdistelmat.yatzy(nopat);
        } else if (monesko == 16) {
            pisteet = yhdistelmat.sattuma(nopat);
        }
        if(pelaajat.get(vuoro).lisaaPisteita(pisteet, monesko)){
            vaihdaVuoroa();
        } else{
            kayttis.luoHuomautus();
        }
    }

}
