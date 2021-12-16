class TypeCasting{    //NARROWING
 public static void main(String []args){
  double myDouble=2.456;
  System.out.println(myDouble);
  int myInt=(int) myDouble;
  System.out.println(myInt);
  int a=4;
  int c=a++;
  int b=++a;
  System.out.println(a);
  System.out.println(b);
  System.out.println(c);
 }
}