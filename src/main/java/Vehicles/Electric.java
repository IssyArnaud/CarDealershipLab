package Vehicles;

import CarParts.CarPart;

import java.util.ArrayList;

public class Electric extends Vehicle{
    public Electric(String make, String model, String colour, int price, ArrayList<CarPart> parts) {
        super(make, model, colour, price, parts);
    }
}
