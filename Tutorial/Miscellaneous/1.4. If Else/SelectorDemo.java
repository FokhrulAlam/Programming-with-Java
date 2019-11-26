
public class SelectorDemo {
	
	public static void main(String[] args)
	{
		int n=4;
		
		if(n==0)
		{
			System.out.println("It's neither even nor odd");
			System.out.println("Bye!");
		}
		else if(n%2==0)
		{
			System.out.println("Even");
		}
		else if (n%2!=0)
		{
			System.out.println("Odd");
		}
		else
		{
			System.out.println("None of the above.");
		}
	}

}
