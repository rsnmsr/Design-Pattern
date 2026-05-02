package org.example;


public class Main {
    public static void main(String[] args) {
        YouTubeChannel channel = new YouTubeChannel();

        Observer sub1 = new Subscriber("Alice");
        Observer sub2 = new Subscriber("Bob");
        Observer sub3 = new Subscriber("Charlie");

        channel.subscribe(sub1);
        channel.subscribe(sub2);
        channel.subscribe(sub3);

        channel.uploadVideo("Observer Pattern Explained");

        channel.unsubscribe(sub2);

        channel.uploadVideo("Strategy Pattern in Java");

    }
}