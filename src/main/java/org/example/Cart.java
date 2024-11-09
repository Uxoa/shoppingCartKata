package org.example;

import java.util.ArrayList;
import java.util.List;

public class Cart {

   List<Product> products = new ArrayList<>();

    public List<Product> getCartProducts() {
        return new ArrayList<>(products);
    }
    
    public void addProduct(Product product) {
        products.add(product);
    }
    
    @Override
    public String toString() {
        return "Cart{" +
              "products=" + products +
              '}';
    }
}
