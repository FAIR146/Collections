package Necessarily;

public class Vehicle {
    String model;
    int maxKm;

    public void setValue (String model, int maxKm) {
        this.model = model;
        this.maxKm = maxKm;
    }
    public String getModel (String model) {
        return model;
    }
    public int getMaxKm (int maxKm) {
        return maxKm;
    }
}
