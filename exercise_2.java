import java.util.Scanner;

public class exercise_2 {
    public static void main(String[] args){
        //Input of numbers

        System.out.println("--- This is a simple calculator ---\n");
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter first number: ");
        double firstNo = scan.nextDouble();
        System.out.print("Enter second number: ");
        double secondNo = scan.nextDouble();

        //output

        System.out.println("Addition: " + (firstNo+secondNo));
        System.out.println("Substraction: " + (firstNo-secondNo));
        System.out.println("Multiplication: " + (firstNo*secondNo));
        System.out.println("Division: " + (firstNo/secondNo));

        scan.close();

    }
}
