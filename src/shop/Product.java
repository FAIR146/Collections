package shop;

import java.util.List;

public class Product {
    String type;
    int cost;
    String name;

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

    public void findProductCostMore100 (List<Product> products) {
        for (int i = 0; i < products.size(); i++) {
            if (products.get(i).cost >= 100) {
                System.out.println(products.get(i).getName());
            }
        }
    }

}
