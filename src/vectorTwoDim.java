import java.util.Scanner;
import java.lang.Math;

public class vectorTwoDim {
    public static void main(String[] args) {
        //System.out.print("Enter Vector X and Y coordinates:");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Vector Coordinates as i+j & u+v:");
        Vector2d vector2 = new Vector2d(sc.nextDouble(),sc.nextDouble(),sc.nextDouble(),sc.nextDouble());
        //Vector2d vector2 = new Vector2d();
        System.out.println(vector2.displayVector1());
        System.out.println(vector2.displayVector2());
        System.out.println("Choose any of the following: ");
        System.out.println("1. Magnitude 2. Addition 3. Subtraction 4. Dot product");
        int choice = sc.nextInt();
    switch (choice){
        case 1 -> {
            System.out.println("Magnitude of vector "+vector2.displayVector1()+" is " +vector2.magnitude1());
            System.out.println("Magnitude of vector "+vector2.displayVector2()+" is "+vector2.magnitude2());
        }
        case 2 -> System.out.println("Addition: "+vector2.add());
        case 3 -> System.out.println("Subtraction: "+vector2.sub());
        case 4 -> System.out.println("Dot product: "+vector2.dot());
    }


    }
}
class Vector2d {
    double x,y;
    double u,v;
    public Vector2d(double x, double y, double u, double v) {
        this.x = x;
        this.y = y;
        this.u = u;
        this.v = v;
    }
    // vector display
    String displayVector1(){
        return x+"i"+"+"+y+"j";

    }String displayVector2(){
        return u+"i"+"+"+v+"j";
    }

    //for magnitude
    double magnitude1(){
            double mag = Math.sqrt((x*x) + (y*y));
            //System.out.println("Magnitude"+mag);
            return mag;
        }
        double magnitude2(){
            double mag = Math.sqrt((u*u) + (v*v));
            //System.out.println("Magnitude"+mag);
            return mag;
        }
        //dot product


    double dot(){
        double dotProd = (x*u) + (y*v);
        return dotProd;
    }
    //add
    String add(){
        double a = (x+u);
        double b = (y+v);
        return a+"i"+"+"+b+"j";

    }String sub(){
        double a = (x-u);
        double b = (y-v);
        return a + "i" +"+"+ b + "j";

    }

}

