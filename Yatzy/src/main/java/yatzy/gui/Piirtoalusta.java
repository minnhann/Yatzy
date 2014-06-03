/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package yatzy.gui;

import java.awt.Color;
import java.awt.Graphics;
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

    public Piirtoalusta(JFrame frame, PeliKayttoliittyma kayttis) {
        super.setBackground(Color.GRAY);
        this.frame = frame;
        this.kayttis = kayttis;
    }
    
    @Override
    protected void paintComponent(Graphics g){
        super.paintComponent(g);
    }
    
    private void piirraNopat(Graphics g){
        for(Noppa noppa : kayttis.getPeli().nopat){
            if(noppa.getArvo() == 1){
                ImageIcon kuva = new ImageIcon(this.getClass().getResource("noppa1.png"));
                piirraNopanKuva(g, kuva);
            } else if(noppa.getArvo() == 2){
                ImageIcon kuva = new ImageIcon(this.getClass().getResource("noppa2.png"));
                piirraNopanKuva(g, kuva);
            } else if(noppa.getArvo() == 3){
                ImageIcon kuva = new ImageIcon(this.getClass().getResource("noppa3.png"));
                piirraNopanKuva(g, kuva);
            } else if(noppa.getArvo() == 4){
                ImageIcon kuva = new ImageIcon(this.getClass().getResource("noppa4.png"));
                piirraNopanKuva(g, kuva);
            } else if(noppa.getArvo() == 5){
                ImageIcon kuva = new ImageIcon(this.getClass().getResource("noppa5.png"));
                piirraNopanKuva(g, kuva);
            } else if(noppa.getArvo() == 6){
                ImageIcon kuva = new ImageIcon(this.getClass().getResource("noppa6.png"));
                piirraNopanKuva(g, kuva);
            }
        }
    }
    
    private void piirraNopanKuva(Graphics g, ImageIcon kuva){
//        g.drawImage(kuva, WIDTH, WIDTH, frame);
    }
    public void paivita() {
        repaint();
    }

}
