import java.util.Scanner;

interface Payroll{
    void calculateSalary();
}

class PermanentEmployee implements Payroll{
    private String name;
    private double basicSalary;
    private double hra;
    private double da;

    void initialize(String empName, double basic, double houseRentAllowance, double dearnessAllowance){
        name = empName;
        basicSalary = basic;
        hra = houseRentAllowance;
        da = dearnessAllowance;
    }

    public void calculateSalary(){
        double salary = basicSalary + hra + da;
        System.out.println("Permanent Employee Name: " + name);
        System.out.println("Salary: " + salary);
    }
}

class ContractEmployee implements Payroll{
    private String name;
    private double hourlyRate;
    private int hoursWorked;

    void initialize(String empName, double rate, int hours){
        name = empName;
        hourlyRate = rate;
        hoursWorked = hours;
    }

    public void calculateSalary(){
        double salary = hourlyRate * hoursWorked;
        System.out.println("Contract Employee Name: " + name);
        System.out.println("Salary: " + salary);
    }
}

class Employee{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter Employee Name: ");
        String empName = sc.nextLine();
        
        System.out.println("Enter Employee Type (1 for Permanent, 2 for Contract): ");
        int choice = sc.nextInt();
        
        if(choice == 1){
            System.out.println("Enter Basic Salary: ");
            double basic = sc.nextDouble();
            
            System.out.println("Enter House Rent Allowance: ");
            double hra = sc.nextDouble();
            
            System.out.println("Enter Dearness Allowance: ");
            double da = sc.nextDouble();
            
            PermanentEmployee emp1 = new PermanentEmployee();
            emp1.initialize(empName, basic, hra, da);
            emp1.calculateSalary();
        } else {
            System.out.println("Enter Hourly Rate: ");
            double rate = sc.nextDouble();
            
            System.out.println("Enter Hours Worked: ");
            int hours = sc.nextInt();
            
            ContractEmployee emp2 = new ContractEmployee();
            emp2.initialize(empName, rate, hours);
            emp2.calculateSalary();
        }
    }
}