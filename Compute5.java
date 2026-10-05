import java.util.Scanner;
interface Camara {
    void takePhoto();
}
interface MusicPlayer {
    void playMusic();
}
class Smartphone implements Camara, MusicPlayer {
    String brand;
    String model;
    Smartphone(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }
    void displayDetails() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
    }
    public void takePhoto() {
        System.out.println("Taking a photo...");
    }
    public void playMusic() {
        System.out.println("Playing music...");
    }
}

class Compute5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Smartphone Brand: ");
        String brand = sc.nextLine();
        System.out.print("Enter Smartphone Model: ");
        String model = sc.nextLine();
        Smartphone smartphone = new Smartphone(brand, model);
        smartphone.displayDetails();
        smartphone.takePhoto();
        smartphone.playMusic();
    }
}