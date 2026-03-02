package Vehicle;

import java.util.Scanner;

public class Car extends Vehicle {
    void fuel(){
        System.out.println("This is the fuel of a Car");
    }

    void distance(int distance) {
        System.out.println("This is the distance of a Car");
    }
    void safety(){
        System.out.println("This is the safety car");
    }
    void average(double distance, double fuelTankCapacity){
        double avg = distance / fuelTankCapacity;
        System.out.println("Average of Car is: " + avg);
    }

}
class Sedan extends Car{
    void fuel(){
        final double fuelCapacity = 30.00;
        System.out.println("Fuel tank capacity is "+fuelCapacity+"L");
    }
    void safety(){
        final double safe=3.5;
        System.out.println("Safety of Car is: " + safe+" out of 5");

    }
    void distance(int distance) {
        int totalDistance=20000;
        totalDistance = distance+totalDistance;
        System.out.println("Total distance covered is "+totalDistance);
    }
}


class SUV extends Car{
    void fuel(){
        final double fuelCapacity = 45.00;
        System.out.println("Fuel tank capacity is "+fuelCapacity+"L");
    }
    void safety(){
        final double safe=4.2;
        System.out.println("Safety of Car is: " + safe+" out of 5");
    }
    void distance(int distance) {
        int totalDistance=27500;
        totalDistance = distance+totalDistance;
        System.out.println("Total distance covered is "+totalDistance);
}

}



class Luxury extends Car{
    void fuel(){
        final double fuelCapacity = 45.00;
        System.out.println("Fuel tank capacity is "+fuelCapacity+"L");
    }
    void safety(){
        final double safe=5;
        System.out.println("Safety of Car is: " + safe+" out of 5");

    }
    void distance(int distance) {
        int totalDistance=12750;
        totalDistance = distance+totalDistance;
        System.out.println("Total distance covered is "+totalDistance);
    }
}

