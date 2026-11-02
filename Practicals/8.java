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
    int rollNo;
    String department;

    Student(String name, int age, int rollNo, String department) {
        super(name, age);
        this.rollNo = rollNo;
        this.department = department;
    }
}

abstract class Examination extends Student {

    Examination(String name, int age, int rollNo, String department) {
        super(name, age, rollNo, department);
    }

    abstract void calculateResult(int m1, int m2, int m3);
}

class Result extends Examination {

    Result(String name, int age, int rollNo, String department) {
        super(name, age, rollNo, department);
    }

    void calculateResult(int m1, int m2, int m3) {

        int total = m1 + m2 + m3;
        double percentage = total / 3.0;

        String grade;

        if (percentage >= 90) {
            grade = "A+";
        } else if (percentage >= 80) {
            grade = "A";
        } else if (percentage >= 70) {
            grade = "B";
        } else if (percentage >= 60) {
            grade = "C";
        } else if (percentage >= 40) {
            grade = "D";
        } else {
            grade = "Fail";
        }

        System.out.println("\n===== STUDENT RESULT =====");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Roll Number: " + rollNo);
        System.out.println("Department: " + department);
        System.out.println("Total Marks: " + total);
        System.out.println("Percentage: " + percentage + "%");
        System.out.println("Grade: " + grade);
    }
}

public class UniversityResult {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n===== UNIVERSITY EXAMINATION =====");
            System.out.println("1. Calculate Student Result");
            System.out.println("2. Exit");

            System.out.print("Enter choice: ");
            int ch = sc.nextInt();

            switch (ch) {
                case 1:
                    try {
                        System.out.print("Enter Name: ");
                        String name = sc.next();

                        System.out.print("Enter Age: ");
                        int age = sc.nextInt();

                        System.out.print("Enter Roll Number: ");
                        int roll = sc.nextInt();

                        System.out.print("Enter Department: ");
                        String dept = sc.next();

                        System.out.print("Enter Marks in Subject 1: ");
                        int m1 = sc.nextInt();

                        System.out.print("Enter Marks in Subject 2: ");
                        int m2 = sc.nextInt();

                        System.out.print("Enter Marks in Subject 3: ");
                        int m3 = sc.nextInt();

                        if (age <= 0 || age > 120 ||
                            m1 < 0 || m1 > 100 ||
                            m2 < 0 || m2 > 100 ||
                            m3 < 0 || m3 > 100) {

                            throw new IllegalArgumentException("Invalid Age or Marks!");
                        }

                        Result obj = new Result(name, age, roll, dept);
                        obj.calculateResult(m1, m2, m3);

                    } catch (IllegalArgumentException e) {
                        System.out.println(e.getMessage());
                    } catch (java.util.InputMismatchException e) {
                        System.out.println("Invalid Input!");
                        sc.nextLine();
                    }
                    break;

                case 2:
                    System.out.println("Program Terminated.");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid Choice!");
            }
        }
    }
}
