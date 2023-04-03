package Necessarily;

public class Bmw extends Vehicle {
    String color;
    public void setValue (int maxKm, String model, String color) {
        super.setValue(model,maxKm);
        this.color = color;
    }
    public String getColor (String color) {
        return color;
    }
}
