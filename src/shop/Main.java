package shop;

import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        List<String> alphabet = new ArrayList<>();
        alphabet.add("abcdefghijklmnopqrstuvwxyz");
        Product pasta = new Product("meal", 100, "pasta");
        Product teddyBeat = new Product("toy", 1500, "teddyBear");
        Product pencil = new Product("chancellery", 20, "pencil");
        Product sausages = new Product("meal", 200, "sausages");
        Product toyCar = new Product("toy", 500, "toyCar");
        Product jeans = new Product("wear", 900, "jeans");
        Product iphone = new Product("technic", 60000, "iphone");
        List<Product> products = new ArrayList<>();
        products.add(pasta);
        products.add(teddyBeat);
        products.add(pencil);
        products.add(sausages);
        products.add(toyCar);
        products.add(jeans);
        products.add(iphone);
        Order order = new Order("20.03.2023", " ");

        pasta.findProductCostMore100(products);
    }
}
