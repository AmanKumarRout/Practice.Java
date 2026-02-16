import java.util.Random;
import java.util.Scanner;


public class exerciseRandomGuessNo {
    public static void main(String[] args){
        int num;
        Scanner scan = new Scanner(System.in);
        Random random = new Random();
        System.out.println("---Enter a number to Guess---");
        num = random.nextInt(1,5);
        int userNo = scan.nextInt();
        if(num==userNo){
            System.out.println("Your number is matched!");
        }
        else {
            System.out.println("Better luck next time!");
        }
        scan.close();
    }
}
