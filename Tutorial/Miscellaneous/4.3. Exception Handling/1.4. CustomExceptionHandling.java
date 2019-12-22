package programmingwithjava.tutorial.miscellaneous;

import java.util.Scanner;

public class CustomExceptionHandling {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.println("Please enter an integer greater than 10: ");
        try{
            /**
             * We are expecting an integer value greater than 10
             */
            int i = userInput.nextInt();
            /**
             * If the user passes an integer less than 10, throw an exception.
             */
            if (i <= 10){
                throw new ExceptionHandling("Error. Value should be greater than 10.");
            }
        }
        catch (ExceptionHandling e){
            System.out.println(e);
        }
    }
}

class ExceptionHandling extends Exception{
    public ExceptionHandling(String message){
        super(message);
    }
}
