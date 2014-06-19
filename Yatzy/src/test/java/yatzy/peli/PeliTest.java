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
    public void alussaHeitotYksi() {
        assertEquals(1, peli.getHeitot());
    }

    @Test
    public void alussaKierroksenaYksi() {
        assertEquals(1, peli.getKierros());
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
        peli.lisaaPelaajallePisteita(0, null);

        assertEquals(3, peli.pelaajat.get(0).getPisteet(0));
    }

    @Test
    public void josEiYkkosiaNiinPisteiksiTuleeNolla() {
        peli.nopat[0].setArvo(3);
        peli.nopat[1].setArvo(3);
        peli.nopat[2].setArvo(3);
        peli.nopat[3].setArvo(6);
        peli.nopat[4].setArvo(5);
        peli.lisaaPelaajallePisteita(0, null);

        assertEquals(0, peli.pelaajat.get(0).getPisteet(0));
    }

    @Test
    public void josLoytyyYksiPariNiinLisataanPisteita() {
        peli.nopat[0].setArvo(1);
        peli.nopat[1].setArvo(1);
        peli.nopat[2].setArvo(3);
        peli.nopat[3].setArvo(4);
        peli.nopat[4].setArvo(6);
        peli.lisaaPelaajallePisteita(8, null);

        assertEquals(2, peli.pelaajat.get(0).getPisteet(8));
    }

    @Test
    public void josEiLoydyPariaNiinPisteiksiNolla() {
        peli.nopat[0].setArvo(1);
        peli.nopat[1].setArvo(2);
        peli.nopat[2].setArvo(3);
        peli.nopat[3].setArvo(4);
        peli.nopat[4].setArvo(5);
        peli.lisaaPelaajallePisteita(8, null);

        assertEquals(0, peli.pelaajat.get(0).getPisteet(8));
    }

    @Test
    public void josLoytyyKaksiPariaNiinPisteetKasvavat() {
        peli.nopat[0].setArvo(1);
        peli.nopat[1].setArvo(1);
        peli.nopat[2].setArvo(3);
        peli.nopat[3].setArvo(3);
        peli.nopat[4].setArvo(1);
        peli.lisaaPelaajallePisteita(9, null);

        assertEquals(8, peli.pelaajat.get(0).getPisteet(9));
    }

    @Test
    public void josEiLoydyKahtaPariaNiinPisteiksiNolla() {
        peli.nopat[0].setArvo(1);
        peli.nopat[1].setArvo(2);
        peli.nopat[2].setArvo(3);
        peli.nopat[3].setArvo(4);
        peli.nopat[4].setArvo(1);
        peli.lisaaPelaajallePisteita(9, null);

        assertEquals(0, peli.pelaajat.get(0).getPisteet(9));
    }

    @Test
    public void kolmeSamanlaistaKasvattaaPisteita() {
        peli.nopat[0].setArvo(1);
        peli.nopat[1].setArvo(1);
        peli.nopat[2].setArvo(3);
        peli.nopat[3].setArvo(4);
        peli.nopat[4].setArvo(1);
        peli.lisaaPelaajallePisteita(10, null);

        assertEquals(3, peli.pelaajat.get(0).getPisteet(10));
    }

    @Test
    public void josEiKolmeaSamanlaistaPisteiksiNolla() {
        peli.nopat[0].setArvo(1);
        peli.nopat[1].setArvo(2);
        peli.nopat[2].setArvo(3);
        peli.nopat[3].setArvo(4);
        peli.nopat[4].setArvo(1);
        peli.lisaaPelaajallePisteita(10, null);

        assertEquals(0, peli.pelaajat.get(0).getPisteet(10));
    }

    @Test
    public void neljaSamanlaistaKasvattaaPisteita() {
        peli.nopat[0].setArvo(1);
        peli.nopat[1].setArvo(1);
        peli.nopat[2].setArvo(3);
        peli.nopat[3].setArvo(1);
        peli.nopat[4].setArvo(1);
        peli.lisaaPelaajallePisteita(11, null);

        assertEquals(4, peli.pelaajat.get(0).getPisteet(11));
    }

    @Test
    public void josEiNeljaaSamanlaistaPisteiksiNolla() {
        peli.nopat[0].setArvo(1);
        peli.nopat[1].setArvo(1);
        peli.nopat[2].setArvo(3);
        peli.nopat[3].setArvo(4);
        peli.nopat[4].setArvo(1);
        peli.lisaaPelaajallePisteita(11, null);

        assertEquals(0, peli.pelaajat.get(0).getPisteet(11));
    }

    @Test
    public void PieniSuoraKasvattaaPisteita() {
        peli.nopat[0].setArvo(1);
        peli.nopat[1].setArvo(2);
        peli.nopat[2].setArvo(5);
        peli.nopat[3].setArvo(4);
        peli.nopat[4].setArvo(3);
        peli.lisaaPelaajallePisteita(12, null);

        assertEquals(15, peli.pelaajat.get(0).getPisteet(12));
    }

    @Test
    public void josEiPientaSuoraaPisteiksiNolla() {
        peli.nopat[0].setArvo(1);
        peli.nopat[1].setArvo(1);
        peli.nopat[2].setArvo(3);
        peli.nopat[3].setArvo(4);
        peli.nopat[4].setArvo(1);
        peli.lisaaPelaajallePisteita(12, null);

        assertEquals(0, peli.pelaajat.get(0).getPisteet(12));
    }

    @Test
    public void suuriSuoraKasvattaaPisteita() {
        peli.nopat[0].setArvo(2);
        peli.nopat[1].setArvo(6);
        peli.nopat[2].setArvo(3);
        peli.nopat[3].setArvo(4);
        peli.nopat[4].setArvo(5);
        peli.lisaaPelaajallePisteita(13, null);

        assertEquals(20, peli.pelaajat.get(0).getPisteet(13));
    }

    @Test
    public void josEiSuurtaSuoraaPisteiksiNolla() {
        peli.nopat[0].setArvo(1);
        peli.nopat[1].setArvo(1);
        peli.nopat[2].setArvo(3);
        peli.nopat[3].setArvo(4);
        peli.nopat[4].setArvo(1);
        peli.lisaaPelaajallePisteita(13, null);

        assertEquals(0, peli.pelaajat.get(0).getPisteet(13));
    }

    @Test
    public void taysiKasiKasvattaaPisteita() {
        peli.nopat[0].setArvo(1);
        peli.nopat[1].setArvo(1);
        peli.nopat[2].setArvo(3);
        peli.nopat[3].setArvo(3);
        peli.nopat[4].setArvo(1);
        peli.lisaaPelaajallePisteita(14, null);

        assertEquals(9, peli.pelaajat.get(0).getPisteet(14));
    }

    @Test
    public void josEiTayttaKattaPisteiksiNolla() {
        peli.nopat[0].setArvo(1);
        peli.nopat[1].setArvo(1);
        peli.nopat[2].setArvo(3);
        peli.nopat[3].setArvo(4);
        peli.nopat[4].setArvo(1);
        peli.lisaaPelaajallePisteita(14, null);

        assertEquals(0, peli.pelaajat.get(0).getPisteet(14));
    }

    @Test
    public void yatzyKasvattaaPisteita() {
        peli.nopat[0].setArvo(1);
        peli.nopat[1].setArvo(1);
        peli.nopat[2].setArvo(1);
        peli.nopat[3].setArvo(1);
        peli.nopat[4].setArvo(1);
        peli.lisaaPelaajallePisteita(15, null);

        assertEquals(50, peli.pelaajat.get(0).getPisteet(15));
    }

    @Test
    public void josEiYatzyaPisteiksiNolla() {
        peli.nopat[0].setArvo(1);
        peli.nopat[1].setArvo(1);
        peli.nopat[2].setArvo(3);
        peli.nopat[3].setArvo(4);
        peli.nopat[4].setArvo(1);
        peli.lisaaPelaajallePisteita(15, null);

        assertEquals(0, peli.pelaajat.get(0).getPisteet(15));
    }

    @Test
    public void sattumaanSummaksiNoppienSumma() {
        peli.nopat[0].setArvo(1);
        peli.nopat[1].setArvo(1);
        peli.nopat[2].setArvo(3);
        peli.nopat[3].setArvo(4);
        peli.nopat[4].setArvo(1);
        peli.lisaaPelaajallePisteita(16, null);

        assertEquals(10, peli.pelaajat.get(0).getPisteet(16));
    }

    @Test
    public void pisteidenLisaysVaihtaaVuoroa() {
        peli.lisaaPelaajallePisteita(0, null);

        assertEquals(1, peli.getVuoro());
    }
    
    @Test
    public void josVuoroVaihtuuEnsimmaisellePelaajalleKierroksetKasvavat(){
        peli.vaihdaVuoroa();
        peli.vaihdaVuoroa();
        
        assertEquals(2, peli.getKierros());
    }

    @Test
    public void josKierroksiaJaljellaNiinPeliJatkuu() {
        assertEquals(false, peli.loppuikoPeli());

        peli.setKierros(15);
        assertEquals(false, peli.loppuikoPeli());
    }

    @Test
    public void josKierroksetLoppuivatNiinPeliPaattyy() {
        peli.setKierros(16);
        assertEquals(true, peli.loppuikoPeli());
    }

    @Test
    public void tarkistaVoittajaLoytaaVoittajan() {
        peli.pelaajat.get(0).setPisteet(50);
        peli.pelaajat.get(1).setPisteet(100);

        assertEquals("Pelaaja 2", peli.tarkistaVoittaja());
    }

    @Test
    public void josTasapeliMolemmatListataanVoittajina() {
        peli.pelaajat.get(0).setPisteet(100);
        peli.pelaajat.get(1).setPisteet(100);
        
        assertEquals("Pelaaja 1 ja Pelaaja 2", peli.tarkistaVoittaja());
    }
    
    @Test
    public void noppiaEiHeitetaJosHeitettyJoKolmesti(){
        peli.heitaNoppia();
        peli.heitaNoppia();
        int ekanNopanArvo = peli.nopat[0].getArvo();
        peli.heitaNoppia();
        
        assertEquals(ekanNopanArvo, peli.nopat[0].getArvo());
    }
    
    @Test
    public void noppiaEiHeitetaJosKierroksiaEiOleJaljella(){
        int ekanNopanArvo = peli.nopat[0].getArvo();
        peli.setKierros(16);
        peli.heitaNoppia();
        
        assertEquals(ekanNopanArvo, peli.nopat[0].getArvo());
    }
    
    @Test
    public void vuoroaVaihdettaessaKierrosEiKasvaJosVuorossaEiOleEkaPelaaja(){
        peli.vaihdaVuoroa();
        
        assertEquals(1, peli.getKierros());
    }
    
}
