package programmingwithjava.tutorial.miscellaneous;

import java.util.Scanner;

public class MatrixDemo {
        static int rows;   //Number of rows in the matrix
        static int columns;    //Number of columns in the matrix

        static int[][] sumAB;  //Adding A and B
        static int[][] differenceAB;   //Subtracting B from A
        static int[][] productAB;      //Multiplying A and B
        static int[][] quotientAB;     //Dividing A by B

        public static void main(String[] args){
            Scanner number = new Scanner(System.in);
            //Enter number of rows of the matrix
            System.out.println("Number of rows: ");
            rows = number.nextInt();

            //Enter number of columns of the matrix
            System.out.println("Number of columns: ");
            columns = number.nextInt();

            //Initializing two matrices A & B
            int [][] A = new int[rows][columns];    //matrix A
            int [][] B = new int[rows][columns];    //matrix B

            //Initializing matrices for output operations
            sumAB = new int[rows][columns];     //Initializing sumAB
            differenceAB = new int[rows][columns];  //Initializing differenceAB
            productAB = new int[rows][columns];     //Initializing productAB
            quotientAB = new int[rows][columns];    //Initializing quotientAB

            //Enter values into matrix A
            System.out.println("Enter the values of matrix A: ");
            for (int row=0;row<=rows-1;row++){
                for (int column=0;column<=columns-1;column++){
                    A[row][column] = number.nextInt();
                }
            }

            //Enter values into matrix B
            System.out.println("Enter the values of matrix B: ");
            for (int row=0;row<=rows-1;row++){
                for (int column=0;column<=columns-1;column++){
                    B[row][column] = number.nextInt();
                }
            }

            //print matrix A
            System.out.println("Matrix A is below: ");
            for (int row=0;row<=rows-1;row++){
                for (int column=0;column<=columns-1;column++){
                    System.out.print(A[row][column]+" ");
                }
                System.out.println();
            }

            //print matrix B
            System.out.println("Matrix B is below: ");
            for (int row=0;row<=rows-1;row++){
                for (int column=0;column<=columns-1;column++){
                    System.out.print(A[row][column]+" ");
                }
                System.out.println();
            }

            //Call operations methods in class MatrixOperation
            MatrixOperation operation = new MatrixOperation();

            //Pass matrices A and B into method
            operation.addMatrix(rows, columns, A, B);
            operation.subtractMatrix(rows, columns, A, B);
//            operation.multiplyMatrix(rows, columns, A, B);
            operation.divideMatrix(rows, columns, A, B);

            //call showOuput() method of MatrixDemo class
            showOutput();

        }
        private static void showOutput(){
            System.out.println();
            //Call methods ShowMatrixOpsOutput class to show the output
            ShowMatrixOpsOutput output = new ShowMatrixOpsOutput();
            //Pass individual matrix to the method and print result
            System.out.println("\t\t//A + B\\\\");
            output.showOutput(sumAB);

            System.out.println("\t\t//A - B\\\\");
            output.showOutput(differenceAB);

//            System.out.println("\t\t//A x B\\\\");
//            output.showOutput(productAB);

            System.out.println("\t\t//A / B\\\\");
            output.showOutput(quotientAB);
        }

}
