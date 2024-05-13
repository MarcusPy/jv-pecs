package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Truck
 * Do not remove no-field constructor
 */
public class Truck extends Machine {
    private String brand;
    private String model;
    private int horsePower;

    public Truck() {
    }

    public Truck(String brand, String model, int horsePower) {
        this.brand = brand;
        this.model = model;
        this.horsePower = horsePower;
    }

    @Override
    public void doWork() {
        System.out.println("Truck started to work");
    }
}
