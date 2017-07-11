package circle;

import java.util.Scanner;

public class Test {
    public static void main(String[] args)
    {
    double area;
    
    Scanner sc = new Scanner(System.in);
    Circle c1 = new Circle();
    
    System.out.println("Welcome!!!");
    System.out.println("Please Enter The Radius Of The Circle");
    
    double rad = sc.nextDouble();
    c1.setRadius(rad);
    
    System.out.println("Please Enter The Chosen Degree Of The Circle");
    double sec = sc.nextDouble();
    c1.setSectorDegree(sec);
            
    System.out.println("The Radius is: " + c1.getRadius());
    System.out.println("The Color is: " + c1.getColor());
    System.out.println("The Area is: " + c1.getArea());
    System.out.println("The Circumference is: " + c1.getCircumference());
    System.out.println("The Diameter is: " + c1.getDiameter());
    System.out.println("The Segment is: " + c1.getSegment());
    System.out.println("The Sector Area is: " + c1.getSectorarea());
    System.out.println("The Arc Length is: " + c1.getArc());
    }
}
