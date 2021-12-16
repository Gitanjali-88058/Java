class OverloadDemo{
 public static void main(String[] args){
 Overload ob1=new Overload();
 
 //Calling all versions of method.
 ob1.test();
 ob1.test(8);
 ob1.test(2,4);
 
 ob1.test(5.0);
 ob1.test('A',12);
 ob1.test(12,'A');
 
 }
}
class Overload{
 public int a;
 public int b;
 
 Overload(){     //Default constructor
 a=-1;
 b=-1;
 System.out.println("Default constructor");
 
 }
 Overload(int len)
 {
 a=b=len;
 }
 Overload(int i,int j)   //Parameterized Constructor
 {
  a=i;
  b=j;
  
  System.out.println("Parameterized Constructor");
  System.out.println("a= "+a +" "+" b= "+b);
 }
 void test(){
  System.out.println("No parameters");
 }
 void test(int a){             //With one parameter
  System.out.println("a: "+a);
 }
 void test(int a,int b){      //With 2 parameter
  System.out.println("a and b: "+ a +" "+b);
 }
 void test(int a,char b){        //With different type of parameter
  System.out.println("a= "+a+" b= "+b);
 }
 void test(char a,int b){        //Different Sequence parameter
  System.out.println("a= "+a+" b= "+b);
 }
 
 void test(double a){                 
  System.out.println("double a: "+a*a);
 }
 
}
  