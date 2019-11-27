public class Array {
    public static void main(String[] args){
        int[] array1 = {4,3,9,0,5};
        System.out.println(array1[4]);
        System.out.println("After running while loop:");

        int index=0;
        while (index<=4){
            System.out.println(array1[index]);
            index+=1;
        }
    }
}
