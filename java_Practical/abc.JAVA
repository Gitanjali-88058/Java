CASE 1: When class is public
package P1; //this is package P1
public class C1 { //this class is public
public int a=123; //the variables are public too
public int b=23;
}
package P1; //this is package P1
public class C2 { //this is the main class of P1
public static void main(String[] args) {
C1 c=new C1();
System.out.println(c.a+" "+c.b); //we can easily call the class in the same package as it is public
}
}
package P2; //this is package P2
import P1.C1; // C1 from P1 is imported
public class C3 {
public static void main(String ar[]) {
C1 c = new C1();
System.out.println(c.a+" "+c.b); //we can also easily access the class in a different package as it public
}
}
CASE 2: When Class is default-:
package P1; //this is package P1
class C1 { //this class is default
public int a=123; //the variables are default too
public int b=23;
}
package P1; //this is package P1
class C2 { //this is the main class of P1
public static void main(String[] args) {
C1 c=new C1();
System.out.println(c.a+" "+c.b); //we can easily call the class in the same package as it is default
}
}
package P2; //this is package P2
import P1.C1; //ERROR // C1 cant be imported as it is not visible
 class C3 {
public static void main(String ar[]) {
C1 c = new C1(); //ERROR
System.out.println(c.a+" "+c.b); //we can not access the class in a different package as it default
}
}
CASE 3: When Class is protected-:
We know top classes can not be defined as protected so we have made an inner class
package P1;
public class C1 {
public int a=123;
public int b=23;
protected class C1a { //protected inner class
int a1=67;
}
}
package P1;
public class C2{
public static void main(String[] args) {
 C1.C1a c = new C1().new C1a(); //the inner class can be easily accessed in the same package
System.out.println(c.a1);
}
}
package P2;
import P1.C1;
public class C3 {
public static void main(String ar[]) {
C1.C1a c = new C1().new C1a(); //ERROR
//as the inner class
 is protected so it
cant be accessed in a different package
}
}
CASE 4: When Class is private-:
We know top classes can not be defined as private so we have made an inner class
package P1;
public class C1 {
public int a=123;
public int b=23;
private class C1a { //private inner class
int a1=67;
}
}
package P1;
public class C2{
public static void main(String[] args) {
 C1.C1a c = new C1().new C1a(); //ERROR
//the inner class cant accessed
in the same package as it is private
System.out.println(c.a1);
}
}
package P2;
import P1.C1;
public class C3 {
public static void main(String ar[]) {
C1.C1a c = new C1().new C1a(); //ERROR
//as the inner class
 is private so it
cant be accessed in a different package
}
}