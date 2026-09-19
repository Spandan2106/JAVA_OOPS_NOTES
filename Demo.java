import java.util.Scanner;

class Grader {
    private int score;

    Grader(int score) {
        this.score = score;
    }

    char letterGrade() {
        if (score >= 90)
            return 'O';
        else if (score >= 80)
            return 'E';
        else if (score >= 70)
            return 'A';
        else if (score >= 60)
            return 'B';
        else if (score >= 50)
            return 'C';
        else if (score >= 40)
            return 'D';
        else
            return 'F';
    }
}

public class Demo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = sc.nextLine();

        System.out.print("Enter your department: ");
        String department = sc.nextLine();

        int sub1, sub2, sub3, sub4, sub5;

        do {
            System.out.print("Enter marks for Subject 1 (0-100): ");
            sub1 = sc.nextInt();
        } while (sub1 < 0 || sub1 > 100);

        do {
            System.out.print("Enter marks for Subject 2 (0-100): ");
            sub2 = sc.nextInt();
        } while (sub2 < 0 || sub2 > 100);

        do {
            System.out.print("Enter marks for Subject 3 (0-100): ");
            sub3 = sc.nextInt();
        } while (sub3 < 0 || sub3 > 100);

        do {
            System.out.print("Enter marks for Subject 4 (0-100): ");
            sub4 = sc.nextInt();
        } while (sub4 < 0 || sub4 > 100);

        do {
            System.out.print("Enter marks for Subject 5 (0-100): ");
            sub5 = sc.nextInt();
        } while (sub5 < 0 || sub5 > 100);

        Grader g1 = new Grader(sub1);
        Grader g2 = new Grader(sub2);
        Grader g3 = new Grader(sub3);
        Grader g4 = new Grader(sub4);
        Grader g5 = new Grader(sub5);

        int total = sub1 + sub2 + sub3 + sub4 + sub5;

        float sgpa = ((float) total / 500)*10;

        System.out.println("\n----- Student Details -----");
        System.out.println("Name: " + name);
        System.out.println("Department: " + department);

        System.out.println("\n----- Grades -----");
        System.out.println("Subject 1: " + sub1 + " Grade: " + g1.letterGrade());
        System.out.println("Subject 2: " + sub2 + " Grade: " + g2.letterGrade());
        System.out.println("Subject 3: " + sub3 + " Grade: " + g3.letterGrade());
        System.out.println("Subject 4: " + sub4 + " Grade: " + g4.letterGrade());
        System.out.println("Subject 5: " + sub5 + " Grade: " + g5.letterGrade());

        System.out.println("\nTotal Marks: " + total + "/500");
        System.out.println("SGPA: " + sgpa);

        sc.close();
    }
}