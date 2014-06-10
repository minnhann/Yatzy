package yatzy.domain;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author minnhann
 */
public class PelaajaTest {

    Pelaaja pelaaja;

    public PelaajaTest() {
    }

    @Before
    public void setUp() {
        pelaaja = new Pelaaja("pelaaja");
    }

    @After
    public void tearDown() {
    }

    @Test
    public void konstruktoriAsettaaAlussaPisteetNollaksi() {
        assertEquals(0, pelaaja.getPisteet());
    }

//    @Test
//    public void pisteidenLisaysToimiiOikein() {
//        pelaaja.lisaaPisteita(1);
//
//        assertEquals(1, pelaaja.getPisteet());
//    }
//
//    @Test
//    public void negatiivistenPisteidenLisaysAlussaEiOnnistu() {
//        pelaaja.lisaaPisteita(-5);
//
//        assertEquals(0, pelaaja.getPisteet());
//    }
//
//    @Test
//    public void nollanLisaysEiMuutaPisteita() {
//        pelaaja.lisaaPisteita(1);
//        pelaaja.lisaaPisteita(0);
//
//        assertEquals(1, pelaaja.getPisteet());
//    }
//    
//    @Test
//    public void negatiivistenPisteidenLisaysEiVahennaPisteita(){
//        pelaaja.lisaaPisteita(5);
//        pelaaja.lisaaPisteita(-3);
//        
//        assertEquals(5, pelaaja.getPisteet());
//    }

}
