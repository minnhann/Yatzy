package yatzy.yatzy.domain;

import java.util.ArrayList;
import yatzy.yatzy.domain.Noppa;

public class Nopat {
    
    private ArrayList<Noppa> nopat;
    
    
    public Nopat(){

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
