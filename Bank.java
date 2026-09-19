import java.util.Scanner;

abstract class Account{
    
    private double accountNumber;
    private String accountHolderName;
    private double balance;

    void initialize(double accNum, String accHolderName, double bal){
        accountNumber = accNum;
        accountHolderName = accHolderName;
        balance = bal;
    }

    void display(double interest){
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder Name: " + accountHolderName);
        System.out.println("Balance: " + balance);
        System.out.println("Interest: " + interest);
        System.out.println("Total Balance: " + (balance + interest));
    }

    double getBalance(){
        return balance;
    }

    abstract  int  calculateInterest();
}

class SavingsAccount extends Account{
    private double interestRate;

    void initialize(double accNum, String accHolderName, double bal){
        super.initialize(accNum, accHolderName, bal);
        interestRate = 8.5;
    }

    int calculateInterest(){
        double interest = (getBalance() * interestRate) / 100;
        return (int) interest;
    }
    
}

class CurrentAccount extends Account{
    private double interestRate;

    void initialize(double accNum, String accHolderName, double bal, double rate){
        super.initialize(accNum, accHolderName, bal);
        interestRate = 6.5;
    }

    int calculateInterest(){
        double interest = (getBalance() * interestRate) / 100;
        return (int) interest;
    }
}

class Bank{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter Account Number: ");
        double accNum = sc.nextDouble();
        
        System.out.println("Enter Account Holder Name: ");
        sc.nextLine();
        String accHolderName = sc.nextLine();
        
        System.out.println("Enter Balance: ");
        double bal = sc.nextDouble();
        
        
        System.out.println("Select Account Type (1 for Savings, 2 for Current): ");
        int choice = sc.nextInt();
        
        
        if(choice == 1){
            SavingsAccount account1 = new SavingsAccount();
            account1.initialize(accNum, accHolderName, bal);
            int interest = account1.calculateInterest();
            System.out.println("Interest: " + interest);
            System.out.println("Account Details: ");
            account1.display(interest);
            
        } else {
            CurrentAccount account2 = new CurrentAccount();
            account2.initialize(accNum, accHolderName, bal);
            int interest = account2.calculateInterest();
            System.out.println("Interest: " + interest);
            System.out.println("Account Details: ");
            account2.display(interest);
        }
        
    }
}