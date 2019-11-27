/*
This is nested loop.
We will print * in a square pattern.
 */

public class NestedLoops {

	public static void main(String[] args)
	{
		for(int i=1;i<=4;i++)
		{
			int j=1;
			while(j<=4)
			{
				if (j<=3)
				{
					System.out.print("* ");
				}
				else
				{
					System.out.print("*");
				}
				
				j++;
			}
			System.out.println();
		}
		
	}
}
