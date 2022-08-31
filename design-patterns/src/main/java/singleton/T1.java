package singleton;

public class T1 extends Thread{

    @Override
    public void run() {
        Singleton2 instance = Singleton2.getInstance();
        System.out.println(instance);
    }
}
