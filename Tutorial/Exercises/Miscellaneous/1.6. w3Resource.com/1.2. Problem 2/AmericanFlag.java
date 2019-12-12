/**
 * write a program to print an American flag.
 */
package programmingwithjava.tutorial.exercise.w3resource;

public class AmericanFlag {
    public static void main(String[] args){
        /**
         * row = 15,   column = 46
         * "*" will be printed in the first 9 rows.
         */
        for (int row =1; row<=15; row++){
            for (int column=1; column<=46; column++){
                /**
                 * print the stars first. We can print them in a pattern.
                 * when row is odd, a * will print first, then a blank space
                 * when row is even, a blank space will print first, then a *
                 * * will be printed until row 9. After that print = in every row
                 * there should a single space in between two stars.
                 */
                if (row<=9){
                    if (column<=11){
                        if (row %2 != 0){
                            if (column %2 != 0) {
                                System.out.print("*");
                            }else{
                                System.out.print(" ");
                            }
                        }else if (row %2 == 0){
                            if (column %2 != 0) {
                                System.out.print(" ");
                            }else{
                                System.out.print("*");
                            }
                        }
                    }
                    /**
                     * print one extra space between * and = signs until row 9.
                     * space will be printed in column 12.
                     */
                    if (column == 12){
                        System.out.print(" ");
                    }
                    /**
                     * Now, print = sign until row 9.
                     * there will be no space between the = signs.
                     */
                    if (column >=13 && column <=46){
                        System.out.print("=");
                    }
                }
                /**
                 * from row 10 to row 15, print = sign in every column.
                 */
                if (row > 9){
                    System.out.print("=");
                }
            }
            /**
             * after printing the first row, we need to go to the second row.
             */
            System.out.println();
        }
    }
}
