import java.util.Scanner;

abstract class Account{
    protected String name;
    protected String accountNumber;

    public void initialize(String name, String accountNumber){
        this.name = name;
        this.accountNumber = accountNumber;
    }
    public void displayAccountInfo(){
        System.out.println("Account Holder: " + name);
        System.out.println("Account Number: " + accountNumber);
    }
    public abstract void deposit(double amount);
    public abstract void withdraw(double amount);
    public abstract void display();
    
}

class SavingsAccount extends Account{
    private double balance = 0.0;
    private double minimumBalance = 1000.0;


    public void deposit(double amount){
        balance += amount;
        System.out.println("Deposited: " + amount);
    }

    public void withdraw(double amount){
        if(amount <= balance - minimumBalance){
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient balance");
        }
    }

    public void display(){
        displayAccountInfo();
        System.out.println("Balance: " + balance);
    }
}


class CurrentAccount extends Account{
    private double balance = 0.0;
    private double minimumBalance = 10000.0;
    private double overdraftLimit = 50000.0;

    public void deposit(double amount){
        balance += amount;
        System.out.println("Deposited: " + amount);
    }

    public void withdraw(double amount){
        if((amount <= balance - minimumBalance) && (amount <= overdraftLimit)){
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient balance");
        }
    }

    public void display(){
        displayAccountInfo();
        System.out.println("Balance: " + balance);
    }
}

class Compute1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the account type ( 1 for Savings, 2 for Current): ");
        int accountType = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter account holder name: ");
        String name = sc.nextLine();
        System.out.println("Enter account number: ");
        String accountNumber = sc.nextLine();
        System.out.println(" ");
        
        Account account;
        if(accountType == 1){
            account = new SavingsAccount();
        } else {
            account = new CurrentAccount();
        }
        account.initialize(name, accountNumber);
        while (true) {
            System.out.println("Enter 1 to deposit, 2 to withdraw, 3 to display account info, 4 to exit: ");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Enter amount to deposit: ");
                    double depositAmount = sc.nextDouble();
                    account.deposit(depositAmount);
                    break;
                case 2:
                    System.out.println("Enter amount to withdraw: ");
                    double withdrawAmount = sc.nextDouble();
                    account.withdraw(withdrawAmount);
                    break;
                case 3:
                    account.display();
                    break;
                case 4:
                    System.out.println("Exiting...");
                    sc.close();
                    return;
                default:
                    System.out.println("Invalid choice");
            }
        }
    }
}