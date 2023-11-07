import Vehicles.Vehicle;

import java.util.ArrayList;

public class Customer {
    private String name;
    private ArrayList<Vehicle> vehicles;
    private int wallet;

    public Customer(String name, ArrayList<Vehicle> vehicles, int wallet) {
        this.name = name;
        this.vehicles = vehicles;
        this.wallet = wallet;
    }

    public String getName() {
        return name;
    }

    public ArrayList<Vehicle> getVehicles() {
        return vehicles;
    }

    public int getWallet() {
        return wallet;
    }

    public void reduceWallet(Vehicle vehicle) {
        if (wallet >= vehicle.getPrice()) {
            wallet -= vehicle.getPrice();
        }
    }

    public void addVehicle(Vehicle vehicle){
        vehicles.add(vehicle);
    }

}
