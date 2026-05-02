package org.example;
import java.util.ArrayList;
import java.util.List;

// This is the Concrete Subject
public class YouTubeChannel implements Subject {
    private List<Observer> subscribers = new ArrayList<>();
    private String latestVideo;

    @Override
    public void subscribe(Observer observer) {
        subscribers.add(observer);
    }

    @Override
    public void unsubscribe(Observer observer) {
        subscribers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : subscribers) {
            observer.update(latestVideo);
        }
    }

    public void uploadVideo(String title) {
        this.latestVideo = title;
        System.out.println("\nNew Video Uploaded: " + title);
        notifyObservers();
    }
}

