package shop;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

public class OrderService {
    Product pasta = new Product("meal", 100, "pasta");
    Product teddyBear = new Product("toy", 1500, "teddyBear");
    Product pencil = new Product("chancellery", 20, "pencil");
    Product sausages = new Product("meal", 200, "sausages");
    Product toyCar = new Product("toy", 500, "toyCar");
    Product jeans = new Product("wear", 900, "jeans");
    Product iphone = new Product("technic", 60000, "iphone");
    ArrayList<Order> orders = new ArrayList<>();
    HashMap<String, Integer> products;
    public OrderService () {
        Order order = new Order();
        Order order1 = new Order();
        Order order2 = new Order();
        orders.add(order);
        orders.add(order1);
        orders.add(order2);
        order.addProduct(pasta);
        order.addProduct(sausages);
        order.addProduct(teddyBear);
        order.setRegisterDate(new Date());
        order.setPaymentDate(new Date());
        order1.addProduct(jeans);
        order1.addProduct(toyCar);
        order1.setPaymentDate(new Date());
        order2.addProduct(iphone);
        order2.addProduct(pencil);
        order2.setRegisterDate(new Date());
    }

//    public List<Order> applyDiscountToOrdersOver1000 () {
//        return orders.stream()
//                .filter(order -> order.getCost() > 1000)
//                .forEach();
//    }
//    public List<Order> findTop3PopularProducts () {
//        for (int i = 0; i < or)
//        return orders.stream()
//                .filter(order -> order.ge)
//    }
    public List<Order> findUnPaidOrders () {
        return orders.stream()
                .filter(order -> order.getPaymentDate() == null)
                .collect(Collectors.toList());
    }


}
