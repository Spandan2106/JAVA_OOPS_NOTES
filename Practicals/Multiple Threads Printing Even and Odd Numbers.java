import java.util.Scanner;

class NumberPrinter {
    int n;

    NumberPrinter(int n) {
        this.n = n;
    }

    synchronized void printEven() {
        for (int i = 2; i <= n; i += 2) {
            System.out.println("Even: " + i);
        }
    }

    synchronized void printOdd() {
        for (int i = 1; i <= n; i += 2) {
            System.out.println("Odd: " + i);
        }
    }
}

class Even extends Thread {
    NumberPrinter p;

    Even(NumberPrinter p) {
        this.p = p;
    }

    public void run() {
        p.printEven();
    }
}

class Odd extends Thread {
    NumberPrinter p;

    Odd(NumberPrinter p) {
        this.p = p;
    }

    public void run() {
        p.printOdd();
    }
}

public class EvenOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter limit: ");
        int n = sc.nextInt();

        NumberPrinter p = new NumberPrinter(n);

        Even t1 = new Even(p);
        Odd t2 = new Odd(p);

        t1.start();
        t2.start();

        sc.close();
    }
}
