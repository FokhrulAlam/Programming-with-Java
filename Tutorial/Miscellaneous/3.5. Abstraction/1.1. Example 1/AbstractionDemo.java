package miscellaneous.tutorial.programmingWithJava;

// here is our client.
//From this class, the client searches for and receives the expected output.
public class AbstractionDemo {
	public static void main(String[] args) {
		MathOperationExtension2 obj = new MathOperationExtension2();
		obj.add();
		obj.subtract();
		obj.multiply();
		obj.divide();
	}
}

//First abstract class. It contains all the methods- both declared and defined.
//Defines the first method only and leaves other method for the developers.
abstract class MathOperation{		//abstract class
	int number1 = 10;
	int number2 = 12;
	
	public void add() {
		System.out.println("The sum is "+(number1+number2));
	}
	
	public abstract void subtract();	//abstract method
	public abstract void multiply();	//abstract method
	public abstract void divide();		//abstract method
}

//Defines the second abstract method
//The developer did not have enough time to define other methods as he retired.
abstract class MathOperationExtension1 extends MathOperation{		//another abstract class
	//Defining only one method
	//That's why this class is abstract too
	public void subtract() {
		System.out.println("The difference is "+(number1-number2));
	}
}

//Defines the last two methods
//The third developer got enough time to implement the last two methods and complete the project.
class MathOperationExtension2 extends MathOperationExtension1{			//This is the concrete class
	
	//Creating objects from this class we can call all four methods.
	
	public void multiply() {
		System.out.println("The product is "+(number1*number2));
	}
	public void divide() {
		System.out.println("The quotient is "+(number1/number2));
	}
}
