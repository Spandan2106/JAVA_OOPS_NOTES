
import java.util.Scanner;

class ATM {
    double balance;

    ATM(double balance) {
        this.balance = balance;
    }

    void deposit(double amount) {
        if (amount <= 0)
            throw new IllegalArgumentException("Invalid amount");

        balance += amount;
        System.out.println("Deposit successful");
    }

    void withdraw(double amount) {
        if (amount <= 0)
            throw new IllegalArgumentException("Invalid amount");

        if (amount > balance)
            throw new ArithmeticException("Insufficient balance");

        balance -= amount;
        System.out.println("Withdrawal successful");
    }

    void display() {
        System.out.println("Current balance: " + balance);
    }
}

public class Compute22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter opening balance: ");
        ATM atm = new ATM(sc.nextDouble());

        int choice;

        do {
            System.out.println("\n1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Check balance");
            System.out.println("4. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();

            try {
                if (choice == 1) {
                    System.out.print("Enter amount: ");
                    atm.deposit(sc.nextDouble());
                } else if (choice == 2) {
                    System.out.print("Enter amount: ");
                    atm.withdraw(sc.nextDouble());
                } else if (choice == 3) {
                    atm.display();
                } else if (choice != 4) {
                    System.out.println("Invalid choice");
                }
            }
            catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
            catch (ArithmeticException e) {
                System.out.println(e.getMessage());
            }

            if (choice != 4)
                atm.display();

        } while (choice != 4);

        sc.close();
    }
}
