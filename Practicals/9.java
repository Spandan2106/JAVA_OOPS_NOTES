import java.util.Scanner;
import java.util.Vector;

class StudentOperations {

    Vector<String> v = new Vector<String>();

    StudentOperations() {
        v.add("Rahul");
        v.add("Amit");
        v.add("Priya");
        v.add("Rohan");
        v.add("Sneha");
    }

    void display() {
        System.out.println("\nStudent Names:");

        for (int i = 0; i < v.size(); i++) {
            System.out.println(v.get(i));
        }
    }

    void addStudent(String name) {
        v.add(name);
        System.out.println("Student Added Successfully!");
    }

    void removeStudent(String name) {
        if (v.remove(name)) {
            System.out.println("Student Removed Successfully!");
        } else {
            System.out.println("Student Not Found!");
        }
    }
}

public class StudentVector {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        StudentOperations obj = new StudentOperations();

        while (true) {
            System.out.println("\n===== STUDENT VECTOR MENU =====");
            System.out.println("1. Display Students");
            System.out.println("2. Add Student");
            System.out.println("3. Remove Student");
            System.out.println("4. Exit");

            System.out.print("Enter Choice: ");
            int ch = sc.nextInt();

            switch (ch) {
                case 1:
                    obj.display();
                    break;

                case 2:
                    System.out.print("Enter Student Name: ");
                    String name = sc.next();

                    obj.addStudent(name);
                    break;

                case 3:
                    System.out.print("Enter Name to Remove: ");
                    String n = sc.next();

                    obj.removeStudent(n);
                    break;

                case 4:
                    System.out.println("Program Terminated.");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid Choice!");
            }
        }
    }
}
