class Staticmethod{
public static void main(String [] args){
System.out.println(MyIF.getString());
MyIFImp ob=new MyIFImp();
System.out.println(ob.getNumber());
}
}
interface MyIF{
 public int getNumber();
  
static String getString(){
  return "Static String";
}
}
class MyIFImp implements MyIF{
 public int getNumber(){
  return 25;
}
}
