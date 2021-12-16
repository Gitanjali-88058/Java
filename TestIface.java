
class TestIface{
public static void main(String [] args){
 Callback c=new Client();
 Client a=new Client();
 AnotherClient ob=new AnotherClient();
 
 //Callback b=new Incomplete();
 Callback m=new B();
 
 c.callback(42);
 a.nonIfaceMeth();
 c=ob;
 c.callback(42);
 //b.display(2,4);
 m.display(3,3);
}
}
interface Callback{
 void callback(int param);
}


class Client implements Callback{
 public void callback(int p){
   System.out.println("Callback called with "+ p);
 }
void nonIfaceMeth(){
 System.out.println("Classes that implement interface "+"may also defines other members,too.");
}
}
class AnotherClient implements Callback{
 public void callback(int p){
  System.out.println("Another version of callback");
  System.out.println("p squared is "+ (p*p));
 }
}
 abstract class Incomplete implements Callback{
 void display(int a,int b){
  System.out.println(a+b);
 }
}
class B extends Incomplete{
public void callback(int p){
System.out.println("Inherited class");
}
}

 
