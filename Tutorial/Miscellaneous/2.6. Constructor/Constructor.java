
public class Constructor {
	public static void main(String[] args) {
		CallClass obj = new CallClass();		//Calling constructor 1
		CallClass obj1 = new CallClass(23);		//Calling constructor 2
		CallClass obj2 = new CallClass(5,5.5);		//Calling constructor 3
	}
}

class CallClass {
	//Constructor overloading
	//In constructor, implicit conversion works for int > double only.
	// double value can not be implicitly converted to int
	
	//Constructor 1
	public CallClass() {
		System.out.println("Constructor 1:\n Empty");
	}
	
	//Constructor 2
	public CallClass(int i) {
		System.out.println("Constructor 2:"+"\n"+i+"*"+i+" = "+(i*i));
	}
	
	//Constructor 3
	public CallClass(int i, double j) {
		System.out.println("Constructor 3:"+"\n"+i+"*"+i+" = "+(i*i));
	}
}