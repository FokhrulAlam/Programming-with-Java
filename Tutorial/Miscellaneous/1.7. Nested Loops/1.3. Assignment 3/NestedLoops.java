/*
A
A B
A B C
 */

public class NestedLoops {

	public static void main(String[] args)
	{
		for (char i=65;i<=67;i++)	// Note: A=65, B=66, C=67;  ASCII value
		{
			for (char j=65;j<=67;j++)
			{
				if (j<=i)
				{
					if (j==i)
					{
					System.out.println(j);
					}
					else
					{
						System.out.print(j+" ");
					}
				}
				
			}
		}
	}
}
