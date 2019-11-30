import java.util.Scanner;
public class Palindrome {
    public static void main(String[] args){
        Scanner palindrome = new Scanner(System.in);
        System.out.println("Please enter a number: ");
        int number = palindrome.nextInt();

        int remainder;
        int reverseNumberContainer = 0;
        int numberContainer = number; //Putting the initial value of number in a new variable

        while (number!=0){
            remainder = number % 10;
            number = number / 10;
            reverseNumberContainer = reverseNumberContainer*10+remainder;
        }
        System.out.println(reverseNumberContainer);
        if (numberContainer == reverseNumberContainer){
            System.out.printf("%d is a palindrome number.",numberContainer);
        }
        else {
            System.out.printf("%d is not a palindrome number.",numberContainer);
        }

    }
}
