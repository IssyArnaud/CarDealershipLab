package CarParts;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class EngineTest {
    Engine engine;
    @Before
    public void setUp(){
        engine = new Engine("V8", 400, "diesel");
        }
    @Test
    public void getHorsepower() {
        assertEquals(400, engine.getHorsepower());
    }

    @org.junit.Test
    public void getFuelType() {
        assertEquals("diesel", engine.getFuelType());
    }

    @org.junit.Test
    public void getName() {
        assertEquals("V8", engine.getName());
    }
}

