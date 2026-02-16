import java.util.Random;
import java.util.Scanner;

public class Program2 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        Random random = new Random();
        System.out.print("Enter Your Username: ");
        String username = "aman2004";
        String userName = scan.nextLine();
        if(username.equals(userName)){
            int otp = random.nextInt(0,9999);
            System.out.println("Message: Your otp " + otp);
            System.out.print("Enter Your Otp: ");
            int userOTP = scan.nextInt();
            if (otp==userOTP){
                System.out.println("You have been logged in Successfully!");
            }
            else {
                System.out.println("Invalid Otp");
            }
        }
        else{
            System.out.println("Invalid Username");
        }
        scan.close();
    }
}
