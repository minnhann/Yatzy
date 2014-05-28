package yatzy.gui;

import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JPanel;
import yatzy.peli.Peli;

public class AlunValikko extends JPanel {

    private ValikonKuuntelija kuuntelija;
    private Peli peli;

    public AlunValikko(ValikonKuuntelija k, Peli yatzy) {
        
        super(new GridLayout(1, 3));
        luoVaihtoehdot();
        this.kuuntelija = k;
        this.peli = yatzy;
    }

    private void luoVaihtoehdot() {
        
        JButton yksi = new JButton("1 pelaaja");
        yksi.setActionCommand("1");
        add(yksi);
        yksi.addActionListener(new ValikonKuuntelija(this.peli));
        JButton kaksi = new JButton("2 pelaajaa");
        kaksi.setActionCommand("2");
        add(kaksi);
        kaksi.addActionListener(new ValikonKuuntelija(this.peli));
        JButton kolme = new JButton("3 pelaajaa");
        kolme.setActionCommand("3");
        add(kolme);
        kolme.addActionListener(new ValikonKuuntelija(this.peli));
        JButton nelja = new JButton("4 pelaajaa");
        nelja.setActionCommand("4");
        add(nelja);
        nelja.addActionListener(new ValikonKuuntelija(this.peli));

    }

}
