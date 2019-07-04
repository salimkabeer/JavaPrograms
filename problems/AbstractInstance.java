abstract class my {
    public void mymethod() {
        System.out.print("Abstract");
    }
}

class AbstractInstance {
    public static void main(String a[]) {
        my m = new my() {};
        m.mymethod();
    }
}
/*
 * No, you are not creating the instance of your abstract class here. Rather 
 * you are creating an instance of an anonymous subclass of your abstract 
 * class. And then you are invoking the method on your abstract class reference
 * pointing to subclass object.
 *
 * Whenever a new class instance is created, memory space is allocated for it 
 * with room for all the instance variables declared in the class type and all 
 * the instance variables declared in each superclass of the class type, incl-
 * uding all the instance variables that may be hidden
 *
 * Suppose you put those classes in two different files:
 * In My.java
 *
 * abstract class My {
    public void myMethod() {
        System.out.print("Abstract");
    }
   }

 * 
 * In Poly.java
 *
 * class Poly extends My {
    public static void main(String a[]) {
        My m = new My() {};
        m.myMethod();
    }
   }
 * 
 * Now, compile both of source file
 * javac My.java Poly.java
 *
 * It will create My.class, Poly$1.class(anonymous subclass), and Poly.java
*/
