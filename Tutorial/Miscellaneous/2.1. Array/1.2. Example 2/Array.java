import java.util.Random;

public class Array {
    public static void main(String[] args){
        int [] array = new int[10];
        Random value = new Random();

        for (int i=0;i<array.length;i++){
            array[i] = value.nextInt(50);
            System.out.print(array[i]+" ");
        }
    }
}
