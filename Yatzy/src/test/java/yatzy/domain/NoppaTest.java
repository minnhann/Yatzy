package yatzy.domain;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

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
        noppa.vaihdaNopanLukitus();
        
        assertEquals(true, noppa.onkoLukittu());
    }
    
    @Test
    public void noppaaEiHeitetaJosNoppaLukittu(){
        int arvo = noppa.getArvo();
        noppa.vaihdaNopanLukitus();
        noppa.heitaNoppaa();
        
        assertEquals(arvo, noppa.getArvo());
    }







}
