
public class WhileForDemo {

	// while, do while, for, for-each
	
	public static void main(String[] args)
	{
		int i=1;
		
		System.out.println("From while loop:");
		while(i<=4)
		{
			System.out.println("Hello");
			i++;
		}
		
		System.out.println("From do while loop:");
		do
		{
			System.out.println("Hello");
			i++;
		}while(i<=4);
		
		System.out.println("From for loop:");
		for(int j=1;j<=3;j++)
		{
			System.out.println("Hello");
		}
	}
	
}
