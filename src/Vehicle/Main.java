package Vehicle;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("1. Car\n2. Bike\n3.Truck\nSelect a vehicle:");
        int choice=sc.nextInt();
        switch (choice) {
            case 1: {
                System.out.println("\n1. Sedan\n2. SUV\n3. Luxury");
                System.out.print("Select a car: ");
                car();
                break;
            }
            case 2: {
                System.out.println("\n1.Splender\n2.Pulsar\n3.RoyalEnfield");
                System.out.print("Select a Bike: ");
                bike();
                break;
            }

            case 3: {
                System.out.println("\nYou selected a Truck");
                truck();
                break;
            }
        }
    }

    static void bike(){

        Scanner sc = new Scanner(System.in);
        int choice2=sc.nextInt();
        switch (choice2) {
            case 1: {//splender
                Splender bike = new Splender();
                bike.fuel();
                bike.bikeCC();
                bike.average(200,45);
                bike.distance(200);
                break;
            }

            case 2: { //Pulsar
                Pulsar bike = new Pulsar();
                bike.fuel();
                bike.bikeCC();
                bike.average(210,38);
                bike.distance(560);
                break;
            }

            case 3: { //Royal
                RoyalEnfield bike = new RoyalEnfield();
                bike.fuel();
                bike.bikeCC();
                bike.average(180,30);
                bike.distance(1120);
                break;
            }

        }
    }

    static void car(){
        Scanner sc = new Scanner(System.in);
        int choice1=sc.nextInt();
        switch (choice1) {
            case 1: {//Sedan
                Sedan car = new Sedan();
                car.fuel();
                car.distance(27500);
                car.safety();
                break;
            }

            case 2: {//SUV
                SUV car = new SUV();
                car.fuel();
                car.distance(58000);
                car.safety();
                break;
            }

            case 3: {//luxury
                Luxury car = new Luxury();
                car.fuel();
                car.distance(8000);
                car.safety();
                break;
            }

        }
    }
    static void truck(){
        Truck truck = new Truck();
        truck.distance(40000);
        truck.fuel();

    }
}
