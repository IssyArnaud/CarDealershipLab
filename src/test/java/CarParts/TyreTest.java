package CarParts;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class TyreTest {
    Tyre tyre;
    @Before
    public void setUp(){
        tyre = new Tyre("Winter", "Michelin", 9);
    }

    @Test
    public void getName() {
        assertEquals("Winter", tyre.getName());
    }

    @Test
    public void getBrand() {
        assertEquals("Michelin", tyre.getBrand());
    }

    @Test
    public void getGrip() {
        assertEquals(9, tyre.getGrip());
    }
}