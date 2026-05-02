package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        PaymentContext context = new PaymentContext(new CardPayment());

        context.executePayment(100);

        context.setStrategy(new UpiPayment());
        context.executePayment(250);

        context.setStrategy(new PayPalPayment());
        context.executePayment(500);

    }
}