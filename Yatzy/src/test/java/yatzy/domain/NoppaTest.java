package yatzy.domain;

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
public class NoppaTest {

    Noppa noppa;

    public NoppaTest() {
    }

    @Before
    public void setUp() {
        noppa = new Noppa();
    }

    @After
    public void tearDown() {
    }

    @Test
    public void konstruktoriAsettaaArvonOikein() {
        assertEquals(1, noppa.getArvo());
    }

//    @Test
//    public void konstruktoriAsettaaHeitotOikein() {
//        assertEquals(0, noppa.getHeittoKerrat());
//    }
//
//    @Test
//    public void heittojenMaaraKasvaaHeitettaessa() {
//        noppa.heitaNoppaa();
//        assertEquals(1, noppa.getHeittoKerrat());
//    }

//    @Test
//    public void heittojenMaaraEiKasvaYliKolmen() {
//        noppa.heitaNoppaa();
//        noppa.heitaNoppaa();
//        noppa.heitaNoppaa();
//        noppa.heitaNoppaa();
//
//        assertEquals(3, noppa.getHeittoKerrat());
//    }
//
//    @Test
//    public void alussaHeittojaOnJaljella() {
//        assertEquals(true, noppa.onkoHeittojaJaljella());
//    }

//    @Test
//    public void kolmenHeitonJalkeenHeittojaEiOleJaljella() {
//        noppa.heitaNoppaa();
//        noppa.heitaNoppaa();
//        noppa.heitaNoppaa();
//        noppa.heitaNoppaa();
//
//        assertEquals(false, noppa.onkoHeittojaJaljella());
//    }
}
