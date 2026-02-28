package shapes;

import java.util.Scanner;

public class shapesrun {
    public static void main(String[] args) {
        System.out.print("Enter side of Triangle: ");
        Scanner sc = new Scanner(System.in);
        Triangle t = new Triangle();
        t.perimeter(sc.nextDouble(),sc.nextDouble(),sc.nextDouble());
        circle c = new circle();
        System.out.print("Enter radius of Circle: ");
        c.area(sc.nextDouble());
    }
}
