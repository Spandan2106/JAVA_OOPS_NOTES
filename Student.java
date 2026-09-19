import java.util.Scanner;

class Student1 {
    protected String name;
    protected double tenthGradeMarks;
    protected double twelfthGradeMarks;
    protected double entranceExamMarks;

    Student1(String studentName, double marks10th, double marks12th, double marksEntrance) {
        name = studentName;
        tenthGradeMarks = marks10th;
        twelfthGradeMarks = marks12th;
        entranceExamMarks = marksEntrance;
    }

    void display() {
        System.out.println("Student Name: " + name);
        System.out.println("10th Grade Marks: " + tenthGradeMarks);
        System.out.println("12th Grade Marks: " + twelfthGradeMarks);
        System.out.println("Entrance Exam Marks: " + entranceExamMarks);
    }
}

class Admission extends Student1 {
    Admission(String studentName, double marks10th, double marks12th, double marksEntrance) {
        super(studentName, marks10th, marks12th, marksEntrance);
    }

    boolean isEligible() {
        return tenthGradeMarks >= 65 && twelfthGradeMarks >= 65 && entranceExamMarks >= 60;
    }
}

class Student {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Student Name: ");
        String name = sc.nextLine();
        System.out.println("Enter 10th Grade Marks: ");
        double marks10th = sc.nextDouble();
        System.out.println("Enter 12th Grade Marks: ");
        double marks12th = sc.nextDouble();
        System.out.println("Enter Entrance Exam Marks: ");
        double marksEntrance = sc.nextDouble();

        Admission student = new Admission(name, marks10th, marks12th, marksEntrance);

        if (student.isEligible()) {
            System.out.println("Student is eligible for admission.");
            student.display();
        }
        else {
            System.out.println("Student is not eligible for admission.");
        }
    }
}
