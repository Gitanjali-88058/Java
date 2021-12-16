import java.util.Scanner;
class Palindrome{
 public static void main(String [] args){
 Scanner sc=new Scanner(System.in);
 System.out.println("Enter the number: ");
 int num=sc.nextInt();  
 int temp=num;
 int rev=0;   
 while(temp>0){
  
  int rem=temp%10;
  temp=temp/10;  
  rev=rev*10+rem;
  
 }
 System.out.println("Reversed num: "+rev);
 if(num==rev){
  System.out.println("Number is palindrome. ");
 }else
  System.out.println("Number is not palindrome");
 }
 
 
}
 
  
 
                                                           