

import java.util.Scanner;

interface LibraryOperations {
    void issueBook();
    void returnBook();
}

class Library implements LibraryOperations {
    String book;
    boolean available = true;

    Library(String book) {
        this.book = book;
    }

    public void issueBook() {
        if (available) {
            available = false;
            System.out.println(book + " issued successfully");
        }
        else {
            System.out.println("Book is not available");
        }
    }

    public void returnBook() {
        if (!available) {
            available = true;
            System.out.println(book + " returned successfully");
        }
        else {
            System.out.println("Book was not issued");
        }
    }
}

public class Compute15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter book name: ");
        String name = sc.nextLine();

        Library l = new Library(name);

        int ch;
        do {
            System.out.println("\n1.Issue Book 2.Return Book 3.Exit");
            System.out.print("Enter choice: ");
            ch = sc.nextInt();

            switch (ch) {
                case 1:
                    l.issueBook();
                    break;
                case 2:
                    l.returnBook();
                    break;
                case 3:
                    System.out.println("Exit");
                    break;
                default:
                    System.out.println("Invalid choice");
            }
        } while (ch != 3);

        sc.close();
    }
}
