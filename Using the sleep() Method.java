
import java.util.Scanner;

class NumberThread extends Thread {
    public void run() {
        try {
            for (int i = 1; i <= 5; i++) {
                System.out.println(i);
                Thread.sleep(1000);
            }
        }
        catch (InterruptedException e) {
            System.out.println("Thread interrupted");
        }
    }
}

public class Compute4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        NumberThread t = new NumberThread();
        t.start();

        sc.close();
    }
}
