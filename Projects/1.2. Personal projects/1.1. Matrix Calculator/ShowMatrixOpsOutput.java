package programmingwithjava.tutorial.miscellaneous;

public class ShowMatrixOpsOutput {

    //results of the math operations of A and B
    void showOutput(int[][] matrix){
        for (int row=0; row<=MatrixDemo.rows-1; row++){
            for (int column=0; column<=MatrixDemo.columns-1; column++){
                System.out.print(matrix[row][column]+"\t");
            }
            System.out.print("\n\t\t\t");
        }
    }

//    void showOutput(int[][] matrix, int[][] matrix1){
//        for (int row=0; row<=MatrixDemo.rows-1; row++){
//            for (int column=0; column<=MatrixDemo.columns-1; column++){
//                System.out.printf( "\t%d",(matrix[row][column]+matrix1[row][column]) );
//            }
//            System.out.print("\n\t\t\t");
//        }
//    }

}
