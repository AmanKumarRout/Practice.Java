import java.util.Scanner;

public class abc {
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
                System.out.println("You have logged in successfully");
            }
            else {
                i--;
                System.out.println("Retry Again "+i+" attmpts left!");
            }
        }while (i>attempt);
        scanner.close();
    }
}
