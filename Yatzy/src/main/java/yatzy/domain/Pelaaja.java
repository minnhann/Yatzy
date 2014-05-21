package yatzy.domain;

import java.util.ArrayList;

public class Pelaaja {
    
    private ArrayList<Noppa> nopat;
    
    
    public Pelaaja(){

        this.nopat = new ArrayList<Noppa>();
        
        for(int i = 0; i < 5; i++){
            nopat.add(new Noppa());
        }
    }
    
    public int getNoppienSumma(){
        int summa = 0;
        
        for(int i = 0; i < nopat.size(); i++){
            summa += nopat.get(i).getArvo();
        }
        return summa;
    }
    
    
    
    
    

}
