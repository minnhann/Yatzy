package yatzy.peli;

import java.util.ArrayList;
import yatzy.domain.Noppa;
import yatzy.domain.Pelaaja;

/**
 *
 * @author minnhann
 */
public class Peli {

    private NoppaYhdistelmat yhdistelmat;
    private ArrayList<Noppa> nopat;

    public Peli() {
        yhdistelmat = new NoppaYhdistelmat();
        nopat = new ArrayList<Noppa>();
        this.luoNopat();

    }

    public void luoNopat() {
        Noppa noppa1 = new Noppa();
        nopat.add(noppa1);

        Noppa noppa2 = new Noppa();
        nopat.add(noppa2);

        Noppa noppa3 = new Noppa();
        nopat.add(noppa3);

        Noppa noppa4 = new Noppa();
        nopat.add(noppa4);

        Noppa noppa5 = new Noppa();
        nopat.add(noppa5);

    }

}
