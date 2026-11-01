import java.util.Scanner;

class Student {
    int m1, m2, m3;
    int total;

    Student(int a, int b, int c) {
        m1 = a;
        m2 = b;
        m3 = c;
    }

    void calculateTotal() {
        total = m1 + m2 + m3;
        System.out.println("Total Marks: " + total);
    }

    void calculatePercentage() {
        double percentage = total / 3.0;
        System.out.println("Percentage: " + percentage);
    }

    void calculateGrade() {
        double percentage = total / 3.0;

        if (percentage >= 90)
            System.out.println("Grade: A");

        else if (percentage >= 75)
            System.out.println("Grade: B");

        else if (percentage >= 50)
            System.out.println("Grade: C");

        else
            System.out.println("Grade: Fail");
    }
}

class Total extends Thread {
    Student s;

    Total(Student s) {
        this.s = s;
    }

    public void run() {
        s.calculateTotal();
    }
}

class Percentage extends Thread {
    Student s;

    Percentage(Student s) {
        this.s = s;
    }

    public void run() {
        s.calculatePercentage();
    }
}

class Grade extends Thread {
    Student s;

    Grade(Student s) {
        this.s = s;
    }

    public void run() {
        s.calculateGrade();
    }
}

public class StudentResult {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter marks of subject 1: ");
        int a = sc.nextInt();

        System.out.print("Enter marks of subject 2: ");
        int b = sc.nextInt();

        System.out.print("Enter marks of subject 3: ");
        int c = sc.nextInt();

        Student s = new Student(a, b, c);

        Total t1 = new Total(s);
        t1.start();

        try {
            t1.join();
        } catch (Exception e) {
            System.out.println(e);
        }

        Percentage t2 = new Percentage(s);
        Grade t3 = new Grade(s);

        t2.start();
        t3.start();

        sc.close();
    }
}
