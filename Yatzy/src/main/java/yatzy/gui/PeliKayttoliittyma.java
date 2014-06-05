/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package yatzy.gui;

import java.awt.Container;
import java.awt.Dimension;
import javax.swing.JFrame;
import javax.swing.WindowConstants;
import yatzy.peli.Peli;

/**
 * Pelin käyttöliittymä
 * 
 * @author minnhann
 */
public class PeliKayttoliittyma implements Runnable {

    private JFrame frame;
    private Peli peli;
//    private JTextArea teksti;
    private Piirtoalusta piirtoalusta;

    /**
     * Konstruktorissa asetetaan peliksi main:ssa luotu peli sekä
     * luodaan piirtoalusta
     * 
     * @param yatzy peli, jota käsitellään
     */
    public PeliKayttoliittyma(Peli yatzy) {
        this.peli = yatzy;
        this.piirtoalusta = new Piirtoalusta(frame, this, this.peli);

    }

    @Override
    public void run() {
        frame = new JFrame("Yatzy");
        frame.setPreferredSize(new Dimension(500, 500));

        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        luoKomponentit(frame.getContentPane());

        frame.pack();
        frame.setVisible(true);
    }

    private void luoKomponentit(Container container) {
        container.add(piirtoalusta);
    }


    public JFrame getFrame() {
        return frame;
    }
    

    public Peli getPeli(){
        return this.peli;
    }

}
