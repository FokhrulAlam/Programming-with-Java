package programmingwithjava.tutorial.exercise;

public class MatrixOps {
    public static void main(String[] args){
        int [][] matrix = new int [3][3];   //Initialize array
        int value = 1;  //Initial value to be put into the matrix
        int sumDiagonal = 0;    //Sum of diagonal elements
        int upperTriangle = 0;  //Sum of upper triangle elements
        int lowerTriangle = 0;  //Sum of lower triangle elements

        //Put values into matrix
        for (int row = 0; row<3; row++){
            for (int column =0; column<3; column++){
                matrix[row][column] = value;
                sumDiagonal = (row == column) ? (sumDiagonal+matrix[row][column]) : sumDiagonal;    //ternary operator
                upperTriangle = ( row<column ) ? (upperTriangle + matrix[row][column]) : upperTriangle;
                lowerTriangle = ( row>column ) ? (lowerTriangle + matrix[row][column]) : lowerTriangle;
                System.out.print(matrix[row][column]+"\t");
                value++;
            }
            System.out.println();
        }

//        //Print matrix
//        for (int row = 0; row<3; row++){
//            for (int column =0; column<3; column++){
//                System.out.print(matrix[row][column]+"\t");
//            }
//            System.out.println();
//        }
//
//        //Calculate the sum of diagonal, upper and lower triangle elements
//        for (int row = 0; row<3; row++){
//            for (int column =0; column<3; column++){
//                sumDiagonal = (row == column) ? (sumDiagonal+matrix[row][column]) : sumDiagonal;    //ternary operator
//                upperTriangle = ( row<column ) ? (upperTriangle + matrix[row][column]) : upperTriangle;
//                lowerTriangle = ( row>column ) ? (lowerTriangle + matrix[row][column]) : lowerTriangle;
//            }
//            System.out.println();
//        }

        //print values of sumDiagonal, supperTriangle, and lowerTriangle
        System.out.print("\nSum of the diagonal elements: "+ sumDiagonal);
        System.out.print("\nSum of the upper triangle elements: "+ upperTriangle);
        System.out.print("\nSum of the lower triangle elements: "+ lowerTriangle);

    }
}
