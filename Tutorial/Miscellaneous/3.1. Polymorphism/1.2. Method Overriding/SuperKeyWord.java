package miscellaneous.tutorial.programmingWithJava;

public class SuperKeyWord {
	public static void main(String[] args) {
		B obj = new B();
		obj.display();
	}

}

/* In a class, the constructor calls the default constructor of
 * the parent class. For this purpose, super keyword is used.
 * By default, a super keyword is created inside the constructors,
 * even if we do not explicitly mention it.
 */
class A{
	
	public void display() {
		System.out.println("In the display method of class A.");
	}
}

class B extends A{
	//By default, the constructors of class B call the default constructor of parent class A
	
	public void display() {
		super.display();   //No method overriding due to super.display()
		System.out.println("In the display method of class B.");
	}
}