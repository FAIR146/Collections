package Necessarily;

public class Truck extends Vehicle{
    int numberOfWheels;
    public void setValue (int maxKm, String model, int numberOfWheels) {
        super.setValue(model, maxKm);
        this.numberOfWheels = numberOfWheels;
    }
    public int getNumberOfWheels (int numberOfWheels) {
        return numberOfWheels;
    }
}
