import java.util.Scanner;
class Vehicle{
    double RegistrationNo;
    int speed;
    String color;
    String OwnerName;
    String VehicleType;
    Vehicle(double RegistrationNo, int speed, String color, String OwnerName, String VehicleType){
        this.RegistrationNo = RegistrationNo;
        this.speed = speed;
        this.color = color;
        this.OwnerName = OwnerName;
        this.VehicleType = VehicleType;
    }
    void display(){
        System.out.println("Vehicle Details:");
        System.out.println("Registration No: " + RegistrationNo);
        System.out.println("Speed: " + speed);
        System.out.println("Color: " + color);
        System.out.println("Owner Name: " + OwnerName);
        System.out.println("Vehicle Type: " + VehicleType);
    }
}
class Bus extends Vehicle{
    private int routeNo;
    Bus(double RegistrationNo, int speed, String color, String OwnerName, String VehicleType, int routeNo){
        super(RegistrationNo, speed, color, OwnerName, VehicleType);
        this.routeNo = routeNo;
    }   
    void display(){
        super.display();
        System.out.println("Route No: " + routeNo);
    }
}
class Car extends Vehicle {
    private String manufacturer;
    Car(double RegistrationNo, int speed, String color, String OwnerName, String VehicleType, String manufacturer) {
        super(RegistrationNo, speed, color, OwnerName, VehicleType);
        this.manufacturer = manufacturer;
    }
    void display(){
        super.display();
        System.out.println("Manufacturer: " + manufacturer);
    }
}
class Compute4 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Vehicle Registration No: ");
        double regNo = sc.nextDouble();
        System.out.print("Enter Vehicle Speed: ");
        int speed = sc.nextInt();
        sc.nextLine(); 
        System.out.print("Enter Vehicle Color: ");
        String color = sc.nextLine();
        System.out.print("Enter Owner Name: ");
        String ownerName = sc.nextLine();
        System.out.print("Enter Vehicle Type (Bus/Car),for Bus enter 1 and for Car enter 2: ");
        int vehicleType = sc.nextInt();
        if(vehicleType == 1){
            System.out.print("Enter Route No: ");
            int routeNo = sc.nextInt();
            Bus bus = new Bus(regNo, speed, color, ownerName, "Bus", routeNo);
            bus.display();
        }
        else if(vehicleType == 2){
            sc.nextLine(); 
            System.out.print("Enter Manufacturer: ");
            String manufacturer = sc.nextLine();
            Car car = new Car(regNo, speed, color, ownerName, "Car", manufacturer);
            car.display();
        }
        else{
            System.out.println("Invalid Vehicle Type");
        }

        
    }
    
}
