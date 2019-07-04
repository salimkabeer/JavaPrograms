// package that import the another package

package pack;
import mypack.Simple;

class B {
    public static void main(String args[]) {
        Simple obj = new Simple();
	obj.msg();
    }
}
