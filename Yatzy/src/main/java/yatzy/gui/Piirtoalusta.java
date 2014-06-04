/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package yatzy.gui;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import yatzy.domain.Noppa;

/**
 *
 * @author minnhann
 */
public class Piirtoalusta extends JPanel {

    private JFrame frame;
    private PeliKayttoliittyma kayttis;
    private Image noppa1;
    private Image noppa2;
    private Image noppa3;
    private Image noppa4;
    private Image noppa5;
    private Image noppa6;

    public Piirtoalusta(JFrame frame, PeliKayttoliittyma kayttis) {
        super.setBackground(Color.WHITE);
        this.frame = frame;
        this.kayttis = kayttis;
        try {
            noppa1 = ImageIO.read(this.getClass().getResource("/images/noppa1.png"));
            noppa2 = ImageIO.read(this.getClass().getResource("/images/noppa2.png"));
            noppa3 = ImageIO.read(this.getClass().getResource("/images/noppa3.png"));
            noppa4 = ImageIO.read(this.getClass().getResource("/images/noppa4.png"));
            noppa5 = ImageIO.read(this.getClass().getResource("/images/noppa5.png"));
            noppa6 = ImageIO.read(this.getClass().getResource("/images/noppa6.png"));
        } catch (IOException ex) {
            System.out.println("Noppia ei löydy");
        }
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        g.drawImage(noppa1, 400, 0, null);
        g.drawImage(noppa2, 400, 70, null);
        g.drawImage(noppa3, 400, 140, null);
        g.drawImage(noppa4, 400, 210, null);
        g.drawImage(noppa5, 400, 280, null);
        g.drawImage(noppa6, 400, 350, null);
    }

//    private void piirraNopat(Graphics g) { //noppien sijainti ei voi riippua silmäluvusta!
//        for (Noppa noppa : kayttis.getPeli().nopat) {
//            if (noppa.getArvo() == 1) {
//                g.drawImage(noppa1, 400, 0, frame);
//                
//            } else if (noppa.getArvo() == 2) {
//                g.drawImage(noppa2, 400, 70, frame);
//                
//            } else if (noppa.getArvo() == 3) {
//                g.drawImage(noppa3, 400, 140, frame);
//                
//            } else if (noppa.getArvo() == 4) {
//                g.drawImage(noppa4, 400, 210, frame);
//                
//            } else if (noppa.getArvo() == 5) {
//                g.drawImage(noppa5, 400, 280, frame);
//                
//            } else if (noppa.getArvo() == 6) {
//                g.drawImage(noppa6, 400, 350, frame);
//                
//            }
//        }
//    }
    private void piirraNopanKuva(Graphics g, ImageIcon kuva) {
//        g.drawImage(kuva, WIDTH, WIDTH, frame);
    }

    public void paivita() {
        repaint();
    }

}
