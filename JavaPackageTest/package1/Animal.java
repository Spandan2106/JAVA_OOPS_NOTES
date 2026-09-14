package package1;

public class Animal {

    public int publicNumber = 10;

    protected int protectedNumber = 20;

    int defaultNumber = 30;

    private int privateNumber = 40;

    public void displayAnimal() {

        System.out.println("Inside Same Class:");

        System.out.println("Public: " + publicNumber);
        System.out.println("Protected: " + protectedNumber);
        System.out.println("Default: " + defaultNumber);
        System.out.println("Private: " + privateNumber);
    }
}