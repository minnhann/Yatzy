package yatzy.domain;

import java.util.ArrayList;
import java.util.HashMap;

public class Pelaaja {
    
    public ArrayList<Noppa> nopat;
    
    
    public Pelaaja(){

        this.nopat = new ArrayList<Noppa>();
        
        for(int i = 0; i < 5; i++){
            nopat.add(new Noppa());
        }
    }
    
    public int getNoppienSumma(){
        int summa = 0;
        
        for(Noppa noppa : nopat){
            summa += noppa.getArvo();
        }
        return summa;
    }
    
    public void heitaNoppia(){
        for(Noppa noppa : this.nopat){
            noppa.heitaNoppaa();
        }
    }
    
    
    
    
    

}
