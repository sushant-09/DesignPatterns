package behavioral.observer;

public class Main {

    public static void main(String[] args){

        User sushant = new User("Sushant");
        User akanksha = new User("Akanksha");

        YoutubeChannel powerDrift = new YoutubeChannel("PowerDrift");

        powerDrift.addSubscriber(sushant);
        powerDrift.addSubscriber(akanksha);

        powerDrift.uploadVideo("Disadvantages of a Sunroof");
        powerDrift.removeSubscriber(akanksha);
        powerDrift.uploadVideo("Virtus Facelift");

    }
}
