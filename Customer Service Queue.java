
import java.util.Scanner;

class CustomerQueue {
    int queue[];
    int front, rear, size;

    CustomerQueue(int size) {
        this.size = size;
        queue = new int[size];
        front = 0;
        rear = -1;
    }

    void insert(int id) {
        if (rear == size - 1) {
            System.out.println("Queue is full");
        } else {
            queue[++rear] = id;
            System.out.println("Customer added");
        }
    }

    void delete() {
        if (front > rear) {
            System.out.println("Queue is empty");
        } else {
            System.out.println("Serving customer: " + queue[front]);
            front++;
        }
    }

    void display() {
        if (front > rear) {
            System.out.println("Queue is empty");
        } else {
            for (int i = front; i <= rear; i++)
                System.out.println(queue[i]);
        }
    }
}

public class Compute2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        CustomerQueue q = new CustomerQueue(5);

        int choice;

        do {
            System.out.println("\n1. Add Customer");
            System.out.println("2. Serve Customer");
            System.out.println("3. Display Queue");
            System.out.println("4. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter customer ID: ");
                    int id = sc.nextInt();
                    q.insert(id);
                    break;

                case 2:
                    q.delete();
                    break;

                case 3:
                    q.display();
                    break;

                case 4:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid choice");
            }

        } while (choice != 4);

        sc.close();
    }
}
