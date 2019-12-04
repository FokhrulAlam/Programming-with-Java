package miscellaneous.tutorial.programmingWithJava;

public class FinalKeyWord {
	//final keyword can be used with variables,methods,classes
	
	final int i = 5;
	//Once a value is assigned to a final variable, it can not be changed.
	// i = 6; will show an error now
}

class C{
	final public void display() {
		/*This method can not be overridden
		because of the final keyword
		*/
	}
}

final class D extends C{
	//this class can not be inherited due to final keyword
	/*We can not create a display() method here.
	 * Because this class inherits class C.
	 * And method display() in class C is final
	 */
	public void show() {
		
	}
}
