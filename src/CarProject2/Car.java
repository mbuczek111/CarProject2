package CarProject2;

public class Car {
    private String manufacturer;
    private String model;

    Car(String manufacturer, String model)
    {
        this.manufacturer=manufacturer;
        this.model=model;
    }
    String getManufacturer()
    {
        return manufacturer;
    }
    String getModel()
    {
        return model;
    }
    void setManufacturer(String manufacturer)
    {
        this.manufacturer=manufacturer;
    }
    void setModel(String model)
    {
        this.model=model;
    }

}


