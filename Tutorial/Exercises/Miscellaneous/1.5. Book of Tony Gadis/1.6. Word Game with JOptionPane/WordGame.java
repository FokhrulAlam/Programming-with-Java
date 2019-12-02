// We will use JOptionPane method for this example
import javax.swing.JOptionPane;

public class WordGame {
	public static void main(String[] args) {
		//JOptionPane considers everything as string.
		//To use JOptionPane, we don't need create an object.
		//showInputDialog will show a dialog box.
		
		String name = JOptionPane.showInputDialog("Your name: ");	//user input will be assigned to variable name
		String age = JOptionPane.showInputDialog("Your age: ");
		String city = JOptionPane.showInputDialog("Your city: ");
		String college = JOptionPane.showInputDialog("Your college: ");
		String profession = JOptionPane.showInputDialog("Your profession: ");
		String animal = JOptionPane.showInputDialog("Your animal: ");
		String petName = JOptionPane.showInputDialog("Name of the pet: ");
		
		// Display story
		String OutputString = "There once was a person named "+name+" who lived in "+city+".At the age of "+age+", "+name+" went to college "+"\n"+
				"at "+college+". "+name+" graduated and went to work as a(n) "+profession+". Then, "+name+" adopted a(n) "+"\n"
				+animal+" named "+petName+". They both lived happily ever after!";
		
		JOptionPane.showMessageDialog(null, OutputString);
		System.exit(0);
	}

}
