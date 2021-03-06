package yatzy.gui;

import java.awt.BorderLayout;
import java.awt.Container;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.WindowConstants;
import yatzy.peli.Peli;

/**
 * Pelin käyttöliittymä.
 *
 * @author minnhann
 */
public class PeliKayttoliittyma implements Runnable {

    /**
     * Frame.
     */
    private JFrame frame;
    /**
     * Peli jota pelataan.
     */
    private Peli peli;
    /**
     * Piirtoalusta, joka piirtää pelin.
     */
    private Piirtoalusta piirtoalusta;

    /**
     * Konstruktorissa asetetaan peliksi main:ssa luotu peli sekä luodaan
     * piirtoalusta.
     *
     * @param yatzy peli, jota käsitellään.
     */
    public PeliKayttoliittyma(Peli yatzy) {
        this.peli = yatzy;
        this.piirtoalusta = new Piirtoalusta(frame, this, this.peli);
    }

    @Override
    public void run() {
        frame = new JFrame("Yatzy");
        frame.setLayout(new BorderLayout());
        frame.setPreferredSize(piirtoalusta.getPreferredSize());
        frame.setResizable(false);

        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        luoKomponentit(frame.getContentPane());

        frame.pack();
        frame.setVisible(true);
    }

    /**
     * Lisätään piirtoalusta.
     *
     * @param container komponentit lisätään.
     */
    private void luoKomponentit(Container container) {
        container.add(piirtoalusta);
    }

    public JFrame getFrame() {
        return frame;
    }

    public Peli getPeli() {
        return this.peli;
    }

    /**
     * Luodaan huomautus, jos pelaaja yrittää lisätä pisteitä jo käyttämäänsä
     * pistekohtaan.
     */
    public void luoHuomautus() {
        JOptionPane.showMessageDialog(this.frame, "Valittu noppayhdistelmä on jo käytetty."
                + "\nValitse toinen yhdistelmä pisteiden kirjausta varten.");
    }

    /**
     * Luodaan lopputeksti, jossa lukee pelin voittaneen pelaajan nimi.
     */
    public void lopputeksti() {
        JOptionPane.showMessageDialog(this.frame, "Peli päättyi!"
                + "\nPelin voitti " + peli.tarkistaVoittaja() + "!");
    }

}
