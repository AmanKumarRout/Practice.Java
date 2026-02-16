import java.util.Scanner;

public class Atm {
    public static void main() {
        int a=55;
        Scanner sc=new Scanner(System.in);
        int choice=0;
        System.out.println("Enter pin: ");
        int pin=sc.nextInt();
        if(pin==a){
            System.out.println("Enter choice");
            choice=sc.nextInt();
            switch (choice) {
                case 1 -> System.out.println(" Deposit");
                case 2 -> System.out.println(" Check System");
                case 3 -> System.out.println(" Withdraw");
            }
        }
    }
}
