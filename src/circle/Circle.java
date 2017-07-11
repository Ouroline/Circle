package circle;
public class Circle {
    private double radius;
    private char color;
    
    public double getRadius(){
        return radius;
    }
    
    public char getColor(){
        return color;
    }
    
    public double getArea(){
        return radius * radius * Math.PI;
    }
    
    public double setRadius(){
        return radius;
    }
    
    public char setColor(){
        return color;
    }
    
    
    
}
