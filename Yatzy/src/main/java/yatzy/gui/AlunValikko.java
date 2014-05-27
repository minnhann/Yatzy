package yatzy.gui;

import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JPanel;

public class AlunValikko extends JPanel {

    private ValikonKuuntelija kuuntelija;

    public AlunValikko(ValikonKuuntelija k) {
        
        super(new GridLayout(1, 3));
        luoVaihtoehdot();
        kuuntelija = k;
    }

    private void luoVaihtoehdot() {
        
        JButton yksi = new JButton("1 pelaaja");
        yksi.setActionCommand("1");
        add(yksi);
        yksi.addActionListener(new ValikonKuuntelija());
        JButton kaksi = new JButton("2 pelaajaa");
        kaksi.setActionCommand("2");
        add(kaksi);
        kaksi.addActionListener(new ValikonKuuntelija());
        JButton kolme = new JButton("3 pelaajaa");
        kolme.setActionCommand("3");
        add(kolme);
        kolme.addActionListener(new ValikonKuuntelija());
        JButton nelja = new JButton("4 pelaajaa");
        nelja.setActionCommand("4");
        add(nelja);
        nelja.addActionListener(new ValikonKuuntelija());

    }

}
