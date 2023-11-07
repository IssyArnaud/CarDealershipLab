import CarParts.CarPart;
import CarParts.Engine;
import CarParts.Motor;
import CarParts.Tyre;
import Vehicles.Combustion;
import Vehicles.Electric;
import Vehicles.Hybrid;
import Vehicles.Vehicle;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class DealershipTest {
    Dealership dealership;
    Electric car1;
    Combustion car2;
    Hybrid car3;

    ArrayList<Vehicle> vehicles;

    Tyre tyre;
    Engine engine;
    Motor motor;

    ArrayList<CarPart> parts;

    @Before
    public void setUp(){
        tyre = new Tyre("Winter", "Michelin", 9);
        engine = new Engine("V8", 400, "diesel");
        motor = new Motor("DC", 300);
        parts = new ArrayList<>();
        parts.add(tyre);
        parts.add(engine);
        parts.add(motor);
        car1 = new Electric("Nissan", "Leaf", "black", 5000, parts);
        car2 = new Combustion("Honda", "Jazz", "red", 4000, parts);
        car3 = new Hybrid("Toyota", "Prius", "Green", 6000, parts);
        vehicles = new ArrayList<>();
        vehicles.add(car1);
        vehicles.add(car2);
        vehicles.add(car3);
        dealership = new Dealership("Arnold CodeClan", vehicles, 10000);
    }

    @Test
    public void getName() {
        assertEquals("Arnold CodeClan", dealership.getName());
    }

    @Test
    public void getVehicles() {
        assertEquals(vehicles, dealership.getVehicles());
        assertEquals(car1, vehicles.get(0));

    }

    @Test
    public void getTill() {
        assertEquals(10000, dealership.getTill());
    }
}