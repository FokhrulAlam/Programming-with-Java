package miscellaneous.tutorial.programmingWithJava;

public class MethodOverloading {
	public static void main(String[] args) {
		Overloading reference = new Overloading();
		reference.show("Hi!");
	}

}

//Method overloading
class Overloading{
	public void show(String a) {
		System.out.println("Main method passed string: "+a);
	}
	
	public void show(int a) {
		System.out.println("Main method passed integer: "+a);
		
	}
}
