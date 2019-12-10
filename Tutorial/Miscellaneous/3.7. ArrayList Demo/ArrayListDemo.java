package programmingwithjava.tutorial.miscellaneous;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ArrayListDemo {
    public static void main(String[] args){
        //size of an ArrayList can be changed
        ArrayList<Integer> number = new ArrayList<>(5); //Initializing an ArrayList

        //add values to number
        number.add(4);  // index 0
        number.add(6);  //index 1
        number.add(1);  // index 2
        number.add(8);  // index 3
        number.add(4, 5);   //index=4; element=5

        System.out.print(number);     //printing number

        //print arraylist using for each loop
        System.out.println("\nUsing for each loop: ");
        for (int element : number){
            System.out.print(" "+element);
        }

        //print arraylist using Iterator
        System.out.println("\nUsing Iterator: ");
        Iterator i = number.iterator();
        while(i.hasNext()){
            System.out.print(" "+i.next());
        }

        //sort ArrayList in ascending order
        Collections.sort(number);   //using sort method of Collections class
        System.out.println("\nIn ascending order: "+number);
        Collections.sort(number, Collections.reverseOrder());   //arranging in descending order
        System.out.println("In descending order: "+number);

        //remove values from the ArrayList
        number.remove(4);   //removing the last element
        System.out.println("After removing the last element: ");
        System.out.println(number);

        //remove all the values from ArrayList
        number.removeAll(number);   //removing all elements
                // number.clear();
        System.out.println("After removing all the elements: ");
        System.out.println(number);

        //check if the ArrayList is empty or not
        boolean empty = number.isEmpty();   //if number is empty, result will be true
        System.out.print("The ArrayList is empty: "+empty);

//        number.contains(5);     // checks whether 5 is in the array
//        number.indexOf(8);      //returns the index of element 8
//        number.set(3, 23);      //replaces value at index 3 by 23
//        number.get(2);    // returns the value at index 2



    }
}
