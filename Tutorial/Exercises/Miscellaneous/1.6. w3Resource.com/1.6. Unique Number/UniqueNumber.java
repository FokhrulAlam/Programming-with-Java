/**
 * Write a Java program to create and display unique three-digit number using 1, 2, 3, 4.
 * the numbers are unique and the digits in a number should be different.
 * Also count how many three-digit numbers are there.
 * Expected Output
 *
 * 123
 * 124
 * ...
 *
 * 431
 * 432
 * Total number of the three-digit-number is 24
 */
 
package programmingwithjava.tutorial.exercise.w3resource;

public class Problem {
    public static void main(String[] args){
        int totalUniqueNumber = 0;

        for (int i=1;i<=4;i++){
            for (int j=1; j<=4; j++){
                for (int k=1; k<=4; k++){
                    if (k != i && k != j && i != j){
                        System.out.println(i+""+j+""+k);
                        totalUniqueNumber++;
                    }
                }
            }
        }
        System.out.println("Total unique numbers: "+totalUniqueNumber);
    }
}
