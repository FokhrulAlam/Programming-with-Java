package exercises.tutorial.programmingWithJava;
import javax.swing.JOptionPane;

public class MagicDates {
	public static void main(String[] args) {
		
		// Asking for month
		String userString = JOptionPane.showInputDialog("Please enter a month in numeric form: ");		//It is a string
		int month = Integer.parseInt(userString);	//Converting the string an integer
		
		// Asking for day
		userString = JOptionPane.showInputDialog("Please enter a day in numeric for: ");
		int day = Integer.parseInt(userString);
		
		//Asking for year
		userString = JOptionPane.showInputDialog("Please enter the year in 2 digits: ");
		int year = Integer.parseInt(userString);
		
		// Display output
		if (month*day==year) {
			System.out.println(month+"/"+day+"/"+year+" is a magic year");
		}
		else {
			JOptionPane.showMessageDialog(null, month+"/"+day+"/"+year+" is not a magic year");
		}
		
		System.exit(0);
	}

}
