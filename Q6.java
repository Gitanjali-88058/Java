class Q6{
 public static void main(String [] args){
 //Parent o1=new Parent();     cannot be instantiated.
 sub1 o2=new sub1();
 sub2 o3=new sub2();
 
 o2.message();
 o3.message();
 }
}
abstract class Parent{
 abstract void message();
}
class sub1 extends Parent{
 void message(){
 System.out.println("This is first subclass");
 }
}
class sub2 extends Parent{
 void message(){
 System.out.println("This is second subclass");
 }
}