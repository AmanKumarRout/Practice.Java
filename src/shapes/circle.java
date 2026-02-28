package shapes;

public class circle extends shape {
    void area(double r){
        double area= Math.PI*r*r;
        System.out.println("Area of circle is "+area);
    }
    void perimeter(double r){
       double perimeter= 2*Math.PI*r;
       System.out.println("Perimeter of circle is "+perimeter);
    }
}
