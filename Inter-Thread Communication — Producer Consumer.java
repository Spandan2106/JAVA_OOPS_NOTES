
import java.util.Scanner;

class Buffer {
    int data;
    boolean available = false;

    synchronized void produce(int value) {
        try {
            while (available) {
                wait();
            }

            data = value;
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
            while (!available) {
                wait();
            }

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
        for (int i = 1; i <= n; i++) {
            b.produce(i);
        }
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
        for (int i = 1; i <= n; i++) {
            b.consume();
        }
    }
}

public class Compute5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of items: ");
        int n = sc.nextInt();

        if (n <= 0) {
            System.out.println("Invalid number");
            sc.close();
            return;
        }

        Buffer b = new Buffer();

        Producer p = new Producer(b, n);
        Consumer c = new Consumer(b, n);

        p.start();
        c.start();

        sc.close();
    }
}
