package com.codecool.uml.overriding;

public class Webshop {

    public static void main(String[] args) {

        CheckoutProcess checkoutProcess = new CheckoutProcess();
        PaymentProcess paymentProcess = new PaymentProcess();
        Order order = new Order();

        System.out.println(order.getStatus());
        System.out.println();
        checkoutProcess.process(order);
        System.out.println();
        paymentProcess.process(order);
    }
}
