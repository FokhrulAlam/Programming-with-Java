package programmingwithjava.tutorial.miscellaneous;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Formatter;
import java.util.Scanner;

/**
 * we will learn how to write into a file.
 */
public class WriteIntoFile {
    public static void main(String[] args) {
        /**
         * we will use 'try catch' blocks to handle exceptions.
         * I will enter the first line.
         * the user will enter the next lines of input.
         */
        try {
            String studentID;
            String studentName;

            Formatter formatter = new Formatter("C:\\Users\\fokhrul\\Desktop\\student.txt");
            formatter.format("%s %s\r\n","101","Fokhrul");      // for Windows OS, \r\n

            /**
             * ask the user how many students are there.
             */
            Scanner input = new Scanner(System.in);
            System.out.print("How many students: ");
            int number = input.nextInt();

            /**
             * run a for loop to get the names and Ids and put them into the file.
             */
            for (int i = 1; i<=number; i++){
                System.out.print("Enter ID and name: ");
                studentID = input.next();
                studentName = input.next();
                formatter.format("%s %s\r\n", studentID, studentName);
            }

            formatter.close();      // close formatter after use
        }catch(FileNotFoundException e){
            System.out.println(e);
        }


    }
}
