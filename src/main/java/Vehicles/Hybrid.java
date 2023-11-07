package Vehicles;

import CarParts.CarPart;

import java.util.ArrayList;

public class Hybrid extends Vehicle{
    public Hybrid(String make, String model, String colour, int price, ArrayList<CarPart> parts) {
        super(make, model, colour, price, parts);
    }
}
