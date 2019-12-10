import java.util.Scanner;

public class MathOperations {
    public static void main(String[] args){
        Scanner math = new Scanner(System.in);

        System.out.println("Please enter the first number: ");
        int number1 = math.nextInt();

        System.out.println("Please enter the second number: ");
        int number2 = math.nextInt();

        System.out.println("Please enter either + or - or * or / : ");
        String operator = math.next();

        switch (operator){
            case "+":
                System.out.println(number1+operator+number2+"="+(number1+number2));
                break;
            case "-":
                System.out.println(number1+operator+number2+"="+(number1-number2));
                break;
            case "*":
                System.out.println(number1+operator+number2+"="+(number1*number2));
                break;
            case "/":
                System.out.println(number1+operator+number2+"="+(number1/number2));
                break;
        }

    }
}
