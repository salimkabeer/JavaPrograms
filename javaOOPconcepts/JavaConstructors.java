/**
  A constructor must not have any return .
  A java constructor can not be abstract, static, final, and synchronized.
  Two types of constructor are default and parameterized constructor.
  There is no copy constructor in java. 
*/

class JavaConstructors {
    int id;
    String name;

    JavaConstructors(int i, String str) {
        id = i;
	name = str;
    }

    void display() {
        System.out.println(id + " : " + name);
    }

    public static void main(String args[]) {
        JavaConstructors obj = new JavaConstructors(10, "Salim");

	obj.display();
    }
}
