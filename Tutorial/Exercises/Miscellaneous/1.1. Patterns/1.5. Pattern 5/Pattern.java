/*
Write a program called PrintCheckerPattern to print the following pattern:
* * * * *
 * * * * *
* * * * *
 * * * * *
* * * * *

 */

public class Pattern {
    public static void main(String ... args){
        for (int row=1;row<=5;row++){
            for (int column=1;column<=5;column++){
                if (row%2!=0){
                    System.out.print("*"+" ");
                }
                else if (row%2==0){
                    System.out.print(" "+"*");
                }
            }
            System.out.println();
        }
    }
}
