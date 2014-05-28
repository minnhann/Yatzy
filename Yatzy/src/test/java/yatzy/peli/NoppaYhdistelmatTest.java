package yatzy.peli;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import yatzy.domain.Noppa;


/**
 *
 * @author minnhann
 */
public class NoppaYhdistelmatTest {

    NoppaYhdistelmat yhdistelmat;

    Noppa[] nopat;

    public NoppaYhdistelmatTest() {
    }

    @Before
    public void setUp() {
        yhdistelmat = new NoppaYhdistelmat();

        nopat = new Noppa[5];
        
        for (int i = 0; i < nopat.length; i++) {
            nopat[i] = new Noppa();            
        }

    }

    @After
    public void tearDown() {
    }

    @Test
    public void laskeePienenSuoranOikein() {
        for (int i = 0; i < 5; i++) {
            nopat[i].setArvo(i + 1);
        }
        assertEquals(15, yhdistelmat.pieniSuora(nopat));
    }

    @Test
    public void vaarillaLuvuillaPienenSuoranArvoksiNolla() {
        for (int i = 0; i < 5; i++) {
            nopat[i].setArvo(1);
        }

        assertEquals(0, yhdistelmat.pieniSuora(nopat));
    }

    @Test
    public void laskeeSuurenSuoranOikein() {
        for (int i = 0; i < 5; i++) {
            nopat[i].setArvo(i + 2);
        }
        assertEquals(20, yhdistelmat.suuriSuora(nopat));
    }

    @Test
    public void vaarillaLuvuillaSuurenSuoranArvoksiNolla() {
        for (int i = 0; i < 5; i++) {
            nopat[i].setArvo(1);
        }

        assertEquals(0, yhdistelmat.suuriSuora(nopat));
    }

    @Test
    public void laskeeSamanNumeronMaaranOikein() {
        int maara = 0;
        for (int i = 0; i < 3; i++) {
            nopat[i].setArvo(5);
            maara++;
        }

        assertEquals(maara, yhdistelmat.montakoSamaaNumeroa(nopat, 5));
    }

    @Test
    public void loytaaYhdenParin() {
        nopat[0].setArvo(6);
        nopat[3].setArvo(6);

        assertEquals(12, yhdistelmat.yksiPari(nopat));
    }

    @Test
    public void loytaaYkkosParin() {
        nopat[0].setArvo(1);
        nopat[3].setArvo(1);

        assertEquals(2, yhdistelmat.yksiPari(nopat));
    }

    @Test
    public void josEiYhtaanPariaPalauttaaNollan() {
        for (int i = 0; i < 5; i++) {
            nopat[i].setArvo(i + 1);
        }

        assertEquals(0, yhdistelmat.yksiPari(nopat));
    }

    @Test
    public void loytaaKaksiParia() {
        nopat[0].setArvo(2);
        nopat[1].setArvo(3);
        nopat[2].setArvo(3);
        nopat[3].setArvo(2);

        assertEquals(10, yhdistelmat.kaksiParia(nopat));
    }

    @Test
    public void loytaaYkkosJaKuutosParin() {
        nopat[0].setArvo(1);
        nopat[1].setArvo(6);
        nopat[2].setArvo(1);
        nopat[3].setArvo(6);

        assertEquals(14, yhdistelmat.kaksiParia(nopat));
    }

    @Test
    public void josEiKahtaPariaPalauttaaNollan() {
        for (int i = 0; i < 5; i++) {
            nopat[i].setArvo(i + 1);
        }

        assertEquals(0, yhdistelmat.kaksiParia(nopat));
    }

    @Test
    public void loytaaTaydenKaden() {
        for (int i = 0; i < 3; i++) {
            nopat[i].setArvo(4);
        }
        nopat[3].setArvo(3);
        nopat[4].setArvo(3);

        assertEquals(18, yhdistelmat.taysikasi(nopat));
    }

    @Test
    public void loytaaYkkosJaKuutosTaydenKaden() {
        for (int i = 0; i < 3; i++) {
            nopat[i].setArvo(1);
        }
        nopat[3].setArvo(6);
        nopat[4].setArvo(6);

        assertEquals(15, yhdistelmat.taysikasi(nopat));
    }

    @Test
    public void josEiTayttaKattaPalauttaaNollan() {
        for (int i = 0; i < 5; i++) {
            nopat[i].setArvo(1);
        }

        assertEquals(0, yhdistelmat.taysikasi(nopat));
    }

    @Test
    public void josLoydettyKaksiLaskeeTaydenKadenOikein() {
        nopat[4].setArvo(6);
        nopat[3].setArvo(6);
        nopat[2].setArvo(2);
        nopat[1].setArvo(2);
        nopat[0].setArvo(2);
        
        assertEquals(18, yhdistelmat.taysikasi(nopat));
    }

    @Test
    public void loytaaYatzyn() {
        for (int i = 0; i < 5; i++) {
            nopat[i].setArvo(3);
        }

        assertEquals(50, yhdistelmat.yatzy(nopat));
    }

    @Test
    public void josEiYatzyaPalauttaaNollan() {
        for (int i = 0; i < 4; i++) {
            nopat[i].setArvo(3);
        }
        nopat[4].setArvo(2);

        assertEquals(0, yhdistelmat.yatzy(nopat));
    }

    @Test
    public void laskeeSattumanSummanOikein() {
        for (int i = 0; i < 3; i++) {
            nopat[i].setArvo(1);
        }
        nopat[3].setArvo(5);
        nopat[4].setArvo(2);

        assertEquals(10, yhdistelmat.sattuma(nopat));
    }

}
