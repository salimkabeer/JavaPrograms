class A {
    protected int a = 20;
}

public class Protected1 extends A {
   public static void main(String args[]){
       A obj = new A();
       System.out.println(obj.a);
   }
}
