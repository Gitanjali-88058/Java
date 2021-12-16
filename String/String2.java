class String2{
 public static void main(String [] args){
 Box b=new Box(12,14,16);
 String s="Box b: "+b;
 System.out.println(b);
 System.out.println(s);
 }
}
class Box{
 double width;
 double length;
 double height;
 
 Box(double w, double h,double l){
  width=w;
  height=h;
  length=l;
 }
 public String toString(){
  return "Dimensions are "+width+" by "+length+" by "+height+" .";
 
 }
}
