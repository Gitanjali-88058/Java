class Q4A3{
 public static void main(String [] args){
shape ob1=new Circle(2);
shape ob2=new Triangle(30,15);
shape ob3=new Rectangle(10,10);
 ob1.area();
 ob2.area();
 ob3.area();
 }
}
interface shape{
 //double Area=0;
 void area();
}
class Circle implements shape{
  
  double radius;
 Circle(double r){
 radius=r;
 }
 public void area(){
 
 System.out.println("Area of the circle: "+22/7*radius*radius);
 }
}
class Triangle implements shape{
  double base;
  double height;
 Triangle(double b, double h){
 base=b;
 height=h;
 }
 public void area(){
 
 System.out.println("Area of the Triangle: "+0.5*base*height);
 }
}
class Rectangle implements shape{
 double length;
 double width;
 Rectangle(double l, double w){
 length=l; 
 width=w;
 }
public void area(){
 
 System.out.println("Area of the Rectangle: "+length*width);
}
}
