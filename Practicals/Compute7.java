
import java.util.Scanner;

class Stack {
    int a[], top, size;

    Stack(int size) {
        this.size = size;
        a = new int[size];
        top = -1;
    }

    void push(int x) {
        if (top == size - 1)
            System.out.println("Stack Overflow");
        else {
            a[++top] = x;
            System.out.println("Element pushed");
        }
    }

    void pop() {
        if (top == -1)
            System.out.println("Stack Underflow");
        else
            System.out.println("Popped: " + a[top--]);
    }

    void peek() {
        if (top == -1)
            System.out.println("Stack is empty");
        else
            System.out.println("Top element: " + a[top]);
    }

    void display() {
        if (top == -1) {
            System.out.println("Stack is empty");
            return;
        }

        for (int i = top; i >= 0; i--)
            System.out.println(a[i]);
    }
}

public class Compute7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter stack size: ");
        int n = sc.nextInt();

        Stack s = new Stack(n);
        int ch, x;

        do {
            System.out.println("\n1.Push 2.Pop 3.Peek 4.Display 5.Exit");
            System.out.print("Enter choice: ");
            ch = sc.nextInt();

            switch (ch) {
                case 1:
                    System.out.print("Enter element: ");
                    x = sc.nextInt();
                    s.push(x);
                    break;
                case 2:
                    s.pop();
                    break;
                case 3:
                    s.peek();
                    break;
                case 4:
                    s.display();
                    break;
                case 5:
                    System.out.println("Exit");
                    break;
                default:
                    System.out.println("Invalid choice");
            }
        } while (ch != 5);

        sc.close();
    }
}
