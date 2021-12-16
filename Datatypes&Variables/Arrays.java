import java.util.Scanner;
class Arrays{
 public static void main(String [] args){
  
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter no. of rows: ");
  
  int row=sc.nextInt();
  System.out.println("Enter no. of cols: ");
  int col=sc.nextInt();
  int a1[][]=new int [row][col];
  int a2[][]=new int [row][col];
  int a3[][]=new int [row][col];
  System.out.println("Enter element for First array: ");
  for(int i=0;i<row;i++){
    for(int j=0;j<col;j++){
     a1[i][j]=sc.nextInt();
     
    }
  }
  
  System.out.println("Enter element for second array: ");
  for(int i=0;i<row;i++){
    for(int j=0;j<col;j++){
     a2[i][j]=sc.nextInt();
     
    }
  }
  for(int i=0;i<row;i++){
    for(int j=0;j<col;j++){
     a3[i][j]=a1[i][j]+a2[i][j];
     System.out.print(a3[i][j]+" ");
    }System.out.println(" ");
  }
 }
}