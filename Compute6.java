abstract class Animal {

    public abstract void animalSound();

    public void animalCharacter() {
        System.out.println("Animals have different characteristics.");
    }
}

class Cat extends Animal {

    public void animalSound() {
        System.out.println("Cat animal sound is Meow.");
    }
}

class Dog extends Animal {

    public void animalSound() {
        System.out.println("Dog animal sound is Woof.");
    }
}

public class Compute6 {

    public static void main(String[] args) {

        Cat c = new Cat();
        Dog d = new Dog();

        c.animalSound();
        c.animalCharacter();

        d.animalSound();
        d.animalCharacter();
    }
}