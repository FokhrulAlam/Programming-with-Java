import java.util.Random;

public class Array {
    public static void main(String[] args){
       int threedimensionalarray[][][] = new int[3][3][3];
       Random value = new Random();

       for (int i=0;i<=2;i++){
           for (int j=0;j<=2;j++){
               for (int k=0;k<=2;k++){
                   threedimensionalarray[i][j][k] = value.nextInt(9);
               }
           }
       }

       for (int i[][] : threedimensionalarray){
           for (int j [] : i){
               for (int k : j){
                   System.out.print(k+" ");
               }
               System.out.println();
           }
           System.out.println();
       }
    }
}
