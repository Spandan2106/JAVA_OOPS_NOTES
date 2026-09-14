package package2;

import package1.Animal;

public class OtherClass {

    public void display() {

        Animal obj = new Animal();

        System.out.println("Inside Non-Subclass in Other Package:");

        System.out.println("Public: " + obj.publicNumber);

        // Protected is not accessible
        // System.out.println("Protected: " + obj.protectedNumber);

        // Default is not accessible
        // System.out.println("Default: " + obj.defaultNumber);

        // Private is not accessible
        // System.out.println("Private: " + obj.privateNumber);
    }
}