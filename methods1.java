import java.util.Scanner;

public class methods1 {
    public static void main(String[] args){

       // greet("Aman");
        Scanner scanner=new Scanner(System.in);
        System.out.print("Press 1:Add ; 2:Sub; 3:Mul; 4:Div ");
        String calc = scanner.nextLine();
    switch (calc){
        case "1" -> sum();
        case "2" -> sub();
        case "3" -> mul();
        case "4" -> div();
        default -> System.out.println("Enter between 1-4");
    }


    }
    static void sum(){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter num1:");
       int first = scan.nextInt();
        System.out.print("Enter num2:");
        int second = scan.nextInt();
        int sum = first+second;
        System.out.println("Result: "+sum);
    }

    static void sub(){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter num1:");
        int first = scan.nextInt();
        System.out.print("Enter num2:");
        int second = scan.nextInt();
        int sub = first-second;
        System.out.println("Result: "+sub);
    }

    static void mul(){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter num1:");
        int first = scan.nextInt();
        System.out.print("Enter num2:");
        int second = scan.nextInt();
        int mul = first*second;
        System.out.println("Result: "+mul);
    }

    static void div(){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter num1:");
        int first = scan.nextInt();
        System.out.print("Enter num2:");
        int second = scan.nextInt();
        int div = first/second;
        System.out.println("Result: "+div);
    }
    //static void greet(String name){
    //    System.out.println("hello "+ name);
   // }
}
