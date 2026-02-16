import java.util.Scanner;

public class exercises_1 {
    public static void main(String[] args){
        //Simple exercise for profile creation giving user input
        Scanner scan = new Scanner(System.in);
        System.out.println(" --Enter your details here-- \n");
        //Enter inputs =

        System.out.print("Enter your full name ");
        String name = scan.nextLine();
        System.out.print("What is your Age? ");
        int age = scan.nextInt();
        System.out.print("What is your CGPA ");
        double cgpa = scan.nextDouble();
        scan.nextLine();
        System.out.print("What is your Fav. Food? ");
        String food = scan.nextLine();

        // Outputs here
        System.out.println("The profile has been created Successfully!\n");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("CGPA: " + cgpa);
        System.out.println("favourite Food: " + food);

        scan.close();


    }
}
