package shop;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ProductService {
    Product pasta = new Product("meal", 100, "pasta");
    Product teddyBear = new Product("toy", 1500, "teddyBear");
    Product pencil = new Product("chancellery", 20, "pencil");
    Product sausages = new Product("meal", 200, "sausages");
    Product toyCar = new Product("toy", 500, "toyCar");
    Product jeans = new Product("wear", 900, "jeans");
    Product iphone = new Product("technic", 60000, "iphone");
    double discountForToys = 0.1;
     ArrayList<Product> products;

    public ProductService () {
        products = new ArrayList<>(List.of(pasta, teddyBear, pencil, sausages, toyCar, jeans, iphone));
    }

    public List<Product> findProductCostMore100Meal () {

        return products.stream()
                .filter(product -> "meal".equals(product.getType()))
                .filter(product ->  product.getCost() >= 100)
                .collect(Collectors.toList());
    }
    public List<Product> applyDiscountToToys () {
        List<Product> copyProductList = (List<Product>) products.clone();
        copyProductList.stream()
                .filter(product -> "toy".equals(product.getType()))
                .map(product -> (product.getCost() - product.getCost() * 0.1))
                .collect(Collectors.toList());
//                .forEach(System.out::println)
        return copyProductList;

    }

        private List<Product> copyProductList () {
            return (List<Product>) products.clone();

    }

}
