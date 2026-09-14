package package1;

public class SamePackage {

    public void display() {

        Animal obj = new Animal();

        System.out.println("Inside Same Package:");

        System.out.println("Public: " + obj.publicNumber);

        System.out.println("Protected: " + obj.protectedNumber);

        System.out.println("Default: " + obj.defaultNumber);

        // Private is not accessible
        // System.out.println("Private: " + obj.privateNumber);
    }
}