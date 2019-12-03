package miscellaneous.tutorial.programmingWithJava;

public class StaticBlock {
	
	static String method = "";
	
	// Static Block. Always executes before the main method.
	static{
		System.out.println("Hello from static block 1.");
		
		//Assigning a string to static variable "method"
		method ="main method.";
	}
	
	//Main method
	public static void main(String[] arga) {
		System.out.println("Hello from "+method);
	}

	//Another static block
	static {
		System.out.println("Hello from static block 2.");
	}
}
