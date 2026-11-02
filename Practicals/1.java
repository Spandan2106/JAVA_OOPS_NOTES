import java.util.LinkedList;
import java.util.Queue;

class Buffer {
    Queue<Integer> queue = new LinkedList<>();
    int capacity = 5;

    synchronized void produce(int item) {
        while (queue.size() == capacity) {
            try {
                System.out.println("Buffer Full! Producer Waiting...");
                wait();
            } catch (InterruptedException e) {
                System.out.println(e);
                return;
            }
        }

        queue.add(item);
        System.out.println("Produced: " + item);

        notify();
    }

    synchronized void consume() {
        while (queue.isEmpty()) {
            try {
                System.out.println("Buffer Empty! Consumer Waiting...");
                wait();
            } catch (InterruptedException e) {
                System.out.println(e);
                return;
            }
        }

        int item = queue.remove();
        System.out.println("Consumed: " + item);

        notify();
    }
}

class Producer extends Thread {
    Buffer b;

    Producer(Buffer b) {
        this.b = b;
    }

    public void run() {
        for (int i = 1; i <= 10; i++) {
            b.produce(i);

            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                return;
            }
        }
    }
}

class Consumer extends Thread {
    Buffer b;

    Consumer(Buffer b) {
        this.b = b;
    }

    public void run() {
        for (int i = 1; i <= 10; i++) {
            b.consume();

            try {
                Thread.sleep(800);
            } catch (InterruptedException e) {
                return;
            }
        }
    }
}

public class ProducerConsumer {
    public static void main(String[] args) {
        Buffer b = new Buffer();

        Producer p = new Producer(b);
        Consumer c = new Consumer(b);

        p.start();
        c.start();
    }
}
