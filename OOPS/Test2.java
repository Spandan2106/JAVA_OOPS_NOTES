// Define an interface named Shape
interface Shape{
    
    // Abstract method for calculating the area
    double calculateArea(); 
}

// Implement the interface 
// in a class named Circle
class Circle implements Shape{
    
    private double r;

    // Constructor for Circle
    public Circle(double r){ 
        
      this.r = r; 
    }

    // Implementing the abstract method 
    // from the Shape interface
    public double calculateArea()
    {
        return Math.PI * r * r;
    }
}

// Implement the interface in a 
// class named Rectangle
class Rectangle implements Shape{
    
    private double length;
    private double width;

    // Constructor for Rectangle
    public Rectangle(double length, double width){
        
        this.length = length;
        this.width = width;
    }

    // Implementing the abstract 
    // method from the Shape interface
    public double calculateArea() { 
      return length * width; 
    }
}

public class Test2 {
    public static void main(String[] args) {

        // Reference type is the interface (Shape)
        Shape cir = new Circle(5.0);
        Shape rect = new Rectangle(4.0, 6.0);

        // Dynamic method dispatch — decides which method to call at runtime
        System.out.println("Area of Circle: " + cir.calculateArea());
        System.out.println("Area of Rectangle: " + rect.calculateArea());
    }
}