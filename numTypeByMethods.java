import java.util.Scanner;

public class numTypeByMethods {
    static int num;
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number to check: ");
        num = scan.nextInt();
        posneg();
        oddEven();
    }
    Scanner scanner=new Scanner(System.in);
    static void posneg(){
        Scanner scan = new Scanner(System.in);
        if (num>=0){
            System.out.println("Positive");
        }
        else {
            System.out.println("Negative");
        }
    }
    static void oddEven(){
        if (num%2==0){
            System.out.println("Even");
        }
        else {
            System.out.println("Odd");
        }
    }
}
