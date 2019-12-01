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

        for (int[] i : twodarray){
            for (int j : i) {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
