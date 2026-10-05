import java.util.Scanner;

class Calculator{
    void calculate(int a,int b){
        System.out.println("The sum is : "+(a+b));
    }
    void calculate(int a,int b,int c){
        System.out.println("The sum is : "+(a+b+c));
    }
    void calculate(double a,double b){
        System.out.println("The sum is : "+(a+b));
    }
    void calculate(double a,double b,double c){
        System.out.println("The sum is : "+(a+b+c));
    }
    void calculate1(int a,int b){
        System.out.println("The Substration is : "+(a-b));
    }
    void calculate1(double a,double b){
        System.out.println("The Substraction is : "+(a-b));
    }
    void calculate2(double a,double b){
        System.out.println("The Multiplication is : "+(a*b));
    }
    void calculate2(int a,int b){
        System.out.println("The Multiplication is : "+(a*b));
    }
    void calculate2(int a,int b,int c){
        System.out.println("The Multiplication is : "+(a*b*c));
    }
    void calculate2(double a,double b,double c){
        System.out.println("The Multiplication is : "+(a*b*c));
    }

}

class Driver{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("---Menu---\n1.Addition\n2.Subtraction\n3.Multiplication\n");
        int ch = sc.nextInt();
        System.out.println("---Options---\n1.total 2 Interger\n2.total 3 interger\n3.total 2 double\n4.total 3 double\nSubtraction only supports 2 elements");
        int op = sc.nextInt();
        switch(ch){
            case 1:
                if(op==1){
                    System.out.println("Enter 2 integers : ");
                    int a = sc.nextInt();
                    int b = sc.nextInt();
                    Calculator c = new Calculator();
                    c.calculate(a,b);
                }
                else if(op==2){
                    System.out.println("Enter 3 integers : ");
                    int a = sc.nextInt();
                    int b = sc.nextInt();
                    int c1 = sc.nextInt();
                    Calculator c = new Calculator();
                    c.calculate(a,b,c1);
                }
                else if(op==3){
                    System.out.println("Enter 2 double : ");
                    double a = sc.nextDouble();
                    double b = sc.nextDouble();
                    Calculator c = new Calculator();
                    c.calculate(a,b);
                }
                else if(op==4){
                    System.out.println("Enter 3 double : ");
                    double a = sc.nextDouble();
                    double b = sc.nextDouble();
                    double c1 = sc.nextDouble();
                    Calculator c = new Calculator();
                    c.calculate(a,b,c1);

                }
                break;
            case 2:
                if(op==1){
                    System.out.println("Enter 2 integers : ");
                    int a = sc.nextInt();
                    int b = sc.nextInt();
                    Calculator c = new Calculator();
                    c.calculate1(a,b);
                }
                else if(op==3){
                    System.out.println("Enter 2 double : ");
                    double a = sc.nextDouble();
                    double b = sc.nextDouble();
                    Calculator c = new Calculator();
                    c.calculate1(a,b);
                }
                break;
            case 3:
                if(op==1){
                    System.out.println("Enter 2 integers : ");
                    int a = sc.nextInt();
                    int b = sc.nextInt();
                    Calculator c = new Calculator();
                    c.calculate2(a,b);
                }
                else if(op==2){
                    System.out.println("Enter 3 integers : ");
                    int a = sc.nextInt();
                    int b = sc.nextInt();
                    int c1 = sc.nextInt();
                    Calculator c = new Calculator();
                    c.calculate2(a,b,c1);
                }
                else if(op==3){
                    System.out.println("Enter 2 double : ");
                    double a = sc.nextDouble();
                    double b = sc.nextDouble();
                    Calculator c = new Calculator();
                    c.calculate2(a,b);
                }
                else if(op==4){
                    System.out.println("Enter 3 double : ");
                    double a = sc.nextDouble();
                    double b = sc.nextDouble();
                    double c1 = sc.nextDouble();
                    Calculator c = new Calculator();
                    c.calculate2(a,b,c1);

                }
                break;
            default:
                System.out.println("Invalid choice");
                break;
        }

    }
}