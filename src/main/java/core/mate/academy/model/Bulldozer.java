package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Bulldozer
 * Do not remove no-args constructor
 */
public class Bulldozer extends Machine {
    private String brand;
    private String model;
    private int horsePower;

    public Bulldozer() {
    }

    public Bulldozer(String brand, String model, int horsePower) {
        this.brand = brand;
        this.model = model;
        this.horsePower = horsePower;
    }

    @Override
    public void doWork() {
        System.out.println("Bulldozer started to work");
    }
}
