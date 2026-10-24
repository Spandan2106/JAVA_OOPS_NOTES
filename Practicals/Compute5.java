
import java.util.Scanner;

interface Sports {
    void sportsScore();
}

interface Academics {
    void academicScore();
}

class StudentResult implements Sports, Academics {
    String name;
    int sport, academic;

    StudentResult(String name, int sport, int academic) {
        this.name = name;
        this.sport = sport;
        this.academic = academic;
    }

    public void sportsScore() {
        System.out.println("Sports score: " + sport);
    }

    public void academicScore() {
        System.out.println("Academic score: " + academic);
    }

    void display() {
        System.out.println("Name: " + name);
        sportsScore();
        academicScore();
        System.out.println("Total score: " + (sport + academic));
    }
}

public class Compute5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter student name: ");
        String name = sc.nextLine();

        System.out.print("Enter sports score: ");
        int sport = sc.nextInt();

        System.out.print("Enter academic score: ");
        int academic = sc.nextInt();

        StudentResult s = new StudentResult(name, sport, academic);
        s.display();

        sc.close();
    }
}
