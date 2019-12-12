package programmingwithjava.tutorial.miscellaneous;

import java.util.LinkedList;

public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList<String> name = new LinkedList<>();

        name.add("Fokhrul");
        name.add(1,"Mrinal");   //index=3; element=Mrinal
        name.addFirst("Md");    //add to the beginning of name
        name.addLast("Mrinal"); //add to the end of name
        name.removeFirst();     //remove the first element
        name.remove(0);     //remove the element at index 0
        name.get(0);    //returns the element at index 0
        name.clear();   //removes all elements 

        name.size();    //size of the LinkedList

        for(String element: name){
            System.out.print(element+" ");
        }
    }

}
