package shapes;

//import java.awt.Shape;

    public class Rectangle extends shape {
    void area(double l,double b){
        double area = l*b;
        System.out.println("Area of circle is "+area);
    }
    void perimeter(double l, double b){
        double perimeter = 2*(l+b);
        System.out.println("Perimeter of circle is "+perimeter);
    }
}
