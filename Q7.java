class Q7{
 public static void main(String [] args){
 Subclass sub1=new Subclass();
 sub1.a_method();
 sub1.nonAbstract();
 }
}
abstract class Driver{
 Driver(){
 System.out.println("This is constructor of abstract class.");
 }
 abstract void a_method();
 void nonAbstract(){
  System.out.println("This is a normal method of abstract class.");
 }
}
class Subclass extends Driver{
 void a_method(){
 System.out.println("This is abstract method.");
 }
} 
