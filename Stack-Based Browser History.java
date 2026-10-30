
import java.util.Scanner;

class BrowserStack {
    String stack[];
    int top, size;

    BrowserStack(int size) {
        this.size = size;
        stack = new String[size];
        top = -1;
    }

    void visit(String website) {
        if (top == size - 1) {
            System.out.println("History is full");
        } else {
            stack[++top] = website;
            System.out.println("Website visited");
        }
    }

    void goBack() {
        if (top == -1) {
            System.out.println("No previous website");
        } else {
            System.out.println("Going back from: " + stack[top]);
            top--;
        }
    }

    void current() {
        if (top == -1)
            System.out.println("No website opened");
        else
            System.out.println("Current website: " + stack[top]);
    }

    void display() {
        if (top == -1) {
            System.out.println("History is empty");
            return;
        }

        for (int i = top; i >= 0; i--)
            System.out.println(stack[i]);
    }
}

public class Compute1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        BrowserStack b = new BrowserStack(5);

        int choice;

        do {
            System.out.println("\n1. Visit Website");
            System.out.println("2. Go Back");
            System.out.println("3. Current Website");
            System.out.println("4. Display History");
            System.out.println("5. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter website: ");
                    String site = sc.nextLine();
                    b.visit(site);
                    break;

                case 2:
                    b.goBack();
                    break;

                case 3:
                    b.current();
                    break;

                case 4:
                    b.display();
                    break;

                case 5:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid choice");
            }

        } while (choice != 5);

        sc.close();
    }
}
