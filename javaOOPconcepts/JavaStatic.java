/**
 * The static variable gets memory only once in the class area at the time of 
 * class loading.
 * Instance variable gets the memory at the time of object creation, each 
 * object will have the copy of instance variable.
 *
 */

class JavaStatic {
    int instanceCount = 0; // will get memory when object is being created.
    static int count = 0;

    JavaStatic() {
        instanceCount++;
	count++;
	System.out.println(instanceCount + " : " + count);
    }

    public static void main(String args[]) {
        JavaStatic c1 = new JavaStatic();
	JavaStatic c2 = new JavaStatic();
	JavaStatic c3 = new JavaStatic();
    }
} 
