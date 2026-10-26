
import java.util.Scanner;

abstract class Shape {
    abstract void area();
}

class Circle extends Shape {
    double r;

    Circle(double r) {
        this.r = r;
    }

    void area() {
        System.out.println("Area of circle: " + (3.14 * r * r));
    }
}

class Rectangle extends Shape {
    double l, b;

    Rectangle(double l, double b) {
        this.l = l;
        this.b = b;
    }

    void area() {
        System.out.println("Area of rectangle: " + (l * b));
    }
}

class Triangle extends Shape {
    double b, h;

    Triangle(double b, double h) {
        this.b = b;
        this.h = h;
    }

    void area() {
        System.out.println("Area of triangle: " + (0.5 * b * h));
    }
}

public class Compute14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("1.Circle 2.Rectangle 3.Triangle");
        System.out.print("Enter choice: ");
        int ch = sc.nextInt();

        Shape s;

        if (ch == 1) {
            System.out.print("Enter radius: ");
            double r = sc.nextDouble();
            s = new Circle(r);
            s.area();
        }
        else if (ch == 2) {
            System.out.print("Enter length and breadth: ");
            double l = sc.nextDouble();
            double b = sc.nextDouble();
            s = new Rectangle(l, b);
            s.area();
        }
        else if (ch == 3) {
            System.out.print("Enter base and height: ");
            double b = sc.nextDouble();
            double h = sc.nextDouble();
            s = new Triangle(b, h);
            s.area();
        }
        else {
            System.out.println("Invalid choice");
        }

        sc.close();
    }
}
