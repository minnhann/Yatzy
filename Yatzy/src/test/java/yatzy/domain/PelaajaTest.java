package yatzy.domain;

import org.junit.After;
import org.junit.Before;
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
    public void pisteidenLisaysToimiiOikein() {
        pelaaja.lisaaPisteita(6, 1);

        assertEquals(6, pelaaja.getPisteet(1));
    }

    @Test
    public void negatiivistenPisteidenLisaysAlussaEiOnnistu() {
        pelaaja.lisaaPisteita(-5, 1);

        assertEquals(0, pelaaja.getPisteet(1));
    }

    @Test
    public void nollanLisaysEiMuutaPisteita() {
        pelaaja.lisaaPisteita(1, 4);
        pelaaja.lisaaPisteita(0, 4);

        assertEquals(1, pelaaja.getPisteet(4));
    }
    
    @Test
    public void negatiivistenPisteidenLisaysEiVahennaPisteita(){
        pelaaja.lisaaPisteita(5, 6);
        pelaaja.lisaaPisteita(-3, 6);
        
        assertEquals(5, pelaaja.getPisteet(6));
    }
    
    @Test
    public void kokonaispisteetKasvavatPisteitaLisattaessa(){
        pelaaja.lisaaPisteita(10, 7);
        
        assertEquals(10, pelaaja.getPisteet(17));
    }
    
    @Test
    public void lisapisteetJaAlunKokonaispisteetTulevat(){
        pelaaja.lisaaPisteita(3, 0);
        pelaaja.lisaaPisteita(6, 1);
        pelaaja.lisaaPisteita(9, 2);
        pelaaja.lisaaPisteita(12, 3);
        pelaaja.lisaaPisteita(15, 4);
        pelaaja.lisaaPisteita(18, 5);
        
        assertEquals(25, pelaaja.getPisteet(7));
        assertEquals(63, pelaaja.getPisteet(6));
    }
    
    @Test
    public void pisteitaEiVoiLisataUudelleenSamaanKohtaan(){
        pelaaja.lisaaPisteita(3, 0);
        pelaaja.lisaaPisteita(5, 0);
        
        assertEquals(3, pelaaja.getPisteet(0));
    }
    @Test
    public void alussaOnkoLisattyPisteitaOnFalse(){
        assertEquals(false, pelaaja.getOnkoLisattyPisteita(0));
        assertEquals(false, pelaaja.getOnkoLisattyPisteita(17));
    }

}
