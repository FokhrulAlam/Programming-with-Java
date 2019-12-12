/**
 * write a program to print a face.
 */
package programmingwithjava.tutorial.exercise.w3resource;

public class Face {
    public static void main(String[] args){
        /**
         * row = 5; column = 9
         */
        for (int row =1; row<=5; row++){
            for (int column = 1; column<=9; column++){
                /**
                 * let's go ahead with row 1 and row 5 first.
                 */
                if ((row == 1) || (row == 5)){
                    /**
                     * print space in column 1 and column 9
                     */
                    if (column == 1 || column == 9){
                        System.out.print(" ");
                    } else if (column == 2 || column == 8){
                        System.out.print("+");
                    } else{
                        System.out.print("-");
                    }

                }

                /**
                 * now go ahead with row 2 to row 4.
                 */
                if (row>=2 && row<=4){
                    if (column == 2 || column == 8){
                        System.out.print("|");
                    }else if (column == 3 || column == 7){
                        System.out.print(" ");
                    }else if (column == 1 || column == 9){
                        if (row==2 && column==1){
                            System.out.print("[");
                        }else if (row==2 && column==9){
                            System.out.print("]");
                        }else if (row==3 || row==4){
                            System.out.print(" ");
                        }
                    }else if (row == 2){
                        if (column == 4 || column == 6){
                            System.out.print("o");
                        }else if (column ==5) {
                            System.out.print(" ");
                        }
                    }else if (row ==3){
                        if (column==4 || column==6){
                            System.out.print(" ");
                        }else if (column == 5){
                            System.out.print("^");
                        }
                    }else if (row == 4){
                        if (column == 4 || column == 6){
                            System.out.print("'");
                        }else if (column == 5){
                            System.out.print("_");
                        }
                    }
                }
            }
            /**
             * go to a new line for each row.
             */
            System.out.println();
        }
    }
}
