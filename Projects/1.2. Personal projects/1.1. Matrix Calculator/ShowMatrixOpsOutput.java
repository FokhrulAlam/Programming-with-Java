package programmingwithjava.tutorial.miscellaneous;

public class ShowMatrixOpsOutput {

    //results of the math operations of A and B
    void showOutput(int[][] matrix){
        for (int row=0; row<=MatrixDemo.rows-1; row++){
            for (int column=0; column<=MatrixDemo.columns-1; column++){
                System.out.print(" "+matrix[row][column]);
            }
            System.out.println();
        }
    }

}
