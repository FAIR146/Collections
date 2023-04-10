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
//        products.put(pasta.getName(),0);
//        products.put(teddyBear.getName(), 0);
//        products.put(pencil.getName(), 0);
//        products.put(sausages.getName(), 0);
//        products.put(toyCar.getName(), 0);
//        products.put(jeans.getName(), 0);
//        products.put(iphone.getName(), 0);
    }

    public List<Order> applyDiscountToOrdersOver1000 () {
          orders.stream()
                  .filter(order -> order.getCost() > 1000)
                  .peek(order -> order.setCost((int)(order.getCost() * 0.10)));
          return orders;
    }
//    public List<Order> findTop3PopularProducts () {
//        for (int i = 0; i < products.size(); i++) {
//            products.;
//        }
//        return ;
//    }
    public List<Order> findUnPaidOrders () {
        return orders.stream()
                .filter(order -> order.getPaymentDate() == null)
                .collect(Collectors.toList());
    }
    public List<Order> applyDiscountForTheWholeOrder (double discount) {
        orders.stream()
                .peek(order -> order.setCost((int)(order.getCost() * discount)));

        return orders;
    }





}
