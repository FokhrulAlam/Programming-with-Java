package miscellaneous.tutorial.programmingWithJava;

public class MethodOverriding {
	public static void main(String[] args) {
		
		/*In inheritance, SuperClass obj = new SubClass();
		 * and SuberClass obj = new SubClass();
		 * are the same thing.
		 */
		SuperClass obj = new SubClass();
		obj.show();
	}
}

class SuperClass{
	public void show() {
		System.out.println("SuperClass: Hi, there!");
	}
}

class SubClass extends SuperClass{
	public void show() {		//this show() will override the show() in SuperClass
		System.out.println("SubClass: Hi, there!");
	}
}
