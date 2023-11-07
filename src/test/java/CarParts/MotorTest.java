package CarParts;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MotorTest {
    Motor motor;
    @Before
    public void setUp(){
        motor = new Motor("DC", 300);
    }

    @Test
    public void getHorsepower() {
        assertEquals(300, motor.getHorsepower());
    }

    @org.junit.Test
    public void getFuelType() {
        assertEquals("electric", motor.getFuelType());
    }

    @org.junit.Test
    public void getName() {
        assertEquals("DC", motor.getName());
    }
}