package shop;

import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        ProductService productService = new ProductService();
//        System.out.println(productService.findProductCostMore100Meal());
        OrderService orderService = new OrderService();
//        System.out.println(orderService.findUnPaidOrders());
//        System.out.println(orderService.findOrdersBetweenTwoDates());
//        productService.printProductsInAlphabeticalOrder();
        orderService.findTop3PopularProducts();

    }
}
