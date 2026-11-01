import java.util.Scanner;

class Bank {
    int balance;

    Bank(int balance) {
        this.balance = balance;
    }

    synchronized void deposit(int amount) {
        balance = balance + amount;

        System.out.println("Deposited: " + amount);
        System.out.println("Balance: " + balance);
    }

    synchronized void withdraw(int amount) {
        if (balance >= amount) {
            balance = balance - amount;

            System.out.println("Withdrawn: " + amount);
            System.out.println("Balance: " + balance);
        } else {
            System.out.println("Insufficient balance!");
        }
    }
}

class Deposit extends Thread {
    Bank b;
    int amount;

    Deposit(Bank b, int amount) {
        this.b = b;
        this.amount = amount;
    }

    public void run() {
        b.deposit(amount);
    }
}

class Withdraw extends Thread {
    Bank b;
    int amount;

    Withdraw(Bank b, int amount) {
        this.b = b;
        this.amount = amount;
    }

    public void run() {
        b.withdraw(amount);
    }
}

public class BankSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter initial balance: ");
        int balance = sc.nextInt();

        System.out.print("Enter deposit amount: ");
        int d = sc.nextInt();

        System.out.print("Enter withdrawal amount: ");
        int w = sc.nextInt();

        Bank b = new Bank(balance);

        Deposit t1 = new Deposit(b, d);
        Withdraw t2 = new Withdraw(b, w);

        t1.start();
        t2.start();

        sc.close();
    }
}
