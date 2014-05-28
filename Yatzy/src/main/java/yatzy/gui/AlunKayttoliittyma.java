/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package yatzy.gui;

import java.awt.Container;
import java.awt.Dimension;
import java.awt.GridLayout;
import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.WindowConstants;

/**
 *
 * @author minnhann
 */
public class AlunKayttoliittyma implements Runnable {

    private JFrame frame;

    @Override
    public void run() {
        frame = new JFrame("Yatzy");
        frame.setPreferredSize(new Dimension(600, 300));
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        luoKomponentit(frame.getContentPane());

        frame.pack();
        frame.setVisible(true);
    }

    private void luoKomponentit(Container container) {
        GridLayout layout = new GridLayout(2, 1);
        container.setLayout(layout);
        JTextArea teksti = new JTextArea("Tervetuloa pelaamaan Yatzya!"
                + "\n Valitse kuinka monta pelaajaa (1-4)");
        teksti.setEditable(false);
        teksti.setSize(50, 1);
        container.add(teksti);

        AlunValikko valikko = new AlunValikko(new ValikonKuuntelija());

        container.add(valikko);
    }
    
    public JFrame getFrame(){
        return frame;
    }

}
