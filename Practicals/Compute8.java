
import java.util.Scanner;

class Queue {
    int a[], front, rear, size;

    Queue(int size) {
        this.size = size;
        a = new int[size];
        front = 0;
        rear = -1;
    }

    void insert(int x) {
        if (rear == size - 1)
            System.out.println("Queue Overflow");
        else {
            a[++rear] = x;
            System.out.println("Element inserted");
        }
    }

    void delete() {
        if (front > rear)
            System.out.println("Queue Underflow");
        else
            System.out.println("Deleted: " + a[front++]);
    }

    void display() {
        if (front > rear) {
            System.out.println("Queue is empty");
            return;
        }

        for (int i = front; i <= rear; i++)
            System.out.print(a[i] + " ");

        System.out.println();
    }
}

public class Compute8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter queue size: ");
        int n = sc.nextInt();

        Queue q = new Queue(n);
        int ch, x;

        do {
            System.out.println("\n1.Insert 2.Delete 3.Display 4.Exit");
            System.out.print("Enter choice: ");
            ch = sc.nextInt();

            switch (ch) {
                case 1:
                    System.out.print("Enter element: ");
                    x = sc.nextInt();
                    q.insert(x);
                    break;
                case 2:
                    q.delete();
                    break;
                case 3:
                    q.display();
                    break;
                case 4:
                    System.out.println("Exit");
                    break;
                default:
                    System.out.println("Invalid choice");
            }
        } while (ch != 4);

        sc.close();
    }
}
