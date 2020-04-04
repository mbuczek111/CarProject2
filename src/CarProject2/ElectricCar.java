package CarProject2;

public class ElectricCar extends Car implements Chargable {
    ElectricCar(String manufacturer, String model) {
        super(manufacturer, model);
    }

    @Override
    public void charge() {
        System.out.println("The electric car has been charged.");
    }
}
