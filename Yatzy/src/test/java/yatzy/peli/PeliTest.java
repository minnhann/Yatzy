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
    public void konstruktoriLuoAlussaViisiNoppaa(){
        assertEquals(5, peli.nopat.length);        
    }
    
    @Test
    public void luoOikeanMaaranPelaajiaPelaajat(){
        assertEquals(2, peli.pelaajat.size());
    }
    
    @Test
    public void alussaHeitotNolla(){
        assertEquals(0, peli.getHeitot());
    }
    
    @Test
    public void alussaVuoroEnsimmaisellaPelaajalla(){
        assertEquals(1, peli.getVuoro());
    }
    
    @Test
    public void kunHeitetaanNoppiaHeittojenMaaraKasvaa(){
        peli.heitaNoppia();
        
        assertEquals(1, peli.getHeitot());
    }
    
    @Test
    public void vuoronVaihtuessaHeitotNollautuu(){
        peli.vaihdaVuoroa();
        
        assertEquals(0, peli.getHeitot());
    }
    
    @Test
    public void vuoroVaihtuuSeuraavallePelaajalle(){
        peli.vaihdaVuoroa();
        
        assertEquals(2, peli.getVuoro());
        
    }
    
    @Test
    public void eiHeitaNoppiaJosHeitettyJoKolmesti(){
        peli.heitaNoppia();
        peli.heitaNoppia();
        peli.heitaNoppia();
        peli.heitaNoppia();
        
        assertEquals(3, peli.getHeitot());
    }
    
    @Test
    public void pelaajanPisteetKasvavatMetodiaKutsuttaessa(){
        peli.kasvataPelaajanPisteita(peli.pelaajat.get(1), 3);
        
        assertEquals(3, peli.pelaajat.get(1).getPisteet());
    }

}
