package web.model;

public class Car {
    private String color;
    private String engine;
    private String model;

    public Car(String color, String engine, String model) {
        this.color = color;
        this.engine = engine;
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
}
