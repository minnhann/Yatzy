package yatzy.gui;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
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
    private BufferedImage noppa1;
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
<<<<<<< HEAD
        
        piirraNopat(g);

        
    }

    private void piirraNopat(Graphics g) {
        int korkeus = 0;
        for (Noppa noppa : kayttis.getPeli().nopat) {
            if (noppa.getArvo() == 1) {
                g.drawImage(noppa1, 400, korkeus, frame);
                
            } else if (noppa.getArvo() == 2) {
                g.drawImage(noppa2, 400, korkeus, frame);
                
            } else if (noppa.getArvo() == 3) {
                g.drawImage(noppa3, 400, korkeus, frame);
                
            } else if (noppa.getArvo() == 4) {
                g.drawImage(noppa4, 400, korkeus, frame);
                
            } else if (noppa.getArvo() == 5) {
                g.drawImage(noppa5, 400, korkeus, frame);
                
            } else if (noppa.getArvo() == 6) {
                g.drawImage(noppa6, 400, korkeus, frame);
                
            }
            korkeus += 70;
            
        }
    }
    
    private void piirraTaulukko(Graphics g){
        
=======

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
>>>>>>> 4268b2a8f2e0667cc3ede917128546a6c0b00018
    }

    public void paivita() {
        repaint();
    }

}
