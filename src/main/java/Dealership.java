import Vehicles.Vehicle;

import java.util.ArrayList;

public class Dealership {
    private String name;

    private ArrayList<Vehicle> vehicles;

    private int till;

    public Dealership(String name, ArrayList<Vehicle> vehicles, int till) {
        this.name = name;
        this.vehicles = vehicles;
        this.till = till;
    }

    public String getName() {
        return name;
    }

    public ArrayList<Vehicle> getVehicles() {
        return vehicles;
    }

    public int getTill() {
        return till;
    }

    public void removeVehicle(Vehicle vehicle){
        vehicles.remove(vehicle);
    }

    public void sellVehicle(Vehicle vehicle, Customer customer){
        customer.addVehicle(vehicle);
        customer.reduceWallet(vehicle);
        till += vehicle.getPrice();
        removeVehicle(vehicle);
    }
}
