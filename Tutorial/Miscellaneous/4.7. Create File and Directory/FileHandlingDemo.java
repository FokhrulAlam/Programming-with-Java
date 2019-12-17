package programmingwithjava.tutorial.miscellaneous;

import java.io.*;

public class FileHandlingDemo {
    public static void main(String[] args) throws Exception

    {
        /**
         * let's create an object from class File
         */
        File f = new File("demo.txt");
        /**
         * write to a file
         */
        FileOutputStream  fos = new FileOutputStream(f);
        DataOutputStream  dos = new DataOutputStream(fos);
        dos.writeUTF("Demo Content");

        /**
         * read from a file
         */
        FileInputStream fis = new FileInputStream(f);
        DataInputStream dis = new DataInputStream(fis);
        String str = dis.readUTF();
        /**
         * print what you read from the file.
         */
        System.out.println(str);
    }

}
