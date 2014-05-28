package yatzy.gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import yatzy.peli.Peli;

/**
 *
 * @author minnhann
 */
public class ValikonKuuntelija implements ActionListener{
    private Peli peli;
    
    public ValikonKuuntelija(Peli yatzy){
        this.peli = yatzy;
    }
    

    @Override
    public void actionPerformed(ActionEvent e) {
        int pelaajat = Integer.parseInt(e.getActionCommand());
        this.peli.luoPelaajat(pelaajat);
        
        
        
        //Pelikayttoliittyma kayttis = new Pelikayttoliittyma()
        //SwingUtilities.invokeLater(kayttis);
    }
    
}
