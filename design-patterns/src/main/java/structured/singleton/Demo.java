package structured.singleton;

public class Demo {

    public static void main(String[] args) {
        Thread t1 = new T1();
        Thread t2 = new T2();
        Thread t3 = new T1();

        t1.start();
        t2.start();
        t3.start();


    }
}
