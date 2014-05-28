package yatzy.gui;

import java.awt.Container;
import java.awt.Dimension;
import java.awt.GridLayout;
import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.WindowConstants;
import yatzy.peli.Peli;

/**
 *
 * @author minnhann
 */
public class AlunKayttoliittyma implements Runnable {

    private JFrame frame;
    private Peli peli;
    
    public AlunKayttoliittyma(Peli yatzy){
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

    private void luoKomponentit(Container container) {
        GridLayout layout = new GridLayout(2, 1);
        container.setLayout(layout);
        JTextArea teksti = new JTextArea("Tervetuloa pelaamaan Yatzya!"
                + "\n Valitse kuinka monta pelaajaa (1-4)");
        teksti.setEditable(false);
        container.add(teksti);

        AlunValikko valikko = new AlunValikko(new ValikonKuuntelija(this.peli), this.peli);

        container.add(valikko);
    }

    public JFrame getFrame() {
        return frame;
    }

}
