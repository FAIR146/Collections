package shop;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Order {
    private Date registerDate;
    private final long numberOrder;
    private static long numberOrderGenerator = 1;
    private Date paymentDate;
    private List<Product> products = new ArrayList<>();
    private int cost;
    private final int discountMore1000 = 5;
    private final int discountToys = 10;
    public Order () {
        numberOrder = numberOrderGenerator;
        numberOrderGenerator++;
    }
    public void setRegisterDate (Date registerDate) {
        this.registerDate = registerDate;
    }
    public void setPaymentDate (Date paymentDate) {
        this.paymentDate = paymentDate;
    }
    public Date getRegisterDate() {
        return registerDate;
    }
    public long getNumberOrder () {
        return numberOrder;
    }
    public Date getPaymentDate () {
        return paymentDate;
    }

    public void setCost (int cost) {
        this.cost = cost;
    }
    public int getCost () {
        return cost;
    }
    public List<Product> getProducts () {
        return products;
    }
    public void addProduct (Product product) {
        products.add(product);
    }

    @Override
    public String toString() {
        return "Order{" +
                "registerDate=" + registerDate +
                ", numberOrder=" + numberOrder +
                ", paymentDate=" + paymentDate +
                ", products=" + products +
                ", cost=" + cost +
                '}';
    }

}
