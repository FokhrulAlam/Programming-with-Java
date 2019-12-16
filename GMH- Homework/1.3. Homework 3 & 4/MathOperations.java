package homework.gmh;

import java.util.Scanner;

public class MathOperations {
    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);

        /**
         * Take two double numbers from the user.
         */
        System.out.print("Please enter two numbers: ");
        double leftVal = userInput.nextDouble();
        double rightVal = userInput.nextDouble();

        /**
         * Ask the user to enter an arithmetic operator for desired calculation.
         */
        System.out.println("Please enter any of these arithmetic operator: +  -  *  /");
        String arithmeticOp = userInput.next();

        /**
         * Pass, as arguments, leftVal and rightVal to different classes extending class CalculatorBase
         * depending on the arithmetic operator.
         * We are using switch statements.
         */
        CalculatorBase obj;     //declaring a reference of CalculatorBase class.
        double result;      //declaring an instance variable to hold the output.

        switch (arithmeticOp){
            case "+":
                obj = new Adder(leftVal, rightVal);
                result = obj.calculateE();
                break;
            case "-":
                obj = new Subtractor(leftVal, rightVal);
                result = obj.calculateE();
                break;
            case "*":
                obj = new Multiplier(leftVal, rightVal);
                result = obj.calculateE();
                break;
            case "/":
                obj = new Divider(leftVal, rightVal);
                result = obj.calculateE();
                break;
            default:
                result = 0;
                break;
        }

        /**
         * print the output
         */
        System.out.printf("%.2f %s %.2f = %.2f", leftVal, arithmeticOp, rightVal, result);
    }
}

/**
 * Create an abstract class with an abstract method.
 * Derived classes will implement that method in their own way.
 */
abstract class CalculatorBase{
    double leftVal;
    double rightVal;
    double result;

    abstract double calculateE();
}

/**
 * let's create the derived classes for addition, subtraction, multiplication, and division.
 */
class Adder extends CalculatorBase{
    /**
     * Add a parameterized constructor to initialize variables.
     * @param leftVal  initializes the leftVal of current class
     * @param rightVal  initializes the rightVal of current class
     */
    Adder(double leftVal, double rightVal){
        this.leftVal = leftVal;
        this.rightVal = rightVal;
    }

    double calculateE(){
        result = leftVal + rightVal;
        return result;
    }
}

class Subtractor extends CalculatorBase{
    /**
     * Add a parameterized constructor to initialize variables.
     * @param leftVal  initializes the leftVal of current class
     * @param rightVal  initializes the rightVal of current class
     */
    Subtractor(double leftVal, double rightVal){
        this.leftVal = leftVal;
        this.rightVal = rightVal;
    }

    double calculateE(){
        result = leftVal - rightVal;
        return result;
    }
}

class Multiplier extends CalculatorBase{
    /**
     * Add a parameterized constructor to initialize variables.
     * @param leftVal  initializes the leftVal of current class
     * @param rightVal  initializes the rightVal of current class
     */
    Multiplier(double leftVal, double rightVal){
        this.leftVal = leftVal;
        this.rightVal = rightVal;
    }
    double calculateE(){
        result = leftVal * rightVal;
        return result;
    }
}

class Divider extends CalculatorBase{
    /**
     * Add a parameterized constructor to initialize variables.
     * @param leftVal  initializes the leftVal of current class
     * @param rightVal  initializes the rightVal of current class
     */
    Divider(double leftVal, double rightVal){
        this.leftVal = leftVal;
        this.rightVal = rightVal;
    }
    double calculateE(){
        result = leftVal / rightVal;
        return result;
    }
}
