class defaultMethod{
 public static void main(String[] args){
 MyIFImp ob=new MyIFImp ();
 System.out.println(ob.getString());
 System.out.println(ob.getNumber());
 }
}
interface MyIF{
default String getString(){
 return "String method";
}
public int getNumber();

}
class MyIFImp implements MyIF{
public int getNumber(){
 return 25;
}
 public String getString(){
 return "Different String";
}

}

 