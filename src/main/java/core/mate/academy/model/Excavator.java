package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Excavator
 * Do not remove no-args constructor
 */
public class Excavator extends Machine {
    private String brand;
    private String model;
    private int horsePower;

    public Excavator() {
    }

    public Excavator(String brand, String model, int horsePower) {
        this.brand = brand;
        this.model = model;
        this.horsePower = horsePower;
    }

    @Override
    public void doWork() {
        System.out.println("Excavator started to work");
    }
}
