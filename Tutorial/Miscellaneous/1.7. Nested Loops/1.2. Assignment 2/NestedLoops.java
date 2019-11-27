/*
1
1 2
1 2 3
1 2 3 4
1 2 3 4 5
1 2 3 4 5 6
 */

public class NestedLoops {

	public static void main(String[] args)
	{
		for (int i=1;i<=6;i++)
		{
			int j=1;
			while (j<=i)
			{
				if (j==i)
				{
					System.out.print(j);	//Avoiding the blank space at the end of the row
				}
				else
				{
					System.out.print(j+" ");
				}
				j++;
			}
			System.out.println();
		}
	}
}
