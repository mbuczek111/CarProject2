package CarProject2;

public class HybridCar extends Car implements Tankable, Chargable {
    HybridCar(String manufacturer, String model) {
        super(manufacturer, model);
    }

    @Override
    public void charge() {
        System.out.println("The hybrid car has been charged.");
    }

    @Override
    public void tank() {
        System.out.println("The hybrid car has been tanked.");
    }
}
