package Necessarily;

import java.io.BufferedWriter;

public class Main {
    public static void main(String[] args) {
        Bmw bmw = new Bmw();
        bmw.setValue(150, "x5", "blue");
        Truck truck = new Truck();
        truck.setValue(140, "Actros", 10);
        Vehicle vehicle = new Bmw();
        Bmw bmw1 = (Bmw) vehicle;
        Bmw bmw2 = (Bmw) returnVehicle();
    }
    public static Vehicle returnVehicle () {
        Bmw bmw = new Bmw();
        return bmw;
    }
}
