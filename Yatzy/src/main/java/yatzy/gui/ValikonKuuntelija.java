package yatzy.gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author minnhann
 */
public class ValikonKuuntelija implements ActionListener{
    

    @Override
    public void actionPerformed(ActionEvent e) {
        int pelaajat = Integer.parseInt(e.getActionCommand());
        
        //Pelikayttoliittyma kayttis = new Pelikayttoliittyma(pelaajat)  annetaan kayttikselle pelaajien lkm
        //SwingUtilities.invokeLater(kayttis);
    }
    
}
