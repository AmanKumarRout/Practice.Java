package shapes;



public class Triangle extends shape {
    void area(double h, double b){
        double area = 0.5*(b*h);
        System.out.println("Area of Triangle is "+area);
    }
    void perimeter(double a, double b, double c){
        double perimeter = a+b+c;
        System.out.println("Perimeter of Triangle is "+perimeter);
    }
}
