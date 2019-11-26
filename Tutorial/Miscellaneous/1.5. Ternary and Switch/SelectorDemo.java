
public class SelectorDemo {
// ternary operator
// condition?expr1:expr2
	public static void main(String[] args)
	{
		int a=2;
		int b=0;
		
//		if (a>4)
//			b=1;
//		else
//			b=2;
		
		b=a>4?1:2;	//if a>b is true, 1 is assigned to c
		
		System.out.println(b);
	}

}
