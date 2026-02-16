import com.sun.security.jgss.GSSUtil;

import java.util.Scanner;

public class practice {
    public static void main(String[] args){
        //Switches--
        Scanner scan = new Scanner(System.in);
//        System.out.print("Enter your day of the week: ");
//        String day = scan.nextLine();
//        switch (day){
//            case "Monday","Tuesday","Wednesday","Thursday","Friday" -> System.out.println(day+" is a weekday");
//            case "Saturday","Sunday" -> System.out.println(day+" is a weekend");
//            default -> System.out.println("Please Enter a valid day");
//        }
//        System.out.print("Enter a number: ");
//        int userNo = scan.nextInt();
//        for (int i=1;i<=userNo;i++){
//            System.out.println("Hello!");
//        }
//        System.out.println("The Loop is terminated");
        System.out.print("Enter no of rows: ");
        int rows = scan.nextInt();
        System.out.print("Enter no of columns: ");
        int columns = scan.nextInt();
        scan.nextLine();
        System.out.print("Enter a symbol for pattern: ");
        String symbol = scan.nextLine();
        for(int i=0;i<=rows;i++){
            for(int j=0;j<=columns;j++){
                System.out.print(symbol+" ");
            }
            System.out.println();
        }
        scan.close();
    }
}
