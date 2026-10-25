
import java.util.Scanner;

class Even implements Runnable {
    int n;

    Even(int n) {
        this.n = n;
    }

    public void run() {
        for (int i = 2; i <= n; i += 2) {
            System.out.println("Even: " + i);
        }
    }
}

class Odd implements Runnable {
    int n;

    Odd(int n) {
        this.n = n;
    }

    public void run() {
        for (int i = 1; i <= n; i += 2) {
            System.out.println("Odd: " + i);
        }
    }
}

public class Compute12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter limit: ");
        int n = sc.nextInt();

        Thread t1 = new Thread(new Even(n));
        Thread t2 = new Thread(new Odd(n));

        t1.setPriority(Thread.MAX_PRIORITY);
        t2.setPriority(Thread.MIN_PRIORITY);

        t1.start();
        t2.start();

        sc.close();
    }
}
