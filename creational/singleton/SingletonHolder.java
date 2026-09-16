package creational.singleton;

public class SingletonHolder {

    private SingletonHolder() {
    }

    private static class Holder {
        private static final SingletonHolder INSTANCE = new SingletonHolder();
    }

    public static SingletonHolder getInstance() {
        return Holder.INSTANCE;
    }

    public void doTask() {
        System.out.println("Task Done!");
    }

}
