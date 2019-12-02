import java.util.Scanner;

public class StringManipulator {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter the name of the city: ");
		String city = scanner.nextLine();
		
		//Total number of characters.
		System.out.println("The number of characters in "+city+" is "+city.length());
		
		//City name in uppercase letters
		System.out.println(city+" in uppercase letters is "+city.toUpperCase());
		
		//city name in lower case letters
		System.out.println(city+" in lowercase letters is "+city.toLowerCase());
		
		//First character in the name of the city	
		System.out.println("The first character in "+city+ " is "+city.charAt(0));
	}

}
