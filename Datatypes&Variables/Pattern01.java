import java.util.Scanner;                   
class Pattern01{                      
 public static void main(String[] args){
  Scanner sc=new Scanner(System.in);
  int n=sc.nextInt();
  for(int i=1;i<=n;i++){
   if(i>n/2){
   for(int j=i;j<=n-i;j++){
    System.out.print("* ");
   }
   }
   else{
   for(int j=5;j<=n-i-1;j--){
    System.out.print("* ");
   }
   }
   System.out.println("");
  } 
   
 }
}
/*
*    n=1
**   n=2
***  n=3
****
***
**
*


*/