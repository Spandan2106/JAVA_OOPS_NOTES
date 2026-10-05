
import java.util.Scanner;

class BankAccount
{
    int balance;

    BankAccount(int balance)
    {
        this.balance = balance;
    }

    synchronized void deposit(int amount)
    {
        balance = balance + amount;

        System.out.println("\nDeposited: " + amount);
        System.out.println("Current Balance: " + balance);

        notify();
        notifyAll();
    }

    synchronized void withdraw(int amount) throws Exception
    {
        while(balance < amount)
        {
            System.out.println("\nInsufficient balance.");
            System.out.println("Withdrawal thread is waiting...");

            wait();
        }

        balance = balance - amount;

        System.out.println("\nWithdrawn: " + amount);
        System.out.println("Current Balance: " + balance);
    }

    void showBalance()
    {
        System.out.println("\nCurrent Balance: " + balance);
    }
}


class DepositThread implements Runnable
{
    BankAccount account;
    int amount;

    DepositThread(BankAccount account, int amount)
    {
        this.account = account;
        this.amount = amount;
    }

    public void run()
    {
        try
        {
            System.out.println("\nDeposit thread started...");

            Thread.sleep(2000);

            account.deposit(amount);

            System.out.println("Deposit thread finished.");
        }
        catch(Exception e)
        {
            System.out.println("Thread interrupted");
        }
    }
}


class WithdrawThread implements Runnable
{
    BankAccount account;
    int amount;

    WithdrawThread(BankAccount account, int amount)
    {
        this.account = account;
        this.amount = amount;
    }

    public void run()
    {
        try
        {
            System.out.println("\nWithdrawal thread started...");

            account.withdraw(amount);

            System.out.println("Withdrawal thread finished.");
        }
        catch(Exception e)
        {
            System.out.println("Thread interrupted");
        }
    }
}


public class ThreadDemo
{
    public static void main(String args[]) throws Exception
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter initial balance: ");
        int balance = sc.nextInt();

        BankAccount account = new BankAccount(balance);

        while(true)
        {
            System.out.println("\n====================");
            System.out.println("      BANK MENU");
            System.out.println("====================");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Check Balance");
            System.out.println("4. Exit");

            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();


            switch(choice)
            {
                case 1:

                    System.out.print("Enter deposit amount: ");
                    int depositAmount = sc.nextInt();

                    Thread t1 = new Thread(
                        new DepositThread(account, depositAmount)
                    );

                    t1.start();

                    // Wait for deposit thread to finish
                    t1.join();

                    break;


                case 2:

                    System.out.print("Enter withdrawal amount: ");
                    int withdrawAmount = sc.nextInt();

                    Thread t2 = new Thread(
                        new WithdrawThread(account, withdrawAmount)
                    );

                    t2.start();

                    /*
                     * Wait for withdrawal thread only if
                     * sufficient balance is already available.
                     */
                    if(account.balance >= withdrawAmount)
                    {
                        t2.join();
                    }

                    break;


                case 3:

                    account.showBalance();

                    break;


                case 4:

                    System.out.println("\nProgram ended.");

                    System.exit(0);


                default:

                    System.out.println("\nInvalid choice.");
            }
        }
    }
}