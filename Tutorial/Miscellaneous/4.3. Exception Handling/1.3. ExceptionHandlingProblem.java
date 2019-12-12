/**
 * Write a program that safely divide one integer by another.
 * User Exception handling mechanism.
 */
package programmingwithjava.tutorial.miscellaneous;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionHandlingProblem {
    public static void main(String[] args) {
        /**
         * we will use do-while loop to ask the user for correct input
         * until inputs are exactly what are asked for.
         */
        int count = 1;
        do {
            try{
                Scanner number = new Scanner(System.in);
                /**
                 * Enter first number:
                 */
                System.out.print("Please enter num1: ");
                int num1 = number.nextInt();

                /**
                 * Enter second number.
                 */
                System.out.print("Please enter num2: ");
                int num2 = number.nextInt();

                /**
                 * Calculate and print the quotient.
                 */
                int result = num1/num2;
                System.out.printf("\nResult:%d/%d = %d", num1, num2, result);

                /**
                 * when there will be no exceptions, output will printed.
                 * Then value of count will increase to 2. loop will check the condition.
                 * As count will not be equal to 1, loop will stop and we are done.
                 */
                count =2;
            }

            /**
             * catch block for InputMismatchException
             */
            catch(InputMismatchException inputMismatch){
                System.out.println("\nException: "+inputMismatch);
                System.out.println("You must enter integer. Please try again.");
            }

            /**
             * catch block for ArithmeticException
             */
            catch(ArithmeticException arithmeticExcep){
                System.out.println("\nException: "+arithmeticExcep);
                System.out.println("You must enter integer. Please try again.");
            }
        }while( count == 1);

    }
}
