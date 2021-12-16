package P2;
import P1.Shape;
public class Rectangle extends Shape{
 private double length;
 private double width;
public Rectangle(double l,double w){
 length=l;
 width=w;
}
public void area(){
 Area=length*width;
 System.out.println("Area of the Reactangle: "+Area);
}
}

 