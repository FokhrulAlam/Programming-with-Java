package myexercise;

import java.util.*;

public class ComparatorDemo{
    public static void main(String[] args){
        
        //create the list first and add elements to it.
        List<Integer> obj = new LinkedList<Integer>();
        obj.add(964);
        obj.add(885);
        obj.add(912);
        System.out.println("Size: "+obj.size());

        //Now we will sort the  elements in different fashions.
        
        /**
         * Anonymous class
         * Comparator Interface has a method called "compare".
         */
//        Comparator<Integer> comp = new Comparator<Integer>(){
//            @Override
//            public int compare(Integer o1, Integer o2) {
//                /**
                  * if o1 is greater than o2, return 1; that means swap the numbers.
                  * if o1 is less than o2, return -1; that means don't swap the number.
                  */
//                return (o1>o2)?1:(o1<o2)?-1:0;
//
//            }
//        };

        /**
         * Anonymous object of Comparator Interface
         */
//        Collections.sort(obj, new Comparator<Integer>() {
//            @Override
//            public int compare(Integer o1, Integer o2) {
//                return (o1>o2)?1:(o1<o2)?-1:0;    //ternary operator
//            }
//        });

        /**
         * lambda expression.
         * The anonymous object of Comparator Interface has been expressed in lambda form
         */
        Collections.sort(obj, (o1, o2) ->
        {
            return (o1%10 > o2%10) ?1: (o1%10 < o2%10) ?-1: 0;
        });


        for (Object o : obj){
            System.out.print(o+" ");
        }
    }
}
