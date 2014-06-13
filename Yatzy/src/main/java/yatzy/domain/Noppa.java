package yatzy.domain;

import java.util.Random;

/**
 * Noppa sisältää jokaisen nopan arvon, nopan heitto -metodin sekä tiedon siitä,
 * onko noppa lukittu vai ei.
 *
 * @author minnhann
 */
public class Noppa {

    /**
     * Nopan silmäluku, väliltä 1-6
     */
    private int arvo;
    /**
     * Random, jolla arvotaan nopan silmäluku
     */
    private Random random = new Random();
    /**
     * Onko noppa lukittu, eli voidaanko sitä heittää vai ei
     */
    private boolean lukittu;

    /**
     * Konstruktorissa luodaan noppa, se saa jonkin arvon väliltä 1-6 ja se
     * asetetaan lukitsemattomaksi
     */
    public Noppa() {
        this.arvo = random.nextInt(6) + 1;
        this.lukittu = false;
    }

    public int getArvo() {
        return arvo;
    }

    public void setArvo(int uusiArvo) {
        this.arvo = uusiArvo;
    }

    /**
     * Jos noppa ei ole lukittu, heitetään sitä eli arvotaan uusi arvo väliltä
     * 1-6
     */
    public void heitaNoppaa() {
        if (this.lukittu) {
            return;
        }
        this.arvo = random.nextInt(6) + 1;
    }

    /**
     * Palauttaa tiedon siitä, onko noppa lukittu vai ei.
     *
     * @return boolean -arvo (true = lukittu, false = lukitsematon)
     */
    public boolean onkoLukittu() {
        return this.lukittu;
    }

    /**
     * Lukitsee lukitsemattoman nopan sekä vapauttaa lukitun nopan.
     */
    public void vaihdaNopanLukitus() {
        if (!this.lukittu) {
            this.lukittu = true;
        } else {
            this.lukittu = false;
        }
    }
}
