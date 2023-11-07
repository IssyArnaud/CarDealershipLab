package Vehicles;

import CarParts.CarPart;

import java.util.ArrayList;

public abstract class Vehicle {
    private String make;
    private String model;
    private String colour;
    private int price;

    private ArrayList<CarPart> parts;

    public Vehicle(String make, String model, String colour, int price, ArrayList<CarPart> parts) {
        this.make = make;
        this.model = model;
        this.colour = colour;
        this.price = price;
        this.parts = parts;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public String getColour() {
        return colour;
    }

    public int getPrice() {
        return price;
    }

    public void addParts(CarPart part){
        parts.add(part);
    }

    public ArrayList<CarPart> getParts() {
        return parts;
    }
}
