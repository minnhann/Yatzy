package yatzy.peli;

import java.util.ArrayList;
import yatzy.domain.Noppa;
import yatzy.domain.Pelaaja;

/**
 *
 * @author minnhann
 */
public class Peli {

    private NoppaYhdistelmat yhdistelmat;
    private Noppa[] nopat;
    private ArrayList<Pelaaja> pelaajat;
    private int vuoro;
    private int heitot;

    public Peli(int lkm) {
        yhdistelmat = new NoppaYhdistelmat();
        nopat = new Noppa[5];
        this.luoNopat();
        pelaajat = new ArrayList<Pelaaja>();
        this.luoPelaajat(lkm);
        this.vuoro = 0;
        this.heitot = 0; //tarkista lopuksi, onko heitot alussa 0 vai 1!!

    }

    private void luoNopat() {
        for (int i = 0; i < nopat.length; i++) {
            nopat[i] = new Noppa();            
        }

    }
    private void luoPelaajat(int lkm){
        for(int i = 0; i < lkm; i++){
            pelaajat.add(new Pelaaja("pelaaja"));
        }
    }

    public void heitaNoppia() {
        if(heitot == 3){
//            System.out.println("Ei heittoja jäljellä");
            return;
        }
        for (Noppa noppa : nopat) {
            noppa.heitaNoppaa();
        }
        heitot++;
    }
    
    private void vaihdaVuoroa(){
        this.vuoro = (this.vuoro + 1) % pelaajat.size();
        this.heitot = 0;
    }


}
