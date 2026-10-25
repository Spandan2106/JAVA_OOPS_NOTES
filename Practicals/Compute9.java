import java.util.Scanner;

class Compute9{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        try{
            System.out.println("Enter number a: ");
            int a = sc.nextInt();
            System.out.println("Enter number b: ");
            int b = sc.nextInt();
            int c = a / b;
            System.out.println("Result: " + c);
        }
        catch(ArithmeticException e){
            System.out.println("Error: Division by zero is not allowed.");
        }
        catch(Exception e){
            System.out.println("Error: Invalid input. Please enter integers only.");
        }
        finally{
            sc.close();
        }
    }
}