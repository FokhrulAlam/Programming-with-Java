package miscellaneous.tutorial.programmingWithJava;

import practice.importingpackage.MathOperation;		//Look at the class I imported
import static java.lang.System.out;		// this is static import

public class StaticImport {
	public static void main(String[]args) {
		
		//Creating an object from MathOperation class
		MathOperation product = new MathOperation();
		int age = product.main(null);
		
		//printing the result fetched from the MathOperation class
		out.println("Your age is "+age);
	}

}
