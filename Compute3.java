import java.util.Scanner;
class Person{
    String name;
    int age;
    Person(String name, int age){
        this.name = name;
        this.age = age;
    }
    void display(){
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}
class Student extends Person{
    long rollNo;
    String course;
    Student(String name, int age, long rollNo, String course){
        super(name, age);
        this.rollNo = rollNo;
        this.course = course;
    }
    void display(){
        super.display();
        System.out.println("Roll No: " + rollNo);
        System.out.println("Course: " + course);
    }
}
class Result extends Student{
    int sub1,sub2,sub3;
    int total;
    double avg;
    Result(String name, int age, long rollNo, String course, int sub1, int sub2, int sub3){
        super(name, age, rollNo, course);
        this.sub1 = sub1;
        this.sub2 = sub2;
        this.sub3 = sub3;
        this.total = sub1 + sub2 + sub3;
        this.avg = total / 3.0;
    }
    void display(){
        super.display();
        System.out.println("Subject 1: " + sub1);
        System.out.println("Subject 2: " + sub2);
        System.out.println("Subject 3: " + sub3);
        System.out.println("Total: " + total);
        System.out.println("Average: " + avg);
    }
}

class Compute3{
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = sc.nextLine();
        System.out.print("Enter your age: ");
        int age = sc.nextInt();
        System.out.print("Enter your roll number: ");
        long rollNo = sc.nextLong();
        sc.nextLine(); // consume the newline character
        System.out.print("Enter your course: ");
        String course = sc.nextLine();
        int sub1, sub2, sub3;
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

        Result result = new Result(name, age, rollNo, course, sub1, sub2, sub3);
        result.display();
    }

}