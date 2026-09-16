package creational.singleton;

public class SingletonLazyThreadSafe {
    private static volatile SingletonLazyThreadSafe singleton = null; //volatile ensures visibility between threads and prevents problematic reordering during object construction/publication.

    private SingletonLazyThreadSafe(){

    }

    public static SingletonLazyThreadSafe getInstance(){        //putting synchronized here is an overhead
        if(singleton ==null){       //so that synchronized only executes once - another overhead avoidance
            synchronized (SingletonLazyThreadSafe.class){
                if(singleton==null) {       // multiple threads might have entered the previous 'if' check
                    singleton = new SingletonLazyThreadSafe();
                }
            }
        }
        return singleton;
    }

    public void doTask(){
        System.out.println("Task Done!");
    }
}
