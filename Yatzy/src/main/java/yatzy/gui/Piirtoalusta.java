package yatzy.gui;

import java.awt.BorderLayout;
import java.awt.Color;
import static java.awt.Color.WHITE;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Insets;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import yatzy.domain.Noppa;
import yatzy.peli.Peli;

/**
 * Piirtoalusta piirtää peli-ikkunaan nopat, tilannetaulukon sekä pelin
 * jälkeisen tekstikentän
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
    private Peli peli;
    private JButton heita;
    private JButton noppa1Nappi;

    /**
     * Asetetaan piirtoalustalle tarvittavat tiedot sekä talletetaan jokaiselle
     * nopalle sitä vastaava kuva.
     *
     * @param frame frame, jota käytetään pelikäyttöliittymässä
     * @param kayttis pelikäyttöliittymä
     * @param peli peli, jota käytetään
     */
    public Piirtoalusta(JFrame frame, PeliKayttoliittyma kayttis, Peli peli) {
        super.setBackground(Color.WHITE);
        this.frame = frame;
        this.kayttis = kayttis;
        this.peli = peli;
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
        this.heita = new JButton("Heitä");
        add(heita);
        this.heita.addActionListener(new KlikkaustenKuuntelija(this.peli));
        this.noppa1Nappi = new JButton();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        
        luoNapit();

//        piirraNopat(g, noppa1Nappi);
//        this.heita.addActionListener(new KlikkaustenKuuntelija(this.peli));
    }

    private void liitaNopanKuva(JButton button) {

        for (Noppa noppa : kayttis.getPeli().nopat) {

            if (noppa.getArvo() == 1) {
                button.setIcon(new ImageIcon(noppa1));

            } else if (noppa.getArvo() == 2) {
                button.setIcon(new ImageIcon(noppa2));

            } else if (noppa.getArvo() == 3) {
                button.setIcon(new ImageIcon(noppa3));

            } else if (noppa.getArvo() == 4) {
                button.setIcon(new ImageIcon(noppa4));

            } else if (noppa.getArvo() == 5) {
                button.setIcon(new ImageIcon(noppa5));

            } else if (noppa.getArvo() == 6) {
                button.setIcon(new ImageIcon(noppa6));

            }
            // to remote the spacing between the image and button's borders
            button.setMargin(new Insets(0, 0, 0, 0));
            button.setBackground(WHITE);
            button.setBorder(null);
        }
    }

    private void luoNapit() {

        JButton heita = new JButton("Heitä");
        heita.setActionCommand("heita");
        add(heita, BorderLayout.EAST);
        heita.addActionListener(new KlikkaustenKuuntelija(this.peli));

        JButton noppaNappi1 = new JButton();
        liitaNopanKuva(noppaNappi1);
        noppaNappi1.setActionCommand("2");
        add(noppaNappi1);
        noppaNappi1.addActionListener(new KlikkaustenKuuntelija(this.peli));

        JButton noppaNappi2 = new JButton();
        liitaNopanKuva(noppaNappi2);
        noppaNappi2.setActionCommand("3");
        add(noppaNappi2);
        noppaNappi2.addActionListener(new KlikkaustenKuuntelija(this.peli));

        JButton noppaNappi3 = new JButton();
        liitaNopanKuva(noppaNappi3);
        noppaNappi3.setActionCommand("4");
        add(noppaNappi3);
        noppaNappi3.addActionListener(new KlikkaustenKuuntelija(this.peli));
        
        JButton noppaNappi4 = new JButton();
        liitaNopanKuva(noppaNappi4);
        noppaNappi4.setActionCommand("5");
        add(noppaNappi4);
        noppaNappi4.addActionListener(new KlikkaustenKuuntelija(this.peli));
        
        JButton noppaNappi5 = new JButton();
        liitaNopanKuva(noppaNappi5);
        noppaNappi5.setActionCommand("5");
        add(noppaNappi5);
        noppaNappi5.addActionListener(new KlikkaustenKuuntelija(this.peli));
        

    }

    private void piirraTaulukko(Graphics g) {

    }

    /**
     * Piirretään tilanne uudelleen
     */
    public void paivita() {
        repaint();
    }

}
