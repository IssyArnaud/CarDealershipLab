package CarParts;

public abstract class PowerPlant extends CarPart {
    private int horsepower;
    private String fuelType;

    public PowerPlant(String name, int horsepower, String fuelType) {
        super(name);
        this.horsepower = horsepower;
        this.fuelType = fuelType;
    }

    public int getHorsepower() {
        return horsepower;
    }

    public String getFuelType() {
        return fuelType;
    }
}
