package org.example;

public class WhipDecorator extends CoffeeDecorator {
    public WhipDecorator(Coffee coffee) {
        super(coffee);
    }

    @Override
    public String getDescription() {
        return coffee.getDescription() + ", Whip";
    }

    @Override
    public double getCost() {
        return coffee.getCost() + 3.0;
    }

}
