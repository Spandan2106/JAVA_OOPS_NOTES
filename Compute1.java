import java.util.Scanner;

class Employee{
    String name;
    int age;
    double salary;
    int id;

    void takeInput(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name: ");
        name = sc.nextLine();
        System.out.println("Enter age: ");
        age = sc.nextInt();
        System.out.println("Enter salary: ");
        salary = sc.nextDouble();
        System.out.println("Enter id: ");
        id = sc.nextInt();
    }
    void display(){
        System.out.println("Employee Details:");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Salary: " + salary);
        System.out.println("ID: " + id);
    }

}

class Manager extends Employee{
    String department;
    double bonus;

    void takeInput(){
        super.takeInput();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter department: ");
        department = sc.nextLine();
        System.out.println("Enter bonus: ");
        bonus = sc.nextDouble();
    }

    void display(){
        System.out.println("Manager Details:");
        super.display();
        System.out.println("Department: " + department);
        System.out.println("Bonus: " + bonus);
    }
}

class Compute1{
    public static void main(String args[]){
        Manager m = new Manager();
        m.takeInput();
        m.display();
    }
}