package miscellaneous.tutorial.programmingWithJava;

public class ThisKeyWord {
	public static void main(String[] args) {
		//create objects
		NewClass obj = new NewClass(5);
		
		NewClass obj1 = new NewClass(6);
		obj.display();
		obj1.display();
	}
}

class NewClass{
	//Define private variable i
	private int i;
	
	//Assign a value to i inside a constructor
	public NewClass(int i) {
		this.i = i;		//this keyword
	}
	
	//Print value of i
	public void display() {
		System.out.println(i);
	}
}
