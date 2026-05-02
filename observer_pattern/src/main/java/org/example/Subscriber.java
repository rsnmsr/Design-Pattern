package org.example;

// This is concrete observer

public class Subscriber implements Observer{
    private String name;

    public Subscriber(String name) {
        this.name = name;
    }

    @Override
    public void update(String videoTitle) {
        System.out.println(name + " got notified: New video uploaded - " + videoTitle);
    }
}
