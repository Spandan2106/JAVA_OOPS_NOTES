import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Scanner;

class Student {
    private String name;
    private int rollNo;

    public Student(String name, int rollNo) {
        this.name = name;
        this.rollNo = rollNo;
    }

    @Override
    public String toString() {
        return "Student[Roll=" + rollNo + ", Name=" + name + "]";
    }
}

class StudentCollection implements Iterable<Student> {
    private Student[] students;
    private int count;

    public StudentCollection(int capacity) {
        students = new Student[capacity];
        count = 0;
    }

    public void addStudent(Student s) {
        if (count < students.length) {
            students[count++] = s;
        }
    }

    @Override
    public Iterator<Student> iterator() {
        return new StudentIterator();
    }

    private class StudentIterator implements Iterator<Student> {
        private int currentIndex = 0;

        @Override
        public boolean hasNext() {
            return currentIndex < count;
        }

        @Override
        public Student next() {
            if (!hasNext()) {
                throw new NoSuchElementException("No more students available.");
            }
            return students[currentIndex++];
        }

        @Override
        public void remove() {
            throw new UnsupportedOperationException("Remove operation not supported.");
        }
    }
}

class IteratorPattern {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter total number of students: ");
        int n = scanner.nextInt();
        scanner.nextLine();

        StudentCollection batch = new StudentCollection(n);

        for (int i = 0; i < n; i++) {
            System.out.print("Enter name for student " + (i + 1) + ": ");
            String name = scanner.nextLine();
            System.out.print("Enter roll number for student " + (i + 1) + ": ");
            int rollNo = scanner.nextInt();
            scanner.nextLine();

            batch.addStudent(new Student(name, rollNo));
        }

        scanner.close();

        System.out.println("\n--- Traversal via explicit Iterator ---");
        Iterator<Student> it = batch.iterator();
        while (it.hasNext()) {
            Student s = it.next();
            System.out.println(s);
        }

        System.out.println("\n--- Traversal via for-each loop ---");
        for (Student s : batch) {
            System.out.println(s);
        }
    }
}