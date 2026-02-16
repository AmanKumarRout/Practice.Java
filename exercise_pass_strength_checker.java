import java.util.Scanner;
import java.lang.String;

public class exercise_pass_strength_checker {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Please Enter your PASSWORD to check: ");
        String pass = scan.nextLine();
        if(pass.length() >=8){
            if (pass.contains("@")||pass.contains("#")||pass.contains("$")||pass.contains("!")||pass.contains("%")||pass.contains("&")){
                if(pass.contains("1")||pass.contains("2")||pass.contains("3")||pass.contains("5")||pass.contains("6")||pass.contains("7")||pass.contains("8")||pass.contains("9")||pass.contains("0")){
                    System.out.println("Strong Password!");
                }
               else {
                    System.out.println("Weak Password, Password must contain numbers");
                }
            }
            else {
                System.out.println("Weak Password!, must contain Special Characters '@,!,#,$,%,&'");
            }
        }
        else{
            System.out.println("The PASSWORD must contain 8 characters");
        }
        scan.close();
    }
}
