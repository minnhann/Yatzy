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
        peli = new Peli(1);
    }
    
    @After
    public void tearDown() {
    }

    @Test
    public void konstruktoriLuoAlussaViisiNoppaa(){
        assertEquals(5, peli.nopat.length);        
    }
    
    @Test
    public void konstruktoriLuoAlussaPelaajan(){
        assertEquals(1, peli.pelaajat.size());
    }
}
