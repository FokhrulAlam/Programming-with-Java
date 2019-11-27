import java.util.Scanner;   //importing the class Scanner

public class UserInput {
    public static void main(String[] args){
        Scanner scan = new Scanner (System.in);     //in method used for input. out method for output
        System.out.println("Enter an integer: ");
        int user_input_int = scan.nextInt();    //nextInt() expects an integer

        Scanner scan1 = new Scanner(System.in);
        System.out.println("Enter a decimal value:");
        double user_input_double = scan1.nextDouble();     // nextDouble() expects a double number

        Scanner scan2 = new Scanner(System.in);
        System.out.println("Enter a string of characters:");
        String user_input_string = scan2.nextLine();

        System.out.println("The integer value is "+user_input_int);
        System.out.println("The decimal value is "+user_input_double);
        System.out.println("The string is "+user_input_string);
    }
}
