class DMD{
 public static void main(String [] args){
 A a=new A();
 B b=new B();
 C c=new C();
/* A r;
 r=a;
 r.callme();
 r=b;
 r.callme();
 r=c;
 r.callme(); */
//a.callme();
//b.callme();
//c. callme();

}
}
class A{
 void callme(){
 System.out.println("In class A");
 }
}
class B extends A{
 void callme(){
 System.out.println("In class B");
 }
}
class C extends A{
 void callme(){
 System.out.println("In class C");
 }
}