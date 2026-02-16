import java.util.Random;
import java.util.Scanner;

public class secureLoginPage {
    public static void main() {

        Scanner scan = new Scanner(System.in);
        Random random = new Random();
        String userName="admin";
        String password="akr@2004";
        int attempts = 0;
        int guess=3;
        while (attempts<guess){
            System.out.print("Enter your username: ");
            String user = scan.nextLine();
            System.out.print("Enter your password: ");
            String pass = scan.nextLine();
            if (user.equals("admin") && pass.equals("akr@2004")) {
                System.out.println("Login Success");
                System.out.println("Otp is generating...");
                generateOTP();
                System.out.println("Access Granted! Welcome " + userName);
                break;
            } else {
                System.out.println("Incorrect password or username");
            }
            guess--;
            System.out.println(guess+" attempts left!");
            if (guess==attempts){
                System.out.println("All attempts gone, Re try again!");
            }
        }
    }
    static void generateOTP(){
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int otp = random.nextInt(0, 10000);
        System.out.println("Otp generated: " + otp);
        System.out.print("Enter Otp: ");
        int guess = scanner.nextInt();
        if (otp == guess) {
            System.out.println("Verified!");

        } else {
            System.out.println("Invalid OTP");
        }

    }
}
