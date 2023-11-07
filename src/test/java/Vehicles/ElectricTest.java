package Vehicles;

import CarParts.CarPart;
import CarParts.Motor;
import CarParts.Tyre;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class ElectricTest {
Electric car;
Tyre tyre;
Motor motor;
ArrayList<CarPart> parts;
@Before
    public void before() {
    tyre = new Tyre("Winter", "Michelin", 9);
    motor = new Motor("DC", 300);
    parts = new ArrayList<>();
//    parts.add(tyre);
    parts.add(motor);
    car = new Electric("Nissan", "Leaf", "black", 5000, parts);
}

    @Test
    public void getMake() {
    assertEquals("Nissan", car.getMake());
    }

    @Test
    public void getModel() {
    assertEquals("Leaf", car.getModel());
    }

    @Test
    public void getColour() {
    assertEquals("black", car.getColour());
    }

    @Test
    public void getPrice() {
    assertEquals(5000, car.getPrice());
    }

    @Test
    public void addParts() {
    car.addParts(tyre);
    assertTrue(car.getParts().contains(tyre));
    }

    @Test
    public void getParts() {
    assertEquals(1, car.getParts().size());
    }
}