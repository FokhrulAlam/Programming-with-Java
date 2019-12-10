package programmingwithjava.tutorial.miscellaneous;

public class MatrixOperation {
    //Take rows, columns, matrices from Practice class
    //Addition of A and B
    void addMatrix(int rows, int columns, int[][]A, int[][]B){
        for (int row=0; row<rows; row++){
            for (int column=0; column<columns; column++){
                MatrixDemo.sumAB[row][column] = A[row][column] + B[row][column];
            }
        }

    }
    //Subtracting B from A
    void subtractMatrix(int rows, int columns, int[][]A, int[][]B){
        for (int row=0; row<rows; row++){
            for (int column=0; column<columns; column++){
                MatrixDemo.differenceAB[row][column] = A[row][column] - B[row][column];
            }
        }

    }
//    //Multiply A & B
//    void multiplyMatrix(int rows, int columns, int[][]A, int[][]B){
//        for (int row=0; row<=rows; row++){
//            for (int column=0; column<=columns; column++){
//                MatrixDemo.productAB[row][column] = A[row][column] - B[row][column];
//            }
//        }
//
//    }
    //Division of A by B
    void divideMatrix(int rows, int columns, int[][]A, int[][]B){
        for (int row=0; row<rows; row++){
            for (int column=0; column<columns; column++){
                MatrixDemo.quotientAB[row][column] = A[row][column] / B[row][column];
            }
        }

    }
}
