import java.util.Scanner;

class BankAccount {
    private String accountNumber;
    private double balance;
    private String accountHolderName;

    void initialize(String acc, double bal, String name) {
        accountNumber = acc;
        balance = bal;
        accountHolderName = name;
    }

    void deposit(double amount) {
        if (amount < 0) {
            System.out.println("Deposit amount cannot be negative.");
            return;
        }

        balance += amount;
        System.out.println("Deposited: " + amount);
    }

    void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient balance.");
        }
    }

    void display() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder Name: " + accountHolderName);
        System.out.println("Balance: " + balance);
    }

    double getBalance() {
        return balance;
    }
}

class Savings extends BankAccount {
    private double min = 1000.0;

    void deposit(double amount) {
        if (amount < 0) {
            System.out.println("Deposit amount cannot be negative.");
            return;
        }

        super.deposit(amount);
    }

    void withdraw(double amount) {
        if (amount < 0) {
            System.out.println("Withdrawal amount cannot be negative.");
            return;
        }

        if (amount <= getBalance() - min) {
            super.withdraw(amount);
        } else {
            System.out.println("Cannot withdraw. Minimum balance requirement not met.");
        }
    }
}

class Current extends BankAccount {
    private double min = 10000.0;

    void deposit(double amount) {
        if (amount < 0) {
            System.out.println("Deposit amount cannot be negative.");
            return;
        }

        super.deposit(amount);
    }

    void withdraw(double amount) {
        if (amount < 0) {
            System.out.println("Withdrawal amount cannot be negative.");
            return;
        }

        if (amount <= getBalance() - min) {
            super.withdraw(amount);
        } else {
            System.out.println("Cannot withdraw. Minimum balance requirement not met.");
        }
    }
}

class Salary extends BankAccount {
    private double min = 0.0;

    void deposit(double amount) {
        if (amount < 0) {
            System.out.println("Deposit amount cannot be negative.");
            return;
        }

        super.deposit(amount);
    }

    void withdraw(double amount) {
        if (amount < 0) {
            System.out.println("Withdrawal amount cannot be negative.");
            return;
        }

        if (amount <= getBalance() - min) {
            super.withdraw(amount);
        } else {
            System.out.println("Cannot withdraw. Minimum balance requirement not met.");
        }
    }
}

class Bankdriver {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Select account type: 1. Savings 2. Current 3. Salary");
        int choice = scanner.nextInt();
        scanner.nextLine();

        BankAccount account;

        switch (choice) {
            case 1:
                account = new Savings();
                break;

            case 2:
                account = new Current();
                break;

            case 3:
                account = new Salary();
                break;

            default:
                System.out.println("Invalid choice.");
                return;
        }

        System.out.print("Enter account number: ");
        String accNumber = scanner.nextLine();

        System.out.print("Enter initial balance: ");
        double initialBalance = scanner.nextDouble();
        scanner.nextLine();
        if (choice == 1 && initialBalance < 1000) {
            System.out.println("Savings account requires minimum initial balance of 1000.");
            return;
        }

        if (choice == 2 && initialBalance < 10000) {
            System.out.println("Current account requires minimum initial balance of 10000.");
            return;
        }

        if (choice == 3 && initialBalance < 0) {
            System.out.println("Salary account initial balance cannot be negative.");
            return;
        }

        System.out.print("Enter account holder name: ");
        String accHolderName = scanner.nextLine();

        account.initialize(accNumber, initialBalance, accHolderName);

        while (true) {
            System.out.println("\nSelect operation: 1. Deposit 2. Withdraw 3. Display 4. Exit");

            int operation = scanner.nextInt();

            switch (operation) {
                case 1:
                    System.out.print("Enter deposit amount: ");
                    double depositAmount = scanner.nextDouble();
                    account.deposit(depositAmount);
                    break;

                case 2:
                    System.out.print("Enter withdrawal amount: ");
                    double withdrawAmount = scanner.nextDouble();
                    account.withdraw(withdrawAmount);
                    break;

                case 3:
                    account.display();
                    break;

                case 4:
                    System.out.println("Exiting...");
                    return;

                default:
                    System.out.println("Invalid operation.");
            }
        }
    }
}