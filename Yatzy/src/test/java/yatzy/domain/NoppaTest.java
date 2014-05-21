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
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        noppa = new Noppa();
    }
    
    @After
    public void tearDown() {
    }


    
     @Test
     public void konstruktoriAsettaaArvonOikein(){
         
         assertEquals(1, noppa.getArvo());
     }
     
     @Test
     public void konstruktoriAsettaaHeitotOikein(){
         
         assertEquals(0, noppa.getHeittoKerrat());
     }
}
