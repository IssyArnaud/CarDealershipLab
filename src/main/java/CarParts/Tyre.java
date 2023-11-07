package CarParts;

public class Tyre extends CarPart{
    private String brand;
    private int grip;

    public Tyre(String name, String brand, int grip) {
        super(name);
        this.brand = brand;
        this.grip = grip;
    }

    public String getBrand() {
        return brand;
    }

    public int getGrip() {
        return grip;
    }

}
