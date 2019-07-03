# Java Tutorial
When a java program (*.java) is compiled, It generates bytecode (*.class).

Classloader: is a subsystem of JVM that is used to load class files in JVM.

Bytecode Verifier: checks the code fragments for illegal code that can violate
		   access right to objects.

Interpreter: read bytecode stream then execute the instructions.

# Setting Java Path in Linux OS
export PATH=$PATH:/home/jdk1.6.01/bin/

# JVM
It provides a runtime environment in which Java bytecode can be executed. It can
also run those programs which are written in other languages and compiled to 
Java bytecode.

JVM, JRE, and JDK are platform dependent because the configuration of each OS is
different from each other. However, Java is platform independent.

# JRE (RTE)
It is used to provide the runtime environment. It is the implementation of JVM.
It physically exists. It contains a set of libraries plus other files that JVM 
uses at runtime.

# JDK
It is a software development environment which is used to develop Java 
applications and applets. It physically exists. It contains JRE plus 
development tools. 

The JDK contains a private Java Virtual Machine (JVM) and a few other resources
such as an interpreter/loader (java), a compiler (javac), an archiver (jar), a 
documentation generator (Javadoc), etc. to complete the development of a Java 
Application.

# JIT compiler
JIT compiles parts of the bytecode that have similar functionality at the same 
time, and hence reduces the amount of time needed for compilation.

# Java Native Interface
Java Native Interface (JNI) is a framework which provides an interface to 
communicate with another application written in another language like C, C++, 
Assembly etc. Java uses JNI framework to send output to the Console or interact
 with OS libraries.

# Variable in Java :
	local, instance, and static

	A variable declared inside the body of the method is called local 
variable. You can use this variable only within that method and the other 
methods in the class aren't even aware that the variable exists. 

	A variable declared inside the class but outside the body of the 
method, is called instance variable. It is not declared as static.
It is called instance variable because its value is instance specific and is 
not shared among instances.

	A variable which is declared as static is called static variable. It can
not be local. You can create a single copy of static variable and share among 
all the instances of the class. Memory allocation for static variable happens 
only once when the class is loaded in the memory. 

class A  {
	int data = 50; // instance variable
	static int m = 100; //static variable
	void method() {
		int n = 90; // local variable
	}
} 


# Datatypes

1.Primitive data types: The primitive data types include boolean, char, byte, 
	short, int, long, float and double.
2. Non-primitive data types: The non-primitive data types include Classes, 
	Interfaces, String, and Arrays.

Note:- Java is a statically-typed programming language. It means, all variables
must be declared before its use. That is why we need to declare variable's type
and name.


