package programmingwithjava.tutorial.miscellaneous;

import java.util.HashMap;

/**
 * HashMap is a key value pair. using the key, we can get the value.
 */
public class HashMapDemo {
    public static void main(String[] args) {
        /**
         * create the HashMap
         */
        HashMap <Integer, String> student = new HashMap <>();
        /**
         * put key-value pair into the HashMap
         */
        student.put(101, "Fokhrul");
        student.put(102, "Alam");
        student.put(103, "Mrinal");
        /**
         * get the student's name using their individual ID
         */
        for (int i=101;i<=103;i++){
            System.out.println(student.get(i));     //using get() method
        }
    }
}
