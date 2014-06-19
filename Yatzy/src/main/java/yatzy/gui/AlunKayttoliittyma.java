package yatzy.gui;

import java.awt.Container;
import java.awt.Dimension;
import java.awt.GridLayout;
import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.WindowConstants;
import yatzy.peli.Peli;

/**
 * Luodaan pelin aloitusikkuna, josta valitaan, kuinka monta pelaajaa (1-4)
 * peliä pelaa.
 *
 * @author minnhann
 */
public class AlunKayttoliittyma implements Runnable {

    /**
     * Frame.
     */
    private JFrame frame;
    /**
     * Peli jota pelataan.
     */
    private Peli peli;

    /**
     * Asetetaan peliksi main:ssa luotu peli.
     *
     * @param yatzy peli jota pelataan.
     */
    public AlunKayttoliittyma(Peli yatzy) {
        this.peli = yatzy;
    }

    @Override
    public void run() {
        frame = new JFrame("Yatzy");
        frame.setPreferredSize(new Dimension(600, 300));
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        luoKomponentit(frame.getContentPane());

        frame.pack();
        frame.setVisible(true);
    }

    /**
     * Luodaan komponentit frameen ja lisätään alun valikko.
     *
     * @param container komponentit lisätään.
     */
    private void luoKomponentit(Container container) {
        GridLayout layout = new GridLayout(2, 1);
        container.setLayout(layout);
        JTextArea teksti = new JTextArea("Tervetuloa pelaamaan Yatzya!"
                + "\n Valitse kuinka monta pelaajaa (1-4)");
        teksti.setEditable(false);
        container.add(teksti);

        AlunValikko valikko = new AlunValikko(this.peli);
        container.add(valikko);
    }

    public JFrame getFrame() {
        return frame;
    }

}
