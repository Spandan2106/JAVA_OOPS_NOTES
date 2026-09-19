import java.util.Scanner;
public class test2 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter your name:");
            String name = sc.nextLine();
            System.out.println("Hello, " + name + "!");
            int x = sc.nextInt();
            System.out.println("You entered: " + x);
            float y = sc.nextFloat();
            System.out.println("You entered: " + y);
        }
    }
}