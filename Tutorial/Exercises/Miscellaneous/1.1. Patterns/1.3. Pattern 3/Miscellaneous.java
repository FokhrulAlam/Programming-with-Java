public class Miscellaneous {
    public static void main(String[] args){
      for (int row=1;row<=5;row++){
          for(int column=1;column<=row;column++){
              if ((row%2==0 && column%2!=0) | (row%2!=0 && column%2==0)) {
                  System.out.print("0" + " ");
              }
              else{
                  System.out.print("1" + " ");
              }
          }
          System.out.println();
      }
    }
}
