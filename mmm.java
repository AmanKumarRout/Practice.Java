import java.util.Random;
import java.util.Scanner;

public class mmm {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int num = random.nextInt(0,11);
        int attempt=0;
        System.out.println("Enter number between 0 - 10");
        //loop
        int guess;
        while(true) {
            System.out.print("Enter number for guess: ");
            guess = scanner.nextInt();
            attempt++;
            if (guess==num){
                System.out.println("Exact!");
                break;
            }
            else if (guess<num){
                System.out.println("Too low!");

            }
            else {
                System.out.println("Too high");

            }
        }
        System.out.println("You won! "+attempt+" guess/guesses taken");
    }
}

