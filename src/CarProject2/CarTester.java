package CarProject2;

public class CarTester {
    public static void main(String[] args) {

        FuelCar benz = new FuelCar("Mercedes", "A");
        ElectricCar tesla = new ElectricCar("Tesla", "B");
        HybridCar toyota = new HybridCar("Toyota", "C");

        Car [] array ={benz,tesla,toyota};

        for(int i=0; i<3; i++)
        {
            if (array[i] instanceof Tankable)
            {
                Tankable carT = (Tankable) array[i];
                carT.tank();
            }
            if (array[i] instanceof Chargable)
            {
                Chargable carC = (Chargable) array[i];
                carC.charge();
            }
        }

    }
}
