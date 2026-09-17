package behavioral.observer;

import java.util.ArrayList;
import java.util.List;

public class YoutubeChannel {

    private final String name;

    public YoutubeChannel(String name){
        this.name = name;
    }

    private List<Subscriber> subscribers = new ArrayList<>();

    public void addSubscriber(Subscriber subscriber){
        subscribers.add(subscriber);
    }

    public void removeSubscriber(Subscriber subscriber){
        subscribers.remove(subscriber);
    }

    public void notifySubscribers(String video){
        for(Subscriber subscriber:subscribers){
            subscriber.update(video);
        }
    }

    public void uploadVideo(String video){
        System.out.println(name + " uploaded a new video: \"" + video + "\"");
        notifySubscribers(video);
    }

}
