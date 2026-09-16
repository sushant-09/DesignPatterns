package creational.singleton;

public class Singleton {
    private static final Singleton singleton = new Singleton(); //eager-loading: thread safe but wastes resources
    private Singleton(){
    }

    public static Singleton getInstance(){  // static because you need a way to get the creational.singleton.Singleton object without already having a creational.singleton.Singleton object
        return singleton;
    }

    public void doTask(){
        System.out.println("Task done");
    }
}
