package yatzy.domain;

/**
 * Pelaaja sisältää pelaajan nimen, pistemäärän eriteltynä ja kokonaisuudessaan
 * sekä tiedon, mitä noppayhdistelmiä pelaaja on jo kerännyt.
 *
 * @author minnhann
 */
public class Pelaaja {

    /**
     * Pelaajan nimi.
     */
    private String nimi;
    /**
     * Taulukko, johon kerätään pelaajan pisteet.
     */
    private int[] pisteet;
    /**
     * Taulukko, jossa säilytetään tieto siitä, mitä pisteitä pelaaja on
     * jo kerännyt.
     */
    private boolean[] onkoLisattyPisteita;

    /**
     * Konstruktorissa asetetaan pelaajalle nimi, luodaan pistetaulukko ja
     * asetetaan jokainen pisteyhdistelmä käyttämättömäksi (false).
     *
     * @param nimi pelaajan nimi
     */
    public Pelaaja(String nimi) {
        this.nimi = nimi;
        this.pisteet = new int[18];
        this.onkoLisattyPisteita = new boolean[18];
        for (int i = 0; i < 18; i++) {
            this.onkoLisattyPisteita[i] = false;
        }

    }

    public String getNimi() {
        return this.nimi;
    }

    public int getPisteet(int mitkaPisteet) {
        return pisteet[mitkaPisteet];
    }
    
    public void setPisteet(int pistemaara){
        pisteet[17] = pistemaara;
    }

    public boolean getOnkoLisattyPisteita(int kohta) {
        return this.onkoLisattyPisteita[kohta];
    }

    /**
     * Kasvatetaan pelaajan pisteitä.
     *
     * @param lisays lisättävien pisteiden määrä
     * @param pisteKohta kohta johon pisteet lisätään
     * @return totuusarvo siitä, onko pistekohtaan jo lisätty pisteet
     */
    public boolean lisaaPisteita(int lisays, int pisteKohta) {
        if (lisays >= 0 && onkoLisattyPisteita[pisteKohta] == false) {
            pisteet[pisteKohta] += lisays;
            onkoLisattyPisteita[pisteKohta] = true;
            pisteet[17] += lisays;
            onkoLisattyPisteita[17] = true;

            if (pisteKohta < 6) {
                pisteet[6] += lisays;
                onkoLisattyPisteita[6] = true;
                
                if (pisteet[6] >= 63) {
                    pisteet[7] += 25;
                    onkoLisattyPisteita[7] = true;
                }
            }
            return true;
        }
        return false;
    }

//    pisteet[0] ykkoset;
//    pisteet[1] kakkoset;
//    pisteet[2] kolmoset;
//    pisteet[3] neloset;
//    pisteet[4] vitoset;
//    pisteet[5] kutoset;
//    pisteet[6] score;
//    pisteet[7] bonus;
//    pisteet[8] yksiPari;
//    pisteet[9] kaksiParia;
//    pisteet[10] kolmeSamaa;
//    pisteet[11] neljaSamaa;
//    pisteet[12] pieniSuora;
//    pisteet[13] suuriSuora;
//    pisteet[14] taysiKasi;
//    pisteet[15] yatzy;
//    pisteet[16] sattuma;
//    pisteet[17] total;
}
