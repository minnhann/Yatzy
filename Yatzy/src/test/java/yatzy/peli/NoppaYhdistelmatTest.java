package yatzy.peli;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import yatzy.domain.Pelaaja;

/**
 *
 * @author minnhann
 */
public class NoppaYhdistelmatTest {

    NoppaYhdistelmat yhdistelmat;
    Pelaaja pelaaja;

    public NoppaYhdistelmatTest() {
    }

    @Before
    public void setUp() {
        yhdistelmat = new NoppaYhdistelmat();
        pelaaja = new Pelaaja();

    }

    @After
    public void tearDown() {
    }

    @Test
    public void laskeePienenSuoranOikein() {
        for (int i = 0; i < 5; i++) {
            pelaaja.nopat.get(i).setArvo(i + 1);
        }
        assertEquals(15, yhdistelmat.pieniSuora(pelaaja));
    }

    @Test
    public void vaarillaLuvuillaPienenSuoranArvoksiNolla() {
        for (int i = 0; i < 5; i++) {
            pelaaja.nopat.get(i).setArvo(1);
        }

        assertEquals(0, yhdistelmat.pieniSuora(pelaaja));
    }

    @Test
    public void laskeeSuurenSuoranOikein() {
        for (int i = 0; i < 5; i++) {
            pelaaja.nopat.get(i).setArvo(i + 2);
        }
        assertEquals(20, yhdistelmat.suuriSuora(pelaaja));
    }

    @Test
    public void vaarillaLuvuillaSuurenSuoranArvoksiNolla() {
        for (int i = 0; i < 5; i++) {
            pelaaja.nopat.get(i).setArvo(1);
        }

        assertEquals(0, yhdistelmat.suuriSuora(pelaaja));
    }

    @Test
    public void laskeeSamanNumeronMaaranOikein() {
        int maara = 0;
        for (int i = 0; i < 3; i++) {
            pelaaja.nopat.get(i).setArvo(5);
            maara++;
        }

        assertEquals(maara, yhdistelmat.montakoSamaaNumeroa(pelaaja, 5));
    }

    @Test
    public void loytaaYhdenParin() {
        pelaaja.nopat.get(0).setArvo(4);
        pelaaja.nopat.get(3).setArvo(4);

        assertEquals(8, yhdistelmat.yksiPari(pelaaja));
    }

    @Test
    public void josEiYhtaanPariaPalauttaaNollan() {
        for (int i = 0; i < 5; i++) {
            pelaaja.nopat.get(i).setArvo(i + 1);
        }

        assertEquals(0, yhdistelmat.yksiPari(pelaaja));
    }

    @Test
    public void loytaaKaksiParia() {
        pelaaja.nopat.get(0).setArvo(2);
        pelaaja.nopat.get(1).setArvo(3);
        pelaaja.nopat.get(2).setArvo(3);
        pelaaja.nopat.get(3).setArvo(2);

        assertEquals(10, yhdistelmat.kaksiParia(pelaaja));
    }

    @Test
    public void josEiKahtaPariaPalauttaaNollan() {
        for (int i = 0; i < 5; i++) {
            pelaaja.nopat.get(i).setArvo(i + 1);
        }
        
        assertEquals(0, yhdistelmat.kaksiParia(pelaaja));
    }

}
