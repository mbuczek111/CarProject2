package CarProject2;

public class FuelCar extends Car implements Tankable {

    FuelCar(String manufacturer, String model) {
        super(manufacturer, model);
    }

    @Override
    public void tank() {
        System.out.println("The fuel car has been tanked.");
    }
}
