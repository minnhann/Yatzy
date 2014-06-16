package yatzy.peli;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Minna
 */
public class PeliTest {

    Peli peli;

    public PeliTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
        peli = new Peli();
        peli.luoPelaajat(2);
    }

    @After
    public void tearDown() {
    }

    @Test
    public void konstruktoriLuoAlussaViisiNoppaa() {
        assertEquals(5, peli.nopat.length);
    }

    @Test
    public void luoOikeanMaaranPelaajiaPelaajat() {
        assertEquals(2, peli.pelaajat.size());
    }

    @Test
    public void alussaHeitotNolla() {
        assertEquals(1, peli.getHeitot());
    }

    @Test
    public void alussaVuoroEnsimmaisellaPelaajalla() {
        assertEquals(0, peli.getVuoro());
    }

    @Test
    public void kunHeitetaanNoppiaHeittojenMaaraKasvaa() {
        peli.heitaNoppia();

        assertEquals(2, peli.getHeitot());
    }

    @Test
    public void vuoronVaihtuessaHeitotNollautuu() {
        peli.vaihdaVuoroa();

        assertEquals(1, peli.getHeitot());
    }

    @Test
    public void vuoroVaihtuuSeuraavallePelaajalle() {
        peli.vaihdaVuoroa();

        assertEquals(1, peli.getVuoro());

    }

    @Test
    public void eiHeitaNoppiaJosHeitettyJoKolmesti() {
        peli.heitaNoppia();
        peli.heitaNoppia();
        peli.heitaNoppia();
        peli.heitaNoppia();

        assertEquals(3, peli.getHeitot());
    }

    @Test
    public void luoPelaajatNimeaaOikein() {
        peli.luoPelaajat(1);

        assertEquals("Pelaaja 1", peli.pelaajat.get(0).getNimi());
    }

    @Test
    public void heitaNoppiaHeittaaNoppia() {
        peli.nopat[0].vaihdaNopanLukitus();

        peli.arvoUudetNopatSeuraavalleVuorolle();

        assertEquals(false, peli.nopat[0].onkoLukittu());
    }

    @Test
    public void lisaaPelaajallePisteitaLaskeeOikeinYkkosilla() {
        peli.nopat[0].setArvo(1);
        peli.nopat[1].setArvo(1);
        peli.nopat[2].setArvo(3);
        peli.nopat[3].setArvo(4);
        peli.nopat[4].setArvo(1);
        peli.lisaaPelaajallePisteita(0);

        assertEquals(3, peli.pelaajat.get(0).getPisteet(0));
    }

    @Test
    public void josEiYkkosiaNiinPisteiksiTuleeNolla() {
        peli.nopat[0].setArvo(3);
        peli.nopat[1].setArvo(3);
        peli.nopat[2].setArvo(3);
        peli.nopat[3].setArvo(6);
        peli.nopat[4].setArvo(5);
        peli.lisaaPelaajallePisteita(0);

        assertEquals(0, peli.pelaajat.get(0).getPisteet(0));
    }

    @Test
    public void josLoytyyYksiPariNiinLisataanPisteita() {
        peli.nopat[0].setArvo(1);
        peli.nopat[1].setArvo(1);
        peli.nopat[2].setArvo(3);
        peli.nopat[3].setArvo(4);
        peli.nopat[4].setArvo(6);
        peli.lisaaPelaajallePisteita(8);

        assertEquals(2, peli.pelaajat.get(0).getPisteet(8));
    }

    @Test
    public void josEiLoydyPariaNiinPisteiksiNolla() {
        peli.nopat[0].setArvo(1);
        peli.nopat[1].setArvo(2);
        peli.nopat[2].setArvo(3);
        peli.nopat[3].setArvo(4);
        peli.nopat[4].setArvo(5);
        peli.lisaaPelaajallePisteita(8);

        assertEquals(0, peli.pelaajat.get(0).getPisteet(8));
    }

    @Test
    public void josLoytyyKaksiPariaNiinPisteetKasvavat() {
        peli.nopat[0].setArvo(1);
        peli.nopat[1].setArvo(1);
        peli.nopat[2].setArvo(3);
        peli.nopat[3].setArvo(3);
        peli.nopat[4].setArvo(1);
        peli.lisaaPelaajallePisteita(9);

        assertEquals(8, peli.pelaajat.get(0).getPisteet(9));
    }

    @Test
    public void josEiLoydyKahtaPariaNiinPisteiksiNolla() {
        peli.nopat[0].setArvo(1);
        peli.nopat[1].setArvo(2);
        peli.nopat[2].setArvo(3);
        peli.nopat[3].setArvo(4);
        peli.nopat[4].setArvo(1);
        peli.lisaaPelaajallePisteita(9);

        assertEquals(0, peli.pelaajat.get(0).getPisteet(9));
    }

    @Test
    public void kolmeSamanlaistaKasvattaaPisteita() {
        peli.nopat[0].setArvo(1);
        peli.nopat[1].setArvo(1);
        peli.nopat[2].setArvo(3);
        peli.nopat[3].setArvo(4);
        peli.nopat[4].setArvo(1);
        peli.lisaaPelaajallePisteita(10);

        assertEquals(3, peli.pelaajat.get(0).getPisteet(10));
    }

    @Test
    public void josEiKolmeaSamanlaistaPisteiksiNolla() {
        peli.nopat[0].setArvo(1);
        peli.nopat[1].setArvo(2);
        peli.nopat[2].setArvo(3);
        peli.nopat[3].setArvo(4);
        peli.nopat[4].setArvo(1);
        peli.lisaaPelaajallePisteita(10);

        assertEquals(0, peli.pelaajat.get(0).getPisteet(10));
    }

    @Test
    public void neljaSamanlaistaKasvattaaPisteita() {
        peli.nopat[0].setArvo(1);
        peli.nopat[1].setArvo(1);
        peli.nopat[2].setArvo(3);
        peli.nopat[3].setArvo(1);
        peli.nopat[4].setArvo(1);
        peli.lisaaPelaajallePisteita(11);

        assertEquals(4, peli.pelaajat.get(0).getPisteet(11));
    }

    @Test
    public void josEiNeljaaSamanlaistaPisteiksiNolla() {
        peli.nopat[0].setArvo(1);
        peli.nopat[1].setArvo(1);
        peli.nopat[2].setArvo(3);
        peli.nopat[3].setArvo(4);
        peli.nopat[4].setArvo(1);
        peli.lisaaPelaajallePisteita(11);

        assertEquals(0, peli.pelaajat.get(0).getPisteet(11));
    }

    @Test
    public void PieniSuoraKasvattaaPisteita() {
        peli.nopat[0].setArvo(1);
        peli.nopat[1].setArvo(2);
        peli.nopat[2].setArvo(5);
        peli.nopat[3].setArvo(4);
        peli.nopat[4].setArvo(3);
        peli.lisaaPelaajallePisteita(12);

        assertEquals(15, peli.pelaajat.get(0).getPisteet(12));
    }

    @Test
    public void josEiPientaSuoraaPisteiksiNolla() {
        peli.nopat[0].setArvo(1);
        peli.nopat[1].setArvo(1);
        peli.nopat[2].setArvo(3);
        peli.nopat[3].setArvo(4);
        peli.nopat[4].setArvo(1);
        peli.lisaaPelaajallePisteita(12);

        assertEquals(0, peli.pelaajat.get(0).getPisteet(12));
    }

    @Test
    public void suuriSuoraKasvattaaPisteita() {
        peli.nopat[0].setArvo(2);
        peli.nopat[1].setArvo(6);
        peli.nopat[2].setArvo(3);
        peli.nopat[3].setArvo(4);
        peli.nopat[4].setArvo(5);
        peli.lisaaPelaajallePisteita(13);

        assertEquals(20, peli.pelaajat.get(0).getPisteet(13));
    }

    @Test
    public void josEiSuurtaSuoraaPisteiksiNolla() {
        peli.nopat[0].setArvo(1);
        peli.nopat[1].setArvo(1);
        peli.nopat[2].setArvo(3);
        peli.nopat[3].setArvo(4);
        peli.nopat[4].setArvo(1);
        peli.lisaaPelaajallePisteita(13);

        assertEquals(0, peli.pelaajat.get(0).getPisteet(13));
    }

    @Test
    public void taysiKasiKasvattaaPisteita() {
        peli.nopat[0].setArvo(1);
        peli.nopat[1].setArvo(1);
        peli.nopat[2].setArvo(3);
        peli.nopat[3].setArvo(3);
        peli.nopat[4].setArvo(1);
        peli.lisaaPelaajallePisteita(14);

        assertEquals(9, peli.pelaajat.get(0).getPisteet(14));
    }

    @Test
    public void josEiTayttaKattaPisteiksiNolla() {
        peli.nopat[0].setArvo(1);
        peli.nopat[1].setArvo(1);
        peli.nopat[2].setArvo(3);
        peli.nopat[3].setArvo(4);
        peli.nopat[4].setArvo(1);
        peli.lisaaPelaajallePisteita(14);

        assertEquals(0, peli.pelaajat.get(0).getPisteet(14));
    }

    @Test
    public void yatzyKasvattaaPisteita() {
        peli.nopat[0].setArvo(1);
        peli.nopat[1].setArvo(1);
        peli.nopat[2].setArvo(1);
        peli.nopat[3].setArvo(1);
        peli.nopat[4].setArvo(1);
        peli.lisaaPelaajallePisteita(15);

        assertEquals(50, peli.pelaajat.get(0).getPisteet(15));
    }

    @Test
    public void josEiYatzyaPisteiksiNolla() {
        peli.nopat[0].setArvo(1);
        peli.nopat[1].setArvo(1);
        peli.nopat[2].setArvo(3);
        peli.nopat[3].setArvo(4);
        peli.nopat[4].setArvo(1);
        peli.lisaaPelaajallePisteita(15);

        assertEquals(0, peli.pelaajat.get(0).getPisteet(15));
    }

    @Test
    public void sattumaanSummaksiNoppienSumma() {
        peli.nopat[0].setArvo(1);
        peli.nopat[1].setArvo(1);
        peli.nopat[2].setArvo(3);
        peli.nopat[3].setArvo(4);
        peli.nopat[4].setArvo(1);
        peli.lisaaPelaajallePisteita(16);

        assertEquals(10, peli.pelaajat.get(0).getPisteet(16));
    }
    
    @Test
    public void pisteidenLisaysVaihtaaVuoroa(){
        peli.lisaaPelaajallePisteita(0);
        
        assertEquals(1, peli.getVuoro());
    }
}
