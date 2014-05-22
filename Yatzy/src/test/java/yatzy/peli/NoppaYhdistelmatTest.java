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
        pelaaja.nopat.get(0).setArvo(6);
        pelaaja.nopat.get(3).setArvo(6);

        assertEquals(12, yhdistelmat.yksiPari(pelaaja));
    }

    @Test
    public void loytaaYkkosParin() {
        pelaaja.nopat.get(0).setArvo(1);
        pelaaja.nopat.get(3).setArvo(1);

        assertEquals(2, yhdistelmat.yksiPari(pelaaja));
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
    public void loytaaYkkosJaKuutosParin() {
        pelaaja.nopat.get(0).setArvo(1);
        pelaaja.nopat.get(1).setArvo(6);
        pelaaja.nopat.get(2).setArvo(1);
        pelaaja.nopat.get(3).setArvo(6);

        assertEquals(14, yhdistelmat.kaksiParia(pelaaja));
    }

    @Test
    public void josEiKahtaPariaPalauttaaNollan() {
        for (int i = 0; i < 5; i++) {
            pelaaja.nopat.get(i).setArvo(i + 1);
        }

        assertEquals(0, yhdistelmat.kaksiParia(pelaaja));
    }

    @Test
    public void loytaaTaydenKaden() {
        for (int i = 0; i < 3; i++) {
            pelaaja.nopat.get(i).setArvo(4);
        }
        pelaaja.nopat.get(3).setArvo(3);
        pelaaja.nopat.get(4).setArvo(3);

        assertEquals(18, yhdistelmat.taysikasi(pelaaja));
    }

    @Test
    public void loytaaYkkosJaKuutosTaydenKaden() {
        for (int i = 0; i < 3; i++) {
            pelaaja.nopat.get(i).setArvo(1);
        }
        pelaaja.nopat.get(3).setArvo(6);
        pelaaja.nopat.get(4).setArvo(6);

        assertEquals(15, yhdistelmat.taysikasi(pelaaja));
    }

    @Test
    public void josEiTayttaKattaPalauttaaNollan() {
        for (int i = 0; i < 5; i++) {
            pelaaja.nopat.get(i).setArvo(1);
        }

        assertEquals(0, yhdistelmat.taysikasi(pelaaja));
    }

    @Test
    public void josLoydettyKaksiLaskeeTaydenKadenOikein() {
        pelaaja.nopat.get(4).setArvo(6);
        pelaaja.nopat.get(3).setArvo(6);
        pelaaja.nopat.get(2).setArvo(2);
        pelaaja.nopat.get(1).setArvo(2);
        pelaaja.nopat.get(0).setArvo(2);
        
        assertEquals(18, yhdistelmat.taysikasi(pelaaja));
    }

    @Test
    public void loytaaYatzyn() {
        for (int i = 0; i < 5; i++) {
            pelaaja.nopat.get(i).setArvo(3);
        }

        assertEquals(50, yhdistelmat.yatzy(pelaaja));
    }

    @Test
    public void josEiYatzyaPalauttaaNollan() {
        for (int i = 0; i < 4; i++) {
            pelaaja.nopat.get(i).setArvo(3);
        }
        pelaaja.nopat.get(4).setArvo(2);

        assertEquals(0, yhdistelmat.yatzy(pelaaja));
    }

    @Test
    public void laskeeSattumanSummanOikein() {
        for (int i = 0; i < 3; i++) {
            pelaaja.nopat.get(i).setArvo(1);
        }
        pelaaja.nopat.get(3).setArvo(5);
        pelaaja.nopat.get(4).setArvo(2);

        assertEquals(10, yhdistelmat.sattuma(pelaaja));
    }

}
