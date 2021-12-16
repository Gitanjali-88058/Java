import Mypack.Balance;

class AccountBalance{
 public static void main(String [] args){
 Balance current[]=new Balance[3];
 current[0]=new Balance("Geet",1000000);
 current[1]=new Balance("Nitin",0);
 current[2]=new Balance("Ram",20);
 for(int i=0;i<3;i++)
 current[i].show();
 }
}