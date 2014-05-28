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
    
    
}
