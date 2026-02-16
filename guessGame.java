import java.util.Random;
import java.util.Scanner;

public class guessGame {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int num = random.nextInt(0,11);
        int attempt=0;
        System.out.println("Enter number between 0 - 10");
        //loop
        int guess;
        do {
            System.out.print("Enter number for guess: ");
            guess = scanner.nextInt();
            if (guess>num){
                System.out.println("Too high!");
            }
            else if (guess<num){
                System.out.println("Too low!");
            }
            else {
                System.out.println("Exact Match Found");
            }
            attempt++;
        }while (num!=guess);
        System.out.println("You won! "+attempt+" guess/guesses taken");
        scanner.close();
    }
}
