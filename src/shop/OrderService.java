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

    public OrderService() {
        Order order = new Order();
        Order order1 = new Order();
        Order order2 = new Order();
        orders.add(order);
        orders.add(order1);
        orders.add(order2);
        order.addProduct(pasta);
        order.addProduct(sausages);
        order.addProduct(teddyBear);
        order.addProduct(teddyBear);
        order.addProduct(pasta);
        order.setRegisterDate(new Date());
        order.setPaymentDate(new Date());
        order1.addProduct(jeans);
        order1.addProduct(toyCar);
        order1.setPaymentDate(new Date());
        order2.addProduct(iphone);
        order2.addProduct(pencil);
        order2.addProduct(pencil);
        order2.setRegisterDate(new Date());

    }

    public List<Order> applyDiscountToOrdersOver1000() {
        orders.stream()
                .filter(order -> order.getCost() > 1000)
                .forEach(order -> order.setDiscount(0.05));
        return orders;
    }

    public List<Order> findTop3PopularProducts() {
        HashMap<String, Integer> products = new HashMap<>();
        for (Order order : orders) {
            for (Product product : order.getProducts()) {
                Integer value = products.get(product.getName());
                if (value == null) {
                    products.put(product.getName(), 1);
                } else {
                    products.put(product.getName(), value + 1);
                }

            }
        }
        System.out.println(products);
        return null;
    }


    public List<Order> findOrdersBetweenTwoDates () {
        Date date = new Date (1681317816000L);
        Date date1 = new Date(1681318836000L);

        return orders.stream()
                .filter(order -> order.getPaymentDate() != null)
                .filter(order -> date.before(order.getPaymentDate()) && date1.after(order.getPaymentDate()))
                .collect(Collectors.toList());
    }
    public List<Order> findUnPaidOrders () {
        return orders.stream()
                .filter(order -> order.getPaymentDate() == null)
                .collect(Collectors.toList());
    }
    public List<Order> applyDiscountForTheWholeOrder (double discount) {
        orders.stream()
                .forEach(order -> order.setDiscount(discount));

        return orders;
    }





}
