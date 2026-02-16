import java.util.Scanner;

public class exercise_3 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter e-mail ID: ");
        String email = scan.nextLine();
        System.out.print("Enter Password: ");
        String pass = scan.nextLine();

        if(email.equals("admin")&pass.equals("123f76B")){
            System.out.println("Login Successfully!");
        }
        else {
            System.out.println("Invalid Email ID or Password");
        }
        scan.close();
    }
}
