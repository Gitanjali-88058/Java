package sets;
import java.util.*;
class Sets01{
 public static void main(String [] args){
 // Set<String> fruits=new LinkedHashSet<>();
 Set<String> fruits=new TreeSet<>();
  fruits.add("Apple");
  fruits.add("Banana");
  fruits.add("Kiwi");
  System.out.println(fruits.add("Banana"));
  System.out.println(fruits.add("Guava"));
  System.out.println(fruits);
 }
}
