class interExten{
 public static void main(String [] args){
 Myclass c=new Myclass();
 c.meth1();
 c.meth2();
c.meth3();

 }
}
interface A{
 void meth1();
 void meth2();
}
interface B extends A{
 void meth3();
}
class Myclass implements B{
 public void meth1(){
  System.out.println("IN VOID1");
}
public void meth2(){
  System.out.println("IN VOID2");
}
public void meth3(){
  System.out.println("IN VOID3");
}
}
