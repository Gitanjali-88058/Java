class Example{
 public static void main(String [] args){
  try{
  int a[]=new int[5];
  int b=0;
  System.out.println(a[6]);
  }catch(ArithmeticException e){
   System.out.println(e.getMessage() +"occured, please check your code.");
  }catch(ArrayIndexOutOfBoundsException e){
    System.out.println("Index should be int he proper range");
  }catch(IllegalArgumentException e){
   System.out.println("check your casting carefully");
  }finally{
    System.out.println("Sorry for the inconvenience.");
  }
  System.out.println("Very important code");
 }
}
