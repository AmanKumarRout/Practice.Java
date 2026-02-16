import java.util.Scanner;
public class calculator {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        // user give 2 number input a & b
        // choose add /div/mul/sub
        //calculate & result
        //want t re-use it?
        String reuse = "y";
        do {
            System.out.print("Enter first number: ");
            double first = scanner.nextDouble();
            System.out.print("Enter second number: ");
            double second = scanner.nextDouble();
            scanner.nextLine();
            System.out.print("Choose a operation : +,-,*,/: ");
            String fun = scanner.nextLine();
            switch (fun) {
                case "add", "+", "addition" -> System.out.println("Result: " + (first + second));
                case "sub", "-", "subtract" -> System.out.println("Result: " + (first - second));
                case "mul", "*", "multiply" -> System.out.println("Result: " + (first * second));
                case "div", "/", "divide" -> System.out.println("Result: " + (first / second));
                default -> System.out.println("Please Choose a valid Operator");
            }
            System.out.print("If you want to reuse it press 'y': ");
            reuse = scanner.nextLine();
        }while (reuse.equals("y"));
        System.out.println("Thanks for using our program");


        scanner.close();
    }
}
