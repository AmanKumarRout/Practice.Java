import java.util.Scanner;
import java.lang.String;

public class exerciseEmailValidator {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Please Enter your email ID :");
        String email = scan.nextLine();
        if(!email.isEmpty()){
            if(email.contains("@")){
                if(email.contains("gmail.com")||email.contains("yahoo.com")||email.contains("hotmail.com")||email.contains("microsoft.com")){
                    System.out.println("Your Username is: "+ email.substring(0,email.indexOf("@")));
                }
                else{
                    System.out.println("Email must contain a domain name");
                }
            }
            else {
                System.out.println("Email must contain '@'");
            }
        }
        else{
            System.out.println("Please enter a email!");
        }
        scan.close();
    }
}
