package ooplab9;

public class Car {
    private String brand;
    private String color;
    private String model;
    private Engine engine;
    //constructor

    public Car(String brand, String color, String model, Engine engine) {
        this.brand = brand;
        this.color = color;
        this.model = model;
        this.engine = engine;
    }

    //getter and setter methods

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    //toString


    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", color='" + color + '\'' +
                ", model='" + model + '\'' +
                ", engine=" + engine +
                '}';
    }
}//class