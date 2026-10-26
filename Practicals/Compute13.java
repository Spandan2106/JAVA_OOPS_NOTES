
import java.util.Scanner;

class Buffer {
    int data;
    boolean available = false;

    synchronized void produce(int x) {
        try {
            while (available)
                wait();

            data = x;
            System.out.println("Produced: " + data);
            available = true;
            notify();
        }
        catch (InterruptedException e) {
            System.out.println(e);
        }
    }

    synchronized void consume() {
        try {
            while (!available)
                wait();

            System.out.println("Consumed: " + data);
            available = false;
            notify();
        }
        catch (InterruptedException e) {
            System.out.println(e);
        }
    }
}

class Producer extends Thread {
    Buffer b;
    int n;

    Producer(Buffer b, int n) {
        this.b = b;
        this.n = n;
    }

    public void run() {
        for (int i = 1; i <= n; i++)
            b.produce(i);
    }
}

class Consumer extends Thread {
    Buffer b;
    int n;

    Consumer(Buffer b, int n) {
        this.b = b;
        this.n = n;
    }

    public void run() {
        for (int i = 1; i <= n; i++)
            b.consume();
    }
}

public class Compute13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of values: ");
        int n = sc.nextInt();

        Buffer b = new Buffer();
        Producer p = new Producer(b, n);
        Consumer c = new Consumer(b, n);

        p.start();
        c.start();

        sc.close();
    }
}
