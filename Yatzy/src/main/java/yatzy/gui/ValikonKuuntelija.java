package yatzy.gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.SwingUtilities;
import yatzy.peli.Peli;

/**
 * Kuuntelee alun valikosta valittua pelaajien lukumäärää.
 *
 * @author minnhann
 */
public class ValikonKuuntelija implements ActionListener {

    /**
     * Peli jota pelataan.
     */
    private Peli peli;

    /**
     * Aseteaan valikon kuuntelijalle peli, johon kuuntelu liittyy.
     *
     * @param yatzy peli, jota käsitellään.
     */
    public ValikonKuuntelija(Peli yatzy) {
        this.peli = yatzy;
    }

    /**
     * Kuuntelee, mikä pelaajien lukumäärä valitaan ja välittää tiedon peli
     * -luokalle. Luo pelikäyttöliittymän.
     *
     * @param e käyttäjän napin klikkaus.
     */
    @Override
    public void actionPerformed(ActionEvent e) {
        int pelaajat = Integer.parseInt(e.getActionCommand());
        this.peli.luoPelaajat(pelaajat);

        PeliKayttoliittyma kayttis = new PeliKayttoliittyma(this.peli);
        SwingUtilities.invokeLater(kayttis);
    }

}
