package circle;
public class Circle {
    private double radius;
    private String color;
    
    public double getRadius(){
        return radius;
    }
    
    public String getColor(){
        return color;
    }
    
    public void setRadius(double rad){
        if(rad<=0)
        {
            System.out.println("radius cannot be lower than 0");
        }
        else
        {
            radius = rad;
        }
    }
    
    public String setColor(){
        return color;
    }
    
    public double getArea(){
        return radius * radius * Math.PI;
    }
    
    public double getCircumference() {
      return 2.0 * radius * Math.PI;
   }
    
    @Override
    public String toString() {
      return "Circle[radius=" + radius + ", color=" + color + "]";
   }
 
}
