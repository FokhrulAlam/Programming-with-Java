import java.util.Random;

public class Array {
    public static void main(String[] args){
        int [] array1 = {3,5,3,9};
        int [] array2 = {4,0,8,1};
        int [] array3 = {9,4,2,8};

        int [][] twodarray = {
                array1,
                array2,
                array3
        };

        for (int row=0;row<=2;row++){
            for (int column=0;column<=3;column++){
                System.out.print(twodarray[row][column]+" ");
            }
            System.out.println();
        }
    }
}
