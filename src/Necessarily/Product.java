package Necessarily;

public class Product {

    private static int idGenerator = 0;// Статические члены класса
    private int id;
    public Product() {
        id = idGenerator;
        idGenerator++;
    }


    public int getId () {
        return id;
    }
}
