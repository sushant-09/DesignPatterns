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

        SingletonLazyThreadSafe singletonLazyThreadSafe1 = SingletonLazyThreadSafe.getInstance();
        SingletonLazyThreadSafe singletonLazyThreadSafe2 = SingletonLazyThreadSafe.getInstance();
        singletonLazyThreadSafe1.doTask();
        singletonLazyThreadSafe2.doTask();
        System.out.println(singletonLazyThreadSafe1==singletonLazyThreadSafe2);

        SingletonHolder singletonHolder1 = SingletonHolder.getInstance();
        SingletonHolder singletonHolder2 = SingletonHolder.getInstance();
        singletonHolder1.doTask();
        singletonHolder2.doTask();
        System.out.println(singletonHolder1==singletonHolder2);

    }
}
