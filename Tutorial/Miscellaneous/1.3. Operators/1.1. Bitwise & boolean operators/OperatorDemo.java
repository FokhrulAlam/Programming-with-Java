
public class OperatorDemo {

	public static void main(String[]args)
	{
		/* bitwise &	> both digits 1=1; One of them 0=0
		   bitwise |	> any digit 1=1
		  left shift <<		>append zeros on the right side
		  right shift >>	>deletes two digits from the right side
		  boolean operators		> true , false
		 */

		int a= 25;	// 1 1 0 0 1
		int b= 15;	// 0 1 1 1 1

//Bitwise & , bitwise | operators
		int c= a & b;	// 0 1 0 0 1
		int d= a | b;	//1 1 1 1 1
		System.out.println("Value of c: "+c);
		System.out.println("Value of d: "+d);

// left shift and right shift operators
		int e= a <<2;	// 1 1 0 0 1 0 0	>2 zeros added to the right side of a
		int f= a >>2;	// 1 1 0	>2 zeros removed from the right side of a
		System.out.println("Value of e: "+e);
		System.out.println("Value of f: "+f);

// boolean operators
		boolean g= true;
		boolean h = !g;
		System.out.println("Boolean value of h:"+h);

		
		
		
	}
}
