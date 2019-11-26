
public class OperatorDemo {

	public static void main(String[]args)
	{
		int m=6, n=4;
		
		int r1=m+n;
		int r2=m-n;
		int r3= m*n;
		double r4= (double)m/n;
		
		int r5 = m%n;
		
		System.out.println(r1);
		System.out.println(r2);
		System.out.println(r3);
		System.out.println(r4);
		System.out.println(r5);
		
		m = ++n;   // pre increment, n will increment by 1 and this new value will be assigned to m
		System.out.println(m);
		System.out.println(n);
		
		m = n++;	  // post increment, n assigned to m first. then n increments by 1 
		System.out.println(m);
		System.out.println(n);
		
		
		
	}
}
