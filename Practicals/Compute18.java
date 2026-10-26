
import java.util.Scanner;

class Employee {
    private int id;
    public String name;
    protected String department;
    static int count = 0;

    Employee(int id, String name, String department) {
        this.id = id;
        this.name = name;
        this.department = department;
        count++;
    }

    void display() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Department: " + department);
    }
}

public class Compute18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of employees: ");
        int n = sc.nextInt();
        sc.nextLine();

        Employee[] e = new Employee[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter ID: ");
            int id = sc.nextInt();
            sc.nextLine();

            System.out.print("Enter name: ");
            String name = sc.nextLine();

            System.out.print("Enter department: ");
            String dept = sc.nextLine();

            e[i] = new Employee(id, name, dept);
        }

        for (int i = 0; i < n; i++) {
            e[i].display();
        }

        System.out.println("Total employees: " + Employee.count);
        sc.close();
    }
}
