package exercises.tutorial.programmingWithJava;
import java.util.Scanner;

public class ExtractDigits {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter a number: ");
		
		int number = scan.nextInt();	
		int leastSignificantDigit;
		
		while (number>0) {
			leastSignificantDigit = number % 10;	//Extract the least significant digit
			System.out.print(leastSignificantDigit+" ");	//Print the digit
			number = number/10;		//Dropping the least significant digit
		}
	}

}
