
public class Main {

    public static void main(String[] args) {
        MyThread Thread1 = new MyThread("Thread A");
        MyThread Thread2 = new MyThread("Thread B");
        Thread1.start();
        Thread2.start();
    }
}
