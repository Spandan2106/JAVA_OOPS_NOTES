
import java.util.Scanner;

class Even implements Runnable {
    public void run() {
        for (int i = 2; i <= 10; i += 2) {
            System.out.println("Even: " + i);
        }
    }
}

class Odd implements Runnable {
    public void run() {
        for (int i = 1; i <= 10; i += 2) {
            System.out.println("Odd: " + i);
        }
    }
}

public class Compute3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Even e = new Even();
        Odd o = new Odd();

        Thread t1 = new Thread(e);
        Thread t2 = new Thread(o);

        t1.start();
        t2.start();

        sc.close();
    }
}
