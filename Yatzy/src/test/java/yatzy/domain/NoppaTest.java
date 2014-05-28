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
    public void alussaNoppaEiOleLukittu(){
        assertEquals(false, noppa.onkoLukittu());
    }
    
    @Test
    public void lukitseeNopan(){
        noppa.lukitseNoppa();
        
        assertEquals(true, noppa.onkoLukittu());
    }
    
    @Test
    public void noppaaEiHeitetaJosNoppaLukittu(){
        int arvo = noppa.getArvo();
        noppa.lukitseNoppa();
        noppa.heitaNoppaa();
        
        assertEquals(arvo, noppa.getArvo());
    }







}
