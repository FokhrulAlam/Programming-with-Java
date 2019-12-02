import java.util.Scanner;

public class CircuitBoardProfit {
	public static void main(String[] args) {
		Scanner price = new Scanner(System.in);
		System.out.println("Please enter the retail price: ");
		
		double retailPrice = price.nextDouble();
		double profit = retailPrice*0.4;
		
		System.out.println("The profit on the product is "+profit);
	
	}
}
