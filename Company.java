import java.util.Scanner;

class Employee{

    private String name;
    private int basicSalary;
    private double empID;

    void initialize(String n, int b, double id){
        name = n;
        basicSalary = b;
        empID = id;
    }
    void display(){
        System.out.println("Employee Name: " + name);
        System.out.println("Employee ID: " + empID);
        System.out.println("Basic Salary: " + basicSalary);
    }
}

class Manager extends Employee{
    private int bonus;
    private int hra;
    private int da;

    void initialize(String n, int b, double id, int bon){
        super.initialize(n, b, id);
        bonus = bon;
        hra = 10000;
        da = 7000;
    }

    void calculateSalary(){
        int totalSalary = bonus + hra + da;
        System.out.println("Total Salary: " + totalSalary);
    }

}

class Developer extends Employee{
    private int bonus;
    private int hra;
    private int da;

    void initialize(String n, int b, double id, int bon){
        super.initialize(n, b, id);
        bonus = bon;
        hra = 7000;
        da = 5000;
    }

    void calculateSalary(){
        int totalSalary = bonus + hra + da;
        System.out.println("Total Salary: " + totalSalary);
    }

}

class Intern extends Employee{
    private int bonus;
    private int hra;
    private int da;

    void initialize(String n, int b, double id, int bon){
        super.initialize(n, b, id);
        bonus = bon;
        hra = 5000;
        da = 0;
    }

    void calculateSalary(){
        int totalSalary = bonus + hra + da;
        System.out.println("Total Salary: " + totalSalary);
    }

}

class Company{
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Employee Name: ");
        String name = sc.nextLine();

        System.out.println("Enter Employee ID: ");
        double empID = sc.nextDouble();

        System.out.println("Enter Basic Salary: ");
        int basicSalary = sc.nextInt();

        System.out.println("Enter Bonus: ");
        int bonus = sc.nextInt();

        System.out.println("Select Employee Type (1-Manager, 2-Developer, 3-Intern): ");
        int choice = sc.nextInt();


        switch(choice){
            case 1:
                Manager emp1 = new Manager();
                emp1.initialize(name, basicSalary, empID, bonus);
                emp1.display();
                emp1.calculateSalary();

                break;
            case 2:
                Developer emp2 = new Developer();
                emp2.initialize(name, basicSalary, empID, bonus);
                emp2.display();
                emp2.calculateSalary();
                break;
            case 3:
                Intern emp3 = new Intern();
                emp3.initialize(name, basicSalary, empID, bonus);
                emp3.display();
                emp3.calculateSalary();
                break;
            default:
                System.out.println("Invalid choice");
                return;
        }
    }
}