import java.util.Scanner;

class ATM {
    int balance = 10000;

    synchronized void checkBalance() {
        System.out.println("Current Balance: " + balance);
    }

    synchronized void deposit(int amount) {
        balance += amount;
        System.out.println("Amount Deposited: " + amount);
        System.out.println("New Balance: " + balance);
    }

    synchronized void withdraw(int amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Amount Withdrawn: " + amount);
            System.out.println("New Balance: " + balance);
        } else {
            System.out.println("Insufficient Balance!");
        }
    }
}

class ATMThread extends Thread {
    ATM a;
    int choice, amount;

    ATMThread(ATM a, int choice, int amount) {
        this.a = a;
        this.choice = choice;
        this.amount = amount;
    }

    public void run() {
        switch (choice) {
            case 1:
                a.checkBalance();
                break;

            case 2:
                a.deposit(amount);
                break;

            case 3:
                a.withdraw(amount);
                break;
        }
    }
}

public class ATMSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ATM a = new ATM();

        while (true) {
            System.out.println("\n1. Check Balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Exit");

            System.out.print("Enter choice: ");
            int ch = sc.nextInt();

            if (ch == 4) {
                System.out.println("Thank You!");
                break;
            }

            int amount = 0;

            if (ch == 2 || ch == 3) {
                System.out.print("Enter amount: ");
                amount = sc.nextInt();
            }

            if (ch < 1 || ch > 4 || amount < 0) {
                System.out.println("Invalid input!");
                continue;
            }

            ATMThread t = new ATMThread(a, ch, amount);
            t.start();

            try {
                t.join();
            } catch (Exception e) {
                System.out.println(e);
            }
        }

        sc.close();
    }
}
