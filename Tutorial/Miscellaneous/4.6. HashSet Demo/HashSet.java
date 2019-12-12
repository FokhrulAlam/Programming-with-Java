package programmingwithjava.tutorial.miscellaneous;

import java.util.HashSet;

/**
 * Difference between a list and a set is:
 * A list can contain duplicate elements.
 * A HashSet can not contain duplicate elements.
 */
public class HashSetDemo {
    public static void main(String[] args) {
        /**
         * create a HashSet.
         */
        HashSet <String> name = new HashSet<>();
        /**
         * add elements to the HashSet.
         */
        name.add("Md");
        name.add("Fokhrul");
        name.add("Alam");
        /**
         * print the elements of HashSet
         */
        for (String element : name){
            System.out.println(element+" ");
        }

    }
}
