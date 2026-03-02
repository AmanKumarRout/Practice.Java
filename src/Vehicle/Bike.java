package Vehicle;

public class Bike extends Vehicle {
    void fuel(){
        System.out.println("Fuel from Bike class");
    }
    void average(){
        System.out.println("Mileage is from Bike class");
    }
    void distance(){
        System.out.println("Distance from Bike class");
    }
    void bikeCC(){
        System.out.println("CC from Bike class");
    }
}

class Splender extends Bike {
    void fuel() {
        final double fuelCapacity = 10.00;
        System.out.println("Fuel Capacity :" + fuelCapacity+"L");
    }

    void average(double distance, double fuelTankCapacity) {
        double avg = distance / fuelTankCapacity;
        System.out.println("Average of Bike is: " + avg);
    }

    void distance(int distance) {
        int totalDistance=56000;
        totalDistance = distance+totalDistance;
        System.out.println("Total distance covered is "+totalDistance);
    }

    void bikeCC() {
        final int cc = 125;
        System.out.println("This bike is "+cc +"cc");
    }
}

class Pulsar  extends Bike{
    void fuel(){
        final double fuelCapacity = 13.00;
        System.out.println("Fuel Capacity :" + fuelCapacity+"L");
    }
    void average(double distance, double fuelTankCapacity) {
        double avg = distance / fuelTankCapacity;
        System.out.println("Average of Bike is: " + avg);
    }
    void distance(int distance) {
        int totalDistance=70000;
        totalDistance = distance+totalDistance;
        System.out.println("Total distance covered is "+totalDistance);
    }
    void bikeCC(){
        final int cc = 150;
        System.out.println("This bike is "+cc +"cc");
    }
}

class RoyalEnfield extends Bike{
    void fuel(){
        final double fuelCapacity = 20.00;
        System.out.println("Fuel Capacity :" + fuelCapacity+"L");
    }
    void average(double distance, double fuelTankCapacity) {
        double avg = distance / fuelTankCapacity;
        System.out.println("Average of Bike is: " + avg);
    }
    void distance(int distance) {
        int totalDistance=200000;
        totalDistance = distance+totalDistance;
        System.out.println("Total distance covered is "+totalDistance);
    }
    void bikeCC(){
        final int cc = 350;
        System.out.println("This bike is "+cc +"cc");
    }
}
