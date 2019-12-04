package miscellaneous.tutorial.programmingWithJava;

public class SuperKeyWord {
	public static void main(String[] args) {
		B obj = new B(5);
		B obj1 = new B();
	}

}

/* In a class, the constructor calls the default constructor of
 * the parent class. For this purpose, super keyword is used.
 * By default, a super keyword is created inside the constructors,
 * even if we do not explicitly mention it.
 */
class A{
	public A() {
		super();	// we don't need to explicitly mention it
		System.out.println("In the default constructor of class A.");
	}
	public A(int a) {
		System.out.println("In the parameterized constructor of class A.");
	}
}

class B extends A{
	//By default, the constructors of class B call the default constructor of parent class A
	
	public B() {
		
		System.out.println("In the default constructor of class B.");
	}
	
	public B(int i) {		//This is called parameterized constructor
		
		super(i);	//Instead of calling the default constructor,  it calls the parameterized one
		System.out.println("In the parameterized constructor of class B.");
	}
	
}