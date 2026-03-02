package Vehicle;

public class Truck extends Vehicle {
    void fuel(){
        final double fuelCapacity= 150;
        System.out.println("Fuel Capacity :" + fuelCapacity+"L");
    }

    void distance(int distance) {
        int totalDistance=500000;
        totalDistance = distance+totalDistance;
        System.out.println("Total distance covered is "+totalDistance);
    }
}
