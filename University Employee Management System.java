
import java.util.Scanner;

abstract class Employee {
    private int id;
    private String name;
    protected double basicSalary;

    Employee(int id, String name, double basicSalary) {
        this.id = id;
        this.name = name;
        this.basicSalary = basicSalary;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    abstract double calculateSalary();

    abstract void displayDetails();
}

abstract class TeachingStaff extends Employee {
    protected String department;

    TeachingStaff(int id, String name, double salary,
                  String department) {
        super(id, name, salary);
        this.department = department;
    }
}

abstract class NonTeachingStaff extends Employee {
    protected String designation;

    NonTeachingStaff(int id, String name, double salary,
                     String designation) {
        super(id, name, salary);
        this.designation = designation;
    }
}

class Professor extends TeachingStaff {
    private double researchAllowance;

    Professor(int id, String name, double salary,
              String department, double allowance) {
        super(id, name, salary, department);
        researchAllowance = allowance;
    }

    double calculateSalary() {
        return basicSalary + researchAllowance;
    }

    void displayDetails() {
        System.out.println("\nEmployee Type: Professor");
        System.out.println("ID: " + getId());
        System.out.println("Name: " + getName());
        System.out.println("Department: " + department);
        System.out.println("Basic Salary: " + basicSalary);
        System.out.println("Research Allowance: " + researchAllowance);
        System.out.println("Total Salary: " + calculateSalary());
    }
}

class LabAssistant extends TeachingStaff {
    private double laboratoryAllowance;

    LabAssistant(int id, String name, double salary,
                 String department, double allowance) {
        super(id, name, salary, department);
        laboratoryAllowance = allowance;
    }

    double calculateSalary() {
        return basicSalary + laboratoryAllowance;
    }

    void displayDetails() {
        System.out.println("\nEmployee Type: Lab Assistant");
        System.out.println("ID: " + getId());
        System.out.println("Name: " + getName());
        System.out.println("Department: " + department);
        System.out.println("Basic Salary: " + basicSalary);
        System.out.println("Laboratory Allowance: " + laboratoryAllowance);
        System.out.println("Total Salary: " + calculateSalary());
    }
}

class Accountant extends NonTeachingStaff {
    private double fixedAllowance;

    Accountant(int id, String name, double salary,
               String designation, double allowance) {
        super(id, name, salary, designation);
        fixedAllowance = allowance;
    }

    double calculateSalary() {
        return basicSalary + fixedAllowance;
    }

    void displayDetails() {
        System.out.println("\nEmployee Type: Accountant");
        System.out.println("ID: " + getId());
        System.out.println("Name: " + getName());
        System.out.println("Designation: " + designation);
        System.out.println("Basic Salary: " + basicSalary);
        System.out.println("Fixed Allowance: " + fixedAllowance);
        System.out.println("Total Salary: " + calculateSalary());
    }
}

class Clerk extends NonTeachingStaff {

    Clerk(int id, String name, double salary, String designation) {
        super(id, name, salary, designation);
    }

    double calculateSalary() {
        return basicSalary;
    }

    void displayDetails() {
        System.out.println("\nEmployee Type: Clerk");
        System.out.println("ID: " + getId());
        System.out.println("Name: " + getName());
        System.out.println("Designation: " + designation);
        System.out.println("Basic Salary: " + basicSalary);
        System.out.println("Total Salary: " + calculateSalary());
    }
}

public class UniversityManagement {

    static Scanner sc = new Scanner(System.in);

    static Employee employees[] = new Employee[100];
    static int count = 0;

    static boolean idExists(int id) {
        for (int i = 0; i < count; i++) {
            if (employees[i].getId() == id) {
                return true;
            }
        }
        return false;
    }

    static void addEmployee() {

        if (count == 100) {
            System.out.println("Employee storage is full!");
            return;
        }

        System.out.println("\n1. Professor");
        System.out.println("2. Lab Assistant");
        System.out.println("3. Accountant");
        System.out.println("4. Clerk");

        System.out.print("Enter Employee Type: ");
        int type = sc.nextInt();

        if (type < 1 || type > 4) {
            System.out.println("Invalid Employee Type!");
            return;
        }

        System.out.print("Enter Employee ID: ");
        int id = sc.nextInt();

        if (idExists(id)) {
            System.out.println("Duplicate Employee ID!");
            return;
        }

        sc.nextLine();

        System.out.print("Enter Employee Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Basic Salary: ");
        double salary = sc.nextDouble();
        sc.nextLine();

        if (salary < 0) {
            System.out.println("Invalid Salary!");
            return;
        }

        switch (type) {

            case 1:
                System.out.print("Enter Department: ");
                String dept1 = sc.nextLine();

                System.out.print("Enter Research Allowance: ");
                double research = sc.nextDouble();

                if (research < 0) {
                    System.out.println("Invalid Allowance!");
                    return;
                }

                employees[count++] =
                    new Professor(id, name, salary, dept1, research);

                break;

            case 2:
                System.out.print("Enter Department: ");
                String dept2 = sc.nextLine();

                System.out.print("Enter Laboratory Allowance: ");
                double lab = sc.nextDouble();

                if (lab < 0) {
                    System.out.println("Invalid Allowance!");
                    return;
                }

                employees[count++] =
                    new LabAssistant(id, name, salary, dept2, lab);

                break;

            case 3:
                System.out.print("Enter Designation: ");
                String des1 = sc.nextLine();

                System.out.print("Enter Fixed Allowance: ");
                double fixed = sc.nextDouble();

                if (fixed < 0) {
                    System.out.println("Invalid Allowance!");
                    return;
                }

                employees[count++] =
                    new Accountant(id, name, salary, des1, fixed);

                break;

            case 4:
                System.out.print("Enter Designation: ");
                String des2 = sc.nextLine();

                employees[count++] =
                    new Clerk(id, name, salary, des2);

                break;
        }

        System.out.println("Employee Added Successfully!");
    }

    static void displayAllEmployees() {

        if (count == 0) {
            System.out.println("No Employees Found!");
            return;
        }

        for (int i = 0; i < count; i++) {
            employees[i].displayDetails();
        }
    }

    static void searchEmployee() {

        System.out.print("Enter Employee ID: ");
        int id = sc.nextInt();

        for (int i = 0; i < count; i++) {

            if (employees[i].getId() == id) {
                System.out.println("Employee Found!");
                employees[i].displayDetails();
                return;
            }
        }

        System.out.println("Employee Not Found!");
    }

    static void totalSalaryExpenditure() {

        double total = 0;

        for (int i = 0; i < count; i++) {
            total += employees[i].calculateSalary();
        }

        System.out.println("Total Salary Expenditure: Rs. " + total);
    }

    public static void main(String args[]) {

        while (true) {

            System.out.println("\n===== UNIVERSITY EMPLOYEE MANAGEMENT =====");
            System.out.println("1. Add Employee");
            System.out.println("2. Display All Employees");
            System.out.println("3. Search Employee");
            System.out.println("4. Calculate Total Salary Expenditure");
            System.out.println("5. Exit");

            System.out.print("Enter Choice: ");
            int choice = sc.nextInt();

            switch (choice) {

                case 1:
                    addEmployee();
                    break;

                case 2:
                    displayAllEmployees();
                    break;

                case 3:
                    searchEmployee();
                    break;

                case 4:
                    totalSalaryExpenditure();
                    break;

                case 5:
                    System.out.println("Exiting University Management System...");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid Choice!");
            }
        }
    }
}
