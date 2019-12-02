import java.util.Scanner;

public class WordGame {
	public static void main(String[] args) {
		Scanner userInfo = new Scanner(System.in);
		
		System.out.println("Your name: ");
		String name = userInfo.nextLine();
		
		System.out.println("Your age: ");
		int age = userInfo.nextInt();
		
		//overcoming linebreak
		userInfo.nextLine();
		
		System.out.println("Your city: ");
		String city = userInfo.nextLine();
		
		System.out.println("Your college: ");
		String college = userInfo.nextLine();
		
		System.out.println("Your profession: ");
		String profession = userInfo.nextLine();
		
		System.out.println("Animal you pet: ");
		String animal = userInfo.nextLine();
		
		System.out.println("Name of the pet: ");
		String petName = userInfo.nextLine();
		
		//Display story-
		System.out.println("There once was a person named "+name+" who lived in "+city+".At the age of "+age+", "+name+" went to college "+"\n"+
				"at "+college+". "+name+" graduated and went to work as a "+profession+". Then, "+name+" adopted a(n) "+"\n"
				+animal+" named "+petName+". They both lived happily ever after!");
	}

}
