package org.example;

public class Discount {
    private double discount;

    public Discount(double discount) {
        this.discount = discount;
    }

    public double hasDiscount() {
        return discount;
    }

    @Override
    public String toString() {
        return "Discount{" +
                "discount=" + discount +
                '}';
    }


}
