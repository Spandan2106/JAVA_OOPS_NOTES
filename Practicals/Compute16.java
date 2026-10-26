
import java.util.Scanner;

class StringOperations {
    String s;

    StringOperations(String s) {
        this.s = s;
    }

    void display() {
        System.out.println("Length: " + s.length());
        System.out.println("Uppercase: " + s.toUpperCase());
        System.out.println("Lowercase: " + s.toLowerCase());

        String rev = "";

        for (int i = s.length() - 1; i >= 0; i--)
            rev = rev + s.charAt(i);

        System.out.println("Reverse: " + rev);

        if (s.equalsIgnoreCase(rev))
            System.out.println("Palindrome");
        else
            System.out.println("Not palindrome");

        int count = 0;

        for (int i = 0; i < s.length(); i++) {
            char ch = Character.toLowerCase(s.charAt(i));

            if (ch == 'a' || ch == 'e' || ch == 'i'
                || ch == 'o' || ch == 'u')
                count++;
        }

        System.out.println("Vowels: " + count);
    }
}

public class Compute16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String s = sc.nextLine();

        StringOperations obj = new StringOperations(s);
        obj.display();

        sc.close();
    }
}
