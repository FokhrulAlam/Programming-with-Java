package myexercise;

import java.util.*;

public class HashMapAdvanced{
    public static void main(String[] args){
        Map<String, String> obj = new HashMap<>();

        obj.put("Fokhrul","EEE");
        obj.put("Rahima", "BBA");
        obj.put("Fokhrul","Computer");

        /**
         * Using the keySet() method to put the keys into a Set.
         */
//        Set<String> key = obj.keySet();
//
//        for (String s : key){
//            System.out.print("Key: "+s+" , Value: "+obj.get(s)+" ");
//        }
        /**
         * using the entrySet() method to put the entry(key value pair) into a Set.
         * Entry<> is a nested interface of Map interface.
         */
        Set<Map.Entry<String, String>> entry = obj.entrySet();
        for (Map.Entry<String, String> s : entry){
            System.out.println(s.getKey()+" : "+s.getValue());
        }

    }
}
