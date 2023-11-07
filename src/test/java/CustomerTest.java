import CarParts.CarPart;
import CarParts.Motor;
import CarParts.Tyre;
import Vehicles.Electric;
import Vehicles.Vehicle;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class CustomerTest {

    Customer customer;
    Electric electricCar;
    Tyre tyre;
    Motor motor;
    ArrayList<CarPart> parts;
    ArrayList<Vehicle> vehicles;
    @Before
    public void setUp(){
        tyre = new Tyre("Winter", "Michelin", 9);
        motor = new Motor("DC", 300);
        parts = new ArrayList<>();
        parts.add(tyre);
        parts.add(motor);
        electricCar = new Electric("Nissan", "Leaf", "black", 5000, parts);
        vehicles = new ArrayList<>();
        customer = new Customer("Keith", vehicles, 7000);
    }

    @Test
    public void getName() {
    }

    @Test
    public void getVehicles() {
    }

    @Test
    public void getWallet() {
    }

    @Test
    public void reduceWallet() {
    }

    @Test
    public void addVehicle() {
    }
}