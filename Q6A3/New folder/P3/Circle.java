package P3;
import P1.Shape;
public class Circle extends Shape{
 private double radius;
 
 public Circle(double  r){
 radius=r;
 
 }
public void area(){
 Area=22/7*radius*radius;
 System.out.println("Area of Circle: "+Area);
}
}