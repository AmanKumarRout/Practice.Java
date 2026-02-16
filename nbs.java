import java.util.Scanner;

public class nbs {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        int attempt = 0;
        String user = "aman@2004";
        String pass = "bawligend";
        System.out.print("Enter your Username: ");
        user = scanner.nextLine();
        System.out.print("Enter your Password: ");
        pass = scanner.nextLine();
        if (user.equals("aman@2004") && pass.equals("bawligend")){
            System.out.println("You logged in successfully!");
        }
        else {
            for (int i = 3; i > attempt; i--) {
                System.out.println("Attempts left: " + i);
                System.out.print("Enter your Username: ");
                user = scanner.nextLine();
                System.out.print("Enter your Password: ");
                pass = scanner.nextLine();

            }
            System.out.println("You failed to logged in with these attempts!");
        }

        scanner.close();
    }
}
