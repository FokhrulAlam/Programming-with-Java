public class Miscellaneous {
    public static void main(String[] args){
      for (int row=1;row<=4;row++){
          for(int column=0;column<=3;column++){
              if (row+column>4) {
                  System.out.print(((row+column)-4) + " ");
              }
              else{
                  System.out.print((row+column)+" ");
              }
          }
          System.out.println();
      }
    }
}
