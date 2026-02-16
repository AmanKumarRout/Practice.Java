import java.util.Scanner;

public class Program1 {
    public static void main(String[] args){
        System.out.println("-- Enter Your Details --");
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter Name: ");
        String name = scan.nextLine();
        System.out.print("Enter Roll no: ");
        int rollNo = scan.nextInt();
        scan.nextLine();
        System.out.print("Enter Course: ");
        String course = scan.nextLine();
        System.out.print("Enter CGPA: ");
        double cgpa = scan.nextDouble();

        System.out.println("-- --Report Card-- --");
        System.out.println("Name: " + name);
        System.out.println("Roll no: " + rollNo);
        System.out.println("Course: " + course);
        if (cgpa>=4){
            System.out.println("Congratulations! You Passed...");
        }
        else {
            System.out.println("You Failed!");
        }
        scan.close();
    }
}
