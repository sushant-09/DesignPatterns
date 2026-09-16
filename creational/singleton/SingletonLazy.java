package creational.singleton;

public class SingletonLazy {
    private static SingletonLazy SINGLETON = null;

    private SingletonLazy(){

    }

    public static SingletonLazy getInstance(){
        if(SINGLETON==null){
            SINGLETON = new SingletonLazy();
        }
        return SINGLETON;
    }

    public void doTask(){
        System.out.println("Task Done!");
    }
}
