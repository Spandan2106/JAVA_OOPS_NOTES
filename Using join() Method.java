
import java.util.Scanner;

class MyThread extends Thread {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Thread: " + i);
        }
    }
}

public class Compute6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        MyThread t = new MyThread();

        t.start();

        try {
            t.join();
        }
        catch (InterruptedException e) {
            System.out.println(e);
        }

        System.out.println("Main thread completed");

        sc.close();
    }
}
