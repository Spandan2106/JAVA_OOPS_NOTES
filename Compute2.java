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
class Student {
    String name;
    int sub1, sub2, sub3,sub4, sub5;
    int total;
    int average;
    Student(String name, int sub1, int sub2, int sub3, int sub4, int sub5) {
        this.name = name;
        this.sub1 = sub1;
        this.sub2 = sub2;
        this.sub3 = sub3;
        this.sub4 = sub4;
        this.sub5 = sub5;
        this.total = sub1 + sub2 + sub3 + sub4 + sub5;
        this.average = total / 5;
    }
    void display() {
        System.out.println("Name: " + name);
        System.out.println("Subject 1: " + sub1);
        System.out.println("Subject 2: " + sub2);
        System.out.println("Subject 3: " + sub3);
        System.out.println("Subject 4: " + sub4);
        System.out.println("Subject 5: " + sub5);
        System.out.println("Total: " + total);
        System.out.println("Average: " + average);
        System.out.println("Grade: " + new Grader(average).letterGrade());
    }

}

class Compute2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = sc.nextLine();
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

        Student student = new Student(name, sub1, sub2, sub3, sub4, sub5);
        student.display();
    }
}