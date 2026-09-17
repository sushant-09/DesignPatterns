package behavioral.observer;

public class User implements Subscriber{

    private String name;

    public User(String name){
        this.name = name;
    }

    @Override
    public void update(String video) {
        System.out.println(name + " received a notification for the video: \"" + video + "\"");
    }
}
