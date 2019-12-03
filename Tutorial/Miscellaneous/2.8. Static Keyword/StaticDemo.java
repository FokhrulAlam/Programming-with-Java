package miscellaneous.tutorial.programmingWithJava;

public class StaticDemo {
	public static void main(String[] args) {
		
		Example.show();		// show() in class Example is static. So, we can access show() like this.
							// We don't need to create an object
		
		int a = Example.getProduct(4);
		System.out.println("From getProduct() of class Example: "+a);
		
		int b = Example.i;		//int i in class Example is static.
		System.out.println("Value of integer 'i' in class 'Example' is "+b);
	}

}

//Creating another class.
class Example{
	static int i =5;
	
	// Making show() static so that it becomes accessible without creation of objects
	public static void show(){
		System.out.println("Hi there! Speaking from class 'Example'.");
	}
	
	public static int getProduct(int j) {
		return j*j;
	}
}
