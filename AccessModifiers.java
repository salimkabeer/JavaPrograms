class Abc {
    private String str1 = "private";
    protected String str2 = "protected";
    public String str3 = "public";

    private void msg1() {
        System.out.println("Inside private!");
    }
    protected void msg2() {
        System.out.println("Inside protected!");
    }
    public void msg3() {
        System.out.println("Inside public!");
    }
    void msg4() {
        System.out.println("Inside Default");
    }
}

class AccessModifiers extends Abc {
    public static void main(String args[]) {
        Abc obj = new Abc();
	
	// compile time error
	// System.out.println(obj.str1);
	
	// After inheritance it became public 
	System.out.println(obj.str2);

	// Run completely fine
	System.out.println(obj.str3);

	// Compile time error
	// obj.msg1();
	
	obj.msg2();
	obj.msg3();
	obj.msg4();
    }
}
