package yatzy.gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import yatzy.peli.Peli;

/**
 *
 * @author minnhann
 */
public class ValikonKuuntelija implements ActionListener{
    

    @Override
    public void actionPerformed(ActionEvent e) {
        int pelaajat = Integer.parseInt(e.getActionCommand());
        
        
        //Pelikayttoliittyma kayttis = new Pelikayttoliittyma()
        //SwingUtilities.invokeLater(kayttis);
    }
    
}
