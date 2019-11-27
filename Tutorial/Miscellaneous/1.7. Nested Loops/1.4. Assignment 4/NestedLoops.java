/*
A
A B
A B C
 */

public class NestedLoops {

	public static void main(String[] args)
	{
		for (byte i=1;i<=4;i++)		//i is row
		{
			for (byte j=1;j<=4;j++)		//j is column
			{
				if (i==1 || i==4 || j==1 || j==4)
				{
					System.out.print("$"+" ");
				}
				else
				{
					System.out.print(" "+" ");
				}
			}
			System.out.println();
		}
	}
}
