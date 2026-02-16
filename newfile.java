import java.awt.desktop.SystemEventListener;
import java.util.Scanner;

public class newfile {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number to find sum of digit: ");
        //int num = scan.nextInt();
        int a=234;
        int b = a%10;
        System.out.println(b);
        int c= (a/10)%10;
        System.out.println(c);
        int d=(a/100)%10;
        System.out.println(d);
    }
}
