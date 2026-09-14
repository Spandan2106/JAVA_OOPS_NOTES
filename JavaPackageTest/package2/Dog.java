package package2;

import package1.Animal;

public class Dog extends Animal {

    public void display() {

        System.out.println("Inside Subclass in Other Package:");

        System.out.println("Public: " + publicNumber);

        System.out.println("Protected: " + protectedNumber);

        // Default is not accessible
        // System.out.println("Default: " + defaultNumber);

        // Private is not accessible
        // System.out.println("Private: " + privateNumber);
    }
}