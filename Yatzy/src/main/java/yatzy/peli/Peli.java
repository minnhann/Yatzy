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
    public Noppa[] nopat;
    public ArrayList<Pelaaja> pelaajat;
    private int vuoro;
    private int heitot;

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
    public void luoPelaajat(int lkm){
        for(int i = 0; i < lkm; i++){
            pelaajat.add(new Pelaaja("Pelaaja" + (i+1)));
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
    
    public void vaihdaVuoroa(){
        this.vuoro = (this.vuoro + 1) % (pelaajat.size() + 1);
        this.heitot = 0;
    }
    
    public int getHeitot(){
        return this.heitot;
    }
    
    public int getVuoro(){
        return this.vuoro;
    }
    
    public void kasvataPelaajanPisteita(Pelaaja pelaajanNimi, int lisays){
        for(Pelaaja pelaaja : pelaajat){
            if(pelaaja.equals(pelaajanNimi)){
                pelaaja.lisaaPisteita(lisays);
            }
        }
    }


}
