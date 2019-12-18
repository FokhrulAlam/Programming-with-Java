/**
 * We will see how to print only the duplicate elements of an ArrayList.
 */

package myexercise;

import java.util.*;

public class PrintDuplicates{
    public static void main(String[] args){
        /**
         * create an Arraylist
         */
        List<Integer> number = new ArrayList<>();
        /**
         * Add some numbers to the ArrayList.
         */
        number.add(10);
        number.add(5);
        number.add(3);
        number.add(10);
        number.add(9);
        number.add(3);

        /**
         * Create a HashSet.
         * A Set only allows unique elements.
         * If we add duplicate elements to a Set, it will give a boolean type value "false".
         * That's what we will utilize. From the above set, we will try to add each element to the HashSet.
         * If the boolean output is "false", the the is duplicate and we will print it.
         */
        Set<Integer> value = new HashSet<>();

        for (Integer n : number){
            /**
             * let's try to add the values to the HashSet and see if the output is false.
             */
            if (value.add(n) == false){
                System.out.println(n);
            }
        }

    }
}
