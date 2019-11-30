//Write a Java Program that calculates the factorial of a number. Input can be taken from user.

import java.util.Scanner;

public class HwOne2 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a positive whole number: ");
        int number = scan.nextInt();

        System.out.println("The factorial of "+number+" is:");
        if (number==0){
                System.out.print("0.");
        }
        else if (number>=1){
            long factorial=1;     //Initially, suppose product = 1.
            for (int i=number;i>=1;i--){
                factorial=factorial*i;      //product *=i
                if (i>1) {
                    System.out.print(i + "x");
                }
                else {
                    System.out.print(i);
                }
            }
            System.out.print("="+factorial+".");
        }

    }
}
