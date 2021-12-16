class String1{
public static void main(String[] args){
 char chars[]={'a','b','c','d'};
 String s=new String(chars,1,3);
  System.out.println(s);
 byte ascii[]={65,66,67,68,69,70};
 String s1=new String(ascii);
 System.out.println(s1);
 System.out.println(s.length());
 System.out.println(s1.length());
 
 System.out.println("abc".length());
 String num="2";
 String s2="come on now"+" follow my lead "+num;
 System.out.println(s2);
 

 
 
}
}