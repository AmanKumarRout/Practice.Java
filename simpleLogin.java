import java.util.Scanner;
public class simpleLogin {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        int attempt = 0;
        int i = 3;
        String user = "aman@2004";
        String pass = "bawligend";
        do {
            System.out.print("Enter your Username: ");
            user = scanner.nextLine();
            System.out.print("Enter your Password: ");
            pass = scanner.nextLine();
            if (user.equals("aman@2004") && pass.equals("bawligend")){
                System.out.println("You have logged in successfully...");
                break;
            }
            else {
                i--;
                System.out.println("Incorrect Username or Password!, "+i+" attempts left!");
                if (i==0){
                    System.out.println("You have tried all your attempts, Try again Later");
                }
            }
        }while (i>attempt);

    }
}
