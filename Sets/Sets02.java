package sets;
import java.util.*;
class Sets02{
  public static void main(String [] args){
   Set<Integer> x= new HashSet<>();
   x.add(23);
   x.add(1);
   x.add(60);
   System.out.println(x);
   Set<Integer> y=new HashSet<>();
   y.add(2);
   y.add(6);
   y.add(60);
   System.out.println(y);
   //x.addAll(y);
   //x.retainAll(y);
   
   System.out.println(x);
   System.out.println(x.containsAll(y));
   //x.clear();
  System.out.println( x.size());
   x.toArray();
   System.out.println(x.contains(3));
   System.out.println(x.isEmpty());
   System.out.println(x);
  }
} 