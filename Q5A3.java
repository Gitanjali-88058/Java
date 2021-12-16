class Q5A3{
 public static void main(String[] args){
 A a=new A();
 a.meth();
 }
}
interface constructor{
 
 default void meth(){
  int num;
  /*meth(int n){
  num=n;
  }*/
  System.out.println("NUMBER ");
 }
}
class A implements constructor {
 
}
