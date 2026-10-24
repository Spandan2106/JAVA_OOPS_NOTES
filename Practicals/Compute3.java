
import java.util.Scanner;

class Person {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

class Student extends Person {
    int roll;
    double m1, m2, m3;

    Student(String name, int age, int roll,
            double m1, double m2, double m3) {
        super(name, age);
        this.roll = roll;
        this.m1 = m1;
        this.m2 = m2;
        this.m3 = m3;
    }
}

class Result extends Student {
    Result(String name, int age, int roll,
           double m1, double m2, double m3) {
        super(name, age, roll, m1, m2, m3);
    }

    void display() {
        double total = m1 + m2 + m3;
        double avg = total / 3;

        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Roll: " + roll);
        System.out.println("Total: " + total);
        System.out.println("Average: " + avg);

        if (avg >= 80)
            System.out.println("Grade: A");
        else if (avg >= 60)
            System.out.println("Grade: B");
        else if (avg >= 40)
            System.out.println("Grade: C");
        else
            System.out.println("Grade: Fail");
    }
}

public class Compute3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter name: ");
        String name = sc.nextLine();

        System.out.print("Enter age: ");
        int age = sc.nextInt();

        System.out.print("Enter roll number: ");
        int roll = sc.nextInt();

        System.out.print("Enter three subject marks: ");
        double m1 = sc.nextDouble();
        double m2 = sc.nextDouble();
        double m3 = sc.nextDouble();

        Result r = new Result(name, age, roll, m1, m2, m3);
        r.display();

        sc.close();
    }
}
