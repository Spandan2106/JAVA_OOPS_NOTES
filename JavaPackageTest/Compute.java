import package1.Animal;
import package1.SamePackage;
import package2.Dog;
import package2.OtherClass;

public class Compute {

    public static void main(String[] args) {

        System.out.println("================================");
        System.out.println("ACCESS SPECIFIER DEMONSTRATION");
        System.out.println("================================");

        System.out.println();

        // Same Class
        Animal a = new Animal();

        System.out.println("----- SAME CLASS -----");
        a.displayAnimal();

        System.out.println();

        // Different Class in Same Package
        SamePackage s = new SamePackage();

        System.out.println("----- SAME PACKAGE -----");
        s.display();

        System.out.println();

        // Subclass in Other Package
        Dog d = new Dog();

        System.out.println("----- SUBCLASS IN OTHER PACKAGE -----");
        d.display();

        System.out.println();

        // Non-Subclass in Other Package
        OtherClass o = new OtherClass();

        System.out.println("----- NON-SUBCLASS IN OTHER PACKAGE -----");
        o.display();
    }
}