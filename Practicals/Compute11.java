
import java.util.Scanner;

class Hello extends Thread {
    public void run() {
        try {
            for (int i = 1; i <= 5; i++) {
                System.out.println("Hello");
                Thread.sleep(500);
            }
        }
        catch (InterruptedException e) {
            System.out.println(e);
        }
    }
}

class Hi extends Thread {
    public void run() {
        try {
            for (int i = 1; i <= 5; i++) {
                System.out.println("Hi");
                Thread.sleep(500);
            }
        }
        catch (InterruptedException e) {
            System.out.println(e);
        }
    }
}

public class Compute11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Hello t1 = new Hello();
        Hi t2 = new Hi();

        t1.start();
        t2.start();

        sc.close();
    }
}
