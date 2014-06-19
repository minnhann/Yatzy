package yatzy.main;

import javax.swing.SwingUtilities;
import yatzy.gui.AlunKayttoliittyma;
import yatzy.peli.Peli;


public class Main {
    
    public static void main (String[] args){        
        Peli yatzy = new Peli();
        AlunKayttoliittyma ekaKayttis = new AlunKayttoliittyma(yatzy);
               
        SwingUtilities.invokeLater(ekaKayttis);
    }
    
}
