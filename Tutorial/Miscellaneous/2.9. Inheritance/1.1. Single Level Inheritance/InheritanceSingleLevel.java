package miscellaneous.tutorial.programmingWithJava;

public class InheritanceSingleLevel {
	public static void main(String[] args) {
		
		// Subtraction inherits Addition.
		//So, instance should be created from Subtraction.
		//As, Subtraction assumes all characteristics of Addition
		Subtraction obj = new Subtraction();
		obj.number1 = 5;
		obj.number2 = 10;
		
		obj.add();
		System.out.println(obj.result);
		
		obj.subtract();
		System.out.println(obj.result);
	}

}

class Addition{
	int number1,number2,result;
	
	public void add() {
		result = number1 + number2;
	
	}
}

// Subtraction will inherit Addition.
// this is single level inheritance
class Subtraction extends Addition{
	public void subtract() {
		result = number1-number2;
	}
}