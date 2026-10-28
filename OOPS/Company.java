abstract class Employee {

    abstract void raiseSalary();
    abstract void promote();
}

class Manager extends Employee{

    @Override void raiseSalary(){
        
        System.out.println(
            "Manager salary raised with incentives.");
    }

    @Override void promote(){
        
        System.out.println(
            "Manager promoted to Senior Manager.");
    }
}

class Engineer extends Employee{
    
    @Override void raiseSalary(){
        
        System.out.println(
            "Engineer salary raised with bonus.");
    }

    @Override void promote(){
        
        System.out.println(
            "Engineer promoted to Senior Engineer.");
    }
}

public class Company{
    
    public static void main(String[] args){
        
        Employee[] employees
            = { new Manager(), new Engineer() };

        System.out.println("--- Raising Salaries ---");
        for (Employee e : employees){
            
            e.raiseSalary(); 
        }

        System.out.println("\n--- Promotions ---");
        for (Employee e : employees) {
            e.promote();
        }
    }
}