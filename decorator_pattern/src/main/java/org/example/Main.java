package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Coffee coffee = new BasicCoffee();

        coffee = new MilkDecorator(coffee);
        coffee = new SugarDecorator(coffee);
        coffee = new WhipDecorator(coffee);

        System.out.println(coffee.getDescription());
        System.out.println("Total Cost: $" + coffee.getCost());

    }
}