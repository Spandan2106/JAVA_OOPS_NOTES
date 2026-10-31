
import java.util.Scanner;

class MyThread extends Thread {
    MyThread(String name) {
        super(name);
    }

    public void run() {
        System.out.println("Thread: " + getName());
        System.out.println("Priority: " + getPriority());
    }
}

public class Compute2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        MyThread t1 = new MyThread("Low Priority");
        MyThread t2 = new MyThread("Normal Priority");
        MyThread t3 = new MyThread("High Priority");

        t1.setPriority(Thread.MIN_PRIORITY);
        t2.setPriority(Thread.NORM_PRIORITY);
        t3.setPriority(Thread.MAX_PRIORITY);

        t1.start();
        t2.start();
        t3.start();

        sc.close();
    }
}
