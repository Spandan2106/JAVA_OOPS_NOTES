import java.util.Scanner;

abstract class Shape {
    abstract void area();
    abstract void perimeter();

    void display() {
        System.out.println("This is a Shape");
    }
}

class Circle extends Shape {
    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    void area() {
        System.out.println("Area of Circle: " + (Math.PI * radius * radius));
    }

    void perimeter() {
        System.out.println("Perimeter of Circle: " + (2 * Math.PI * radius));
    }

    void display() {
        System.out.println("Shape: Circle");
    }
}

class Rectangle extends Shape {
    double length, breadth;

    Rectangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    void area() {
        System.out.println("Area of Rectangle: " + (length * breadth));
    }

    void perimeter() {
        System.out.println("Perimeter of Rectangle: " + (2 * (length + breadth)));
    }

    void display() {
        System.out.println("Shape: Rectangle");
    }
}

class Square extends Shape {
    double side;

    Square(double side) {
        this.side = side;
    }

    void area() {
        System.out.println("Area of Square: " + (side * side));
    }

    void perimeter() {
        System.out.println("Perimeter of Square: " + (4 * side));
    }

    void display() {
        System.out.println("Shape: Square");
    }
}

public class Driver2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter radius of Circle: ");
        double r = sc.nextDouble();

        System.out.print("Enter length of Rectangle: ");
        double l = sc.nextDouble();

        System.out.print("Enter breadth of Rectangle: ");
        double b = sc.nextDouble();

        System.out.print("Enter side of Square: ");
        double s = sc.nextDouble();

        Shape c = new Circle(r);
        Shape rec = new Rectangle(l, b);
        Shape sq = new Square(s);

        System.out.println("\n--- Circle ---");
        c.display();
        c.area();
        c.perimeter();

        System.out.println("\n--- Rectangle ---");
        rec.display();
        rec.area();
        rec.perimeter();

        System.out.println("\n--- Square ---");
        sq.display();
        sq.area();
        sq.perimeter();

        sc.close();
    }
}