package miscellaneous.tutorial.programmingWithJava;

public class MultiLevelInheritance {
public static void main(String[] args) {
		
		// Subtraction inherits Addition.
		//So, instance should be created from Subtraction.
		//As, Subtraction assumes all characteristics of Addition
		Multiplication1 obj = new Multiplication1();
		obj.number1 = 5;
		obj.number2 = 10;
		
		obj.add();
		System.out.println(obj.result);
		
		obj.subtract();
		System.out.println(obj.result);
		
		obj.multiplication();
		System.out.println(obj.result);
	}

}

class Addition1{				// Super class/parent class/base class
	int number1,number2,result;
	
	public void add() {
		result = number1 + number2;
	
	}
}

//child class/sub class/derived class with respect to class Addition{}
//Super class/parent class/base class with respect to class Multiplication
class Subtraction1 extends Addition{			//Single Level Inheritance
	public void subtract() {
		result = number1-number2;
	}
}

class Multiplication1 extends Subtraction1{			//Multi Level Inheritance
	public void multiplication() {
		result = number1 * number2;
	}
}