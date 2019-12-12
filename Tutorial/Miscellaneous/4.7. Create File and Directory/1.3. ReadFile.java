package programmingwithjava.tutorial.miscellaneous;

import java.io.File;
import java.util.Scanner;

/**
 * we will learn how to write into a file.
 */
public class ReadFile {
    public static void main(String[] args) {
        /**
         * we will utilize Scanner class to read from a file.
         * Just think that a user is reading the file and giving you input.
         */
        try {
            File file = new File("C:\\Users\\fokhrul\\Desktop\\student.txt");
            Scanner readFile = new Scanner(file);
            /**
             * run a while as long as the file contains the next line.
             * In the file, in each line, we have two words.
             */
            while(readFile.hasNext()){
//                String iD = readFile.next();
//                String name = readFile.next();
//                System.out.println(iD+" "+name);
                System.out.println(readFile.nextLine());
            }
            System.out.println("The file has been read.");
            readFile.close();   // close the file after reading it.

        }catch(Exception e){
            System.out.println(e);
        }
    }
}
