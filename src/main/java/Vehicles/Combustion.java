package Vehicles;

import CarParts.CarPart;

import java.util.ArrayList;

public class Combustion extends Vehicle{
    public Combustion(String make, String model, String colour, int price, ArrayList<CarPart> parts) {
        super(make, model, colour, price, parts);
    }
}
