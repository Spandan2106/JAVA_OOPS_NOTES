import java.util.Scanner;

class Factorial{

    int fact(int n){
        if(n==0)
            return 1;
        else
            return n*fact(n-1);
    }
}

class Driver3{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();
        Factorial f = new Factorial();
        int result = f.fact(num);
        System.out.println("Factorial of " + num + " is: " + result);
    }
}