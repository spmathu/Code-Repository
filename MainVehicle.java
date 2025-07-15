
interface Vehicle {
    void start(); 
    void stop();   
}
class Transport {
    String name;
    String fuelType;
    Transport(String name, String fuelType) {
        this.name = name;
        this.fuelType = fuelType;
    }
    void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Fuel Type: " + fuelType);
    }
}
class Car extends Transport implements Vehicle {
    Car(String name, String fuelType) {
        super(name, fuelType);
    }
    // start method
    public void start() {
        System.out.println(name + " is starting with a key.");
    }

    // stop method
    public void stop() {
        System.out.println(name + " is stopping using brakes.");
    }}
public class MainVehicle {
    public static void main(String[] args) {
        Car myCar = new Car("Audi","Petrol");

        myCar.displayDetails();  
        myCar.start();           
        myCar.stop();          
    }
}

