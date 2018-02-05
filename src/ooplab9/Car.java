package ooplab9;

public class Car {
    private String brand; //ยี่ห้อ
    private String model; //รุ่น
    private String color; //สี
    private Engine engine; //ออปเจคที่เอามาใส่ในCar   **********  ความสัมพันธ์แบบ แฮดอะ

    public Car(String brand, String model, String color, Engine engine) {
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.engine = engine;
    }
    //toString

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", engine=" + engine +
                '}';
    }

    //get set Method

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }
}//class
