import java.util.Scanner;
import java.util.*;
class StringPalindrome{
 public static void main(String [] args){
 Scanner sc=new Scanner(System.in);
 System.out.println("Enter the String: ");
 String word=sc.nextLine();
 String reverse="";
 int length=word.length();
 for(int i=length-1;i>=0;i--){
  reverse=reverse+word.charAt(i);
 }
 System.out.println("Reversed string: "+reverse);
 if(word.equals(reverse)){
  System.out.println("Word/Number is a Palindrome");
 }
 else{
  System.out.println("Word/Number is not a Palindrome");
 }
 }
}