package circle;

import java.util.Scanner;

public class Test {
    public static void main(String[] args)
    {
    double area;
    Scanner sc = new Scanner(System.in);
    Circle c1 = new Circle();
    
   double rad = sc.nextDouble();
    
    c1.setRadius(rad);
    
    System.out.println("The Radius is: " + c1.getRadius());
    System.out.println("The Color is: " + c1.getColor());
    System.out.println("The Area is: " + c1.getArea());
    System.out.println("The circumference is: " + c1.getCircumference());
    }
}
