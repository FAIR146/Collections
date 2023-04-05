package shop;

import java.util.List;

public class Product {
    private final String type;
    public final int cost;
    private final String name;

    public Product (String type, int cost, String name) {
        this.cost = cost;
        this.name = name;
        this.type = type;
    }
    public String getName () {
        return name;
    }
    public int getCost () {
        return cost;
    }
    public String getType () {
        return type;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {

        return new Product(type, cost, name);
    }

    @Override
    public String toString() {
        return "Product{" +
                "type='" + type + '\'' +
                ", cost=" + cost +
                ", name='" + name + '\'' +
                '}';
    }

}
