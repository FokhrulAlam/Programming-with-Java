package com.gmh;

import java.awt.Color;
import javax.swing.JOptionPane;
import javax.swing.JFrame;

public class MathOperations extends JFrame{
	
	// MathOperations inherits JFrame()
	//Let's put some changes in the default constructor of MathOperations
	public MathOperations() {
		getContentPane().setBackground(Color.cyan);	//background color of new MathOperations()
		setTitle("<<Math Operations>>");				//title
		setSize(400,300);								//size of new MathOperations()
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);		//new MathOperations() will close once operation finishes
		setVisible(true);		//Making the new MathOperations() visible
	}
	
	public static void main(String[] args) {
		
		//Take the first number from the user
		double userNumber1 = Double.parseDouble(JOptionPane.showInputDialog(new MathOperations(),"Please enter the first number: "));	
		//Take the second number from the user
		double userNumber2 = Double.parseDouble(JOptionPane.showInputDialog(new MathOperations(),"Please enter the second number: "));
		
		//Take an operator from the user(+ - * /)
		String mathOperatorByUser = JOptionPane.showInputDialog(new MathOperations(),"Please choose one operator:\n+  -  *  /");
		
		//Pass the numbers and operator to execute() and assign the value to a local variable
		double result = execute(userNumber1,userNumber2,mathOperatorByUser);
		
		//Pass result to displayResult() to display the output of math operations.
		displayResult(result);
		
		// Ask the user if he wants to know the factorial of userNumber1
		String userConsent = JOptionPane.showInputDialog(new MathOperations(),"Do you want to find the factorial of "
		+(int)userNumber1+"?\n"+ "Please type Yes or No.");
		
		//If user types No, ask him again to confirm.
		if (userConsent.contentEquals("No")) {
			String userConsentConfirm = JOptionPane.showInputDialog(new MathOperations(),"Are you sure?\nPlease type:\n"
					+ "      Yes.I am.\nor \n      No.Find it.");
			
			//If user again types Yes, finish the execution of the program.
			if (userConsentConfirm.contentEquals("Yes.I am.")) {
				JOptionPane.showMessageDialog(new MathOperations(), "Ok. See you in the next session!");
				System.exit(0);
			}
			
			// If user changes his mind, find the factorial.
			else if (userConsentConfirm.contentEquals("No.Find it.")) {
				
				// If the number is less than 0, print the following message.
				if (userNumber1<0) {
					JOptionPane.showMessageDialog(new MathOperations(), "Sorry! I forgot. Factorial of a negative number is not defined.\n"
							+ "Please try again.");
					System.exit(0);
				}
				//If the number is greater than 0, find the factorial.
				else {
					JOptionPane.showMessageDialog(new MathOperations(), "Thanks. I enjoy challenges!");
					findFactorial(userNumber1);
					System.exit(0);
				}
			}
		}
		//If user types Yes in the first place:
		else if (userConsent.contentEquals("Yes")) {
			
			if (userNumber1<0) {
				JOptionPane.showMessageDialog(new MathOperations(), "Sorry! I forgot. Factorial of a negative number is not defined.\n"
						+ "Please try again.");
				System.exit(0);
			}
			//If the number is greater than 0, find the factorial.
			else {
				JOptionPane.showMessageDialog(new MathOperations(), "Thanks. I enjoy challenges!");
				findFactorial(userNumber1);
				System.exit(0);
			}
		}
		
		else {
			JOptionPane.showMessageDialog(new MathOperations(), "Please try again.","Something went wrong!",JOptionPane.ERROR_MESSAGE);
			System.exit(0);
		}
		
	}
	
		//Perform math operations in a separate method
	public static double execute(double userNumber1, double userNumber2, String mathOperatorByUser) {
		
		switch (mathOperatorByUser) {
		
		case "+":
			return userNumber1 + userNumber2;
			
		case "-":
			return userNumber1 - userNumber2;
			
		case "*":
			return userNumber1 * userNumber2;
			
		case "/":
			return userNumber1 / userNumber2;
			
		default:
			return 0;
		}
	}
	
	//Show the output
	public static void displayResult(double result) {
		
		//If result is 0,
		if (result == 0) {
			JOptionPane.showMessageDialog(new MathOperations(), "The output is 0."+"You might have typed the same number twice,\n"
					+ "and the operator is -(minus sign) or the operator you entered matched none in our dictionary.",
					"Attention! Something might have gone wrong.",JOptionPane.WARNING_MESSAGE);
		}
		//If result is not 0, print the result.
		else {
			JOptionPane.showMessageDialog(new MathOperations(),"The output is "+String.format("%.2f",result),"Hurrah! We got our result.",
					JOptionPane.INFORMATION_MESSAGE );
		}
	}
	
	//Find the factorial
	public static void findFactorial(double userNumber1){
		//Let's convert the double value to integer value to simplify it.
		//Otherwise we need to use gamma function.
		int number = (int) userNumber1;
		//Suppose, initial value of factorial is 1
		int factorial = 1;
		
		//We know factorial of 0 is 0 and factorial of 1 is 1.
		///Simply print it even the number is either 0 or 1
		if (number == 0 | number == 1) {
			JOptionPane.showMessageDialog(new MathOperations(), "The factorial of "+number+" is "+number+".");
		}
		// If the number is something else, find the factorial
		else {
			int numberCopy = number;	//Just assign number to numberCopy. See output line below.
			while( numberCopy >1 ) {
				factorial *=numberCopy;		// factorial = factorial * number
				numberCopy--;
			}
			JOptionPane.showMessageDialog(new MathOperations(), "The factorial of "+number+" is "+factorial+".",
					"There we go! Thanks. See you later.",JOptionPane.INFORMATION_MESSAGE);
		}
		
	}
}
