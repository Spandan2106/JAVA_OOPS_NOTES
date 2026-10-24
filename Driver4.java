import java.util.Scanner;

class Fibonacci {

    int fib(int n) {
        if (n == 0)
            return 0;

        if (n == 1)
            return 1;

        return fib(n - 1) + fib(n - 2);
    }

}

class Driver4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n: ");
        int n = sc.nextInt();
        Fibonacci fibonacci = new Fibonacci();

        for (int i = 0; i < n; i++) {
            System.out.print(fibonacci.fib(i) + " ");
        }

        sc.close();
    }
}