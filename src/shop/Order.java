package shop;

import java.util.ArrayList;
import java.util.List;

public class Order {
    private String registerDate;
    private final int numberOrder;
    private static int numberOrderGenerator = 1;
    private String paymentDate;
    private List<String> listOfProducts;
    private int cost;
    private final int discountMore1000 = 3;
    private final int discountToys = 10;
    public Order (String registerDate ,String paymentDate) {
        this.registerDate = registerDate;
        numberOrder = numberOrderGenerator;
        numberOrderGenerator++;
        this.paymentDate = paymentDate;
    }
    public String getRegisterDate() {
        return registerDate;
    }
    public int getNumberOrder () {
        return numberOrder;
    }
    public String getPaymentDate () {
        return paymentDate;
    }
    public List<String> getListOfProducts () {
        return listOfProducts;
    }
    public void setCost (int cost) {
        this.cost = cost;
    }
    public int getCost () {
        return cost;
    }
    public void setListOfProducts (String name) {
        listOfProducts.add(name);
    }

}
