package org.example;

import org.example.Discount;

public class Product {

    Discount discount = new Discount(0.10);

    public String getName() {
        return "manzana";
    }

    public double getPrice() {
        return 20;
    }

    public double getPriceWithoutDiscount() {
        return getPrice();
    }

    public double getPriceWithDiscount() {

         return getPrice() * discount.hasDiscount();
    }
}
