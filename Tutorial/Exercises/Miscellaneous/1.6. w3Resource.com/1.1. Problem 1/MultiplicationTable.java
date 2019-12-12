/**
 * Write a Java program that takes a number as input and prints its multiplication table upto 10.
 */
package programmingwithjava.tutorial.exercise.w3resource;

import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args){
        /**
         * take the number from the user
         */
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter an integer: ");
        int number = input.nextInt();
        /**
         * print the multiplication table.
         */
        System.out.print("<<<Output>>>\n");
        for (int i=1;i<=10;i++){
            System.out.println(number+" x "+i+" = "+(number*i));
        }
    }

}
