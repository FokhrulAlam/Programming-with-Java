package programmingwithjava.tutorial.miscellaneous;

import java.io.File;

/**
 * we will create files and directories.
 */
public class CreateFileDirectory {
    public static void main(String[] args) {
        /**
         * First, create an object of File class.
         * create a new directory in our project directory.
         */
//        File directory = new File("folder1");
//        directory.mkdir();

        /**
         * create a folder in a specified location.
         * I will create it on Desktop directory of my laptop.
         * C:\Users\fokhrul\Desktop is the path to Desktop directory.
         */
        File directory = new File("C:\\Users\\fokhrul\\Desktop\\folder1");
//        directory.mkdir();
        String dirLocation = directory.getAbsolutePath();   // gives the path of our directory.
        System.out.println(dirLocation);

        /**
         * some other methods....
         */
        directory.getName(); //gives the name of the directory.
        directory.delete();  // deletes the directory.

        /**
         * check whether the directory is deleted or not.
         */
        if (directory.delete()){
            System.out.println(directory.getName()+" has been deleted.");
        }

        /**
         * create files.
         * We will use Exception Handling Mechanism.
         */
        File file1 = new File("C:/Users/fokhrul/Desktop/student.txt");
        File file2 = new File("C:/Users/fokhrul/Desktop/teacher.txt");
        try{
            file1.createNewFile();
            file2.createNewFile();
            System.out.println("Files have been created.");
        }catch(Exception e){
            System.out.println(e);
        }

        /**
         * a few more methods.
         */
        file2.delete();     // delete the file.
        if(file1.exists()){
            System.out.println("file1 exists.");
        }
        if(file2.exists()){
            System.out.println("file2 exists.");
        }else{
            System.out.println("file2 does not exist.");
        }


    }
}
