package creational.singleton;

public class Main {
    public static void main(String[] args){

        Singleton singleton1 = Singleton.getInstance();
        Singleton singleton2 = Singleton.getInstance();
        singleton1.doTask();
        singleton2.doTask();
        System.out.println(singleton1==singleton2);

        SingletonLazy singletonLazy1 = SingletonLazy.getInstance();
        SingletonLazy singletonLazy2 = SingletonLazy.getInstance();
        singletonLazy1.doTask();
        singletonLazy2.doTask();
        System.out.println(singletonLazy1==singletonLazy2);

    }
}
