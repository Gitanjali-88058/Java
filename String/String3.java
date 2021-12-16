class String3{
 public static void main(String [] args){
 String s="Gitanjali";
 System.out.println(s.charAt(3));
 String s1="This is a demo of the getChars method.";
 int start=0;
 int end=4;
 char buf[]=new char[end-start];
 s1.getChars(start, end,buf,0);
 System.out.println(buf);
 }
}
