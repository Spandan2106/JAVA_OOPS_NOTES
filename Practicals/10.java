import java.util.Scanner;
import java.util.Vector;

class VectorDemo {

    Vector<Integer> v = new Vector<Integer>();

    VectorDemo() {
        v.add(10);
        v.add(20);
        v.add(30);
        v.add(40);
        v.add(50);
    }

    void display() {
        System.out.println("Vector Elements: " + v);
    }

    void insert(int position, int value) {
        if (position >= 0 && position <= v.size()) {
            v.add(position, value);
            System.out.println("Element Inserted Successfully!");
        } else {
            System.out.println("Invalid Position!");
        }
    }

    void remove(int position) {
        if (position >= 0 && position < v.size()) {
            v.remove(position);
            System.out.println("Element Removed Successfully!");
        } else {
            System.out.println("Invalid Position!");
        }
    }

    void search(int value) {
        if (v.contains(value)) {
            System.out.println("Element Found!");
        } else {
            System.out.println("Element Not Found!");
        }
    }

    void details() {
        System.out.println("Vector Size: " + v.size());
        System.out.println("Vector Capacity: " + v.capacity());
    }
}

public class VectorOperations {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        VectorDemo obj = new VectorDemo();

        while (true) {

            System.out.println("\n===== VECTOR MENU =====");
            System.out.println("1. Display Elements");
            System.out.println("2. Insert Element");
            System.out.println("3. Remove Element");
            System.out.println("4. Search Element");
            System.out.println("5. Display Size and Capacity");
            System.out.println("6. Exit");

            System.out.print("Enter Choice: ");
            int ch = sc.nextInt();

            switch (ch) {

                case 1:
                    obj.display();
                    break;

                case 2:
                    System.out.print("Enter Position: ");
                    int pos = sc.nextInt();

                    System.out.print("Enter Value: ");
                    int val = sc.nextInt();

                    obj.insert(pos, val);
                    obj.display();
                    break;

                case 3:
                    System.out.print("Enter Position to Remove: ");
                    int p = sc.nextInt();

                    obj.remove(p);
                    obj.display();
                    break;

                case 4:
                    System.out.print("Enter Element to Search: ");
                    int n = sc.nextInt();

                    obj.search(n);
                    break;

                case 5:
                    obj.details();
                    break;

                case 6:
                    System.out.println("Program Terminated.");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid Choice!");
            }
        }
    }
}
