/**
 * Write a Java program to count the letters, spaces, numbers and other characters of an input string.
 */
package programmingwithjava.tutorial.exercise.w3resource;

public class CharCount {
    public static void main(String[] args){
        String string = "Aa kiu, I swd skieo 236587. GH kiu: sieo?? 25.33";
        // pass the string to countChar method for calculation.
        CountChar(string);
    }
    static void CountChar(String string){
        char[] chars = string.toCharArray();    //converting the string to char array
        int letter = 0;
        int space = 0;
        int number = 0;
        int other = 0;
        /**
         * check what this is.
         */
        for (int i=0; i<string.length(); i++){
            // if it is a letter
            if (Character.isLetter(chars[i])){
                letter++;
            }
            //if it is a space
            else if (Character.isSpaceChar(chars[i])){
                space++;
            }
            // if it is a number
            else if (Character.isDigit(chars[i])){
                number++;
            }
            //if it is something else
            else {
                other++;
            }
        }
        /**
         * print the output.
         */
        System.out.print("The string is : "+string+"\nletter: "+letter+"\nspace: "+space+
                "\nnumber: "+number+"\nothers: "+other);
    }
}
