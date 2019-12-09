package programmingwithjava.tutorial.miscellaneous;


import javax.swing.*;
import java.util.Scanner;

public class Practice {
    public static void main(String[] args){

        //user will enter the values
        Scanner array = new Scanner(System.in);
        System.out.print("Length: ");
        int length = array.nextInt();   //length of array

        int[] number = new int[length]; //initializing the array
        int sum = 0;    //initial value of sum

        int max = 0;    //maximum value of the array
        int min = 0;    //minimum value of the array

        // Enter values into the array
        System.out.println("Enter numbers: ");
        for (int i=0; i<=length-1; i++){
            number[i] = array.nextInt();
            sum = sum + number[i];
        }
        //Print the array
        for (int i=0; i<=length-1; i++){
            System.out.print(number[i]+" ");
        }
        //find max and min
        for (int arrayValue : number){
                max = max>arrayValue ? max : arrayValue;  //max value; ternary operator
                min = arrayValue>min ? min : arrayValue;  //min value
        }

        //Print sum, average, max value, min value
        System.out.println("\nSum = " + sum);
        System.out.println("Average = "+(((double)sum/number.length)));
        System.out.println("Maximum value = "+max);
        System.out.println("Minimum value = "+min);
    }
}
