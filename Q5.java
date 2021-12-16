import java.util.Scanner;
class Q5{
 public static void main(String[] args){
 for (int i = 0; i < args.length; i++) {
 int number=Integer.parseInt(args[i]);
 if (number==0||number==1){
  System.out.println("Number is not prime.");
 }
 else 
 {
   
 
 int c;
 c=checkPrime(number);
 if(c<1)
 System.out.println("Number is prime");
 else
 System.out.println("Number is not prime");
 }
 }
 }



 public static int checkPrime(int num){
 int count=0;
 for(int i=2;i<num;i++){
  if(num%i==0){
  { 
    count++;
  }
  //return count;
 }
 }
return count;
}
}

