import java.util.Scanner;
import P1.Shape;
import P2.Rectangle;
import P3.Circle;
class Main{
 public static void main(String [] args){
 Rectangle ob1=new Rectangle(20,10);
 Circle ob2=new Circle(7);

 Scanner input=new Scanner(System.in);
 System.out.println("Enter the Shape: ");
 int shape=input.nextInt();
 if (shape==0){
   Rectangle k;
  k=ob1;
 k.area();
 }
 else if(shape==1){
 Circle k;
 k=ob2;
 k.area();
 }
 else{
 System.out.println("NOT APPLICABLE");
 }
}
}

  