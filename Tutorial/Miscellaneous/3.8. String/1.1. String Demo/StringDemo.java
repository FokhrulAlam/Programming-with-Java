package programmingwithjava.tutorial.miscellaneous;

public class StringDemo {
    public static void main(String[] args) {
        String s1 = "Fokhrul Alam";
        String s2 = new String("Fokhrul alam");

        // print a string
        System.out.println("s2 = "+s2);

        int length = s1.length();   //length of string

        // equal() method, case-sensitive, exact match
        if (s1.equals(s2)){
            System.out.println("s1 equals to s2");
        }else{
            System.out.println("s1 is not equal to s2");
        }

        //equalsIgnoreCase() method, ignore case-sensitivity.
        if (s1.equalsIgnoreCase(s2)){
            System.out.println("Ignoring case-sitivity: s1 equals to s2");
        }else{
            System.out.println("Ignoring case-sensitivity: s1 is not equal to s2");
        }
        // contain() method, sequence of characters match
        if (s2.contains("hf")){
            System.out.println("s2 contains hf");
        }else{
            System.out.println("s2 does not contain hf");
        }

        //isEmpty() method, empty or not
        if (s1.isEmpty()){
            System.out.println("s1 is empty");
        }else{
            System.out.println("s1 is not empty");
        }

        //concat() method, concatenate separate strings
        System.out.println("Concatenating s1 and s2: "+ s1.concat(s2));

        //toUpperCase() method, make the whole string uppercase
        System.out.println("Uppercase s1: "+ s1.toUpperCase());

        //toLowerCase() method, make the whole string lowercase
        System.out.println("Lowercase s2: "+ s2.toLowerCase());

        // startsWith(), checks if a string starts with a specific character or not
        if (s1.startsWith("F")){
            System.out.println("s1 starts with F");
        }else{
            System.out.println("s1 does not start with F");
        }

        // charAt() method, finds the character at a specific index
        System.out.println("The character at index 2 in s1: "+ s1.charAt(2));

        // indexOf() method, find the first index of a specific character
        System.out.println("The first index of k in s1: "+s1.indexOf('k'));

        // lastIndexOf() method, finds the last index of a specific character
        System.out.println("The last index of k in s1: "+s1.lastIndexOf('k'));

        // codePointAt() method, finds the ASCII value of the character at a specific index.
        System.out.println("The ASCII value of "+s2.charAt(4)+" in s2: "+s2.codePointAt(4));

        s1.trim();  // removes the spaces at the beginning and end of a string.
        s1.replace('h','k');    //replace h by k in s1
        String[] s3 = s1.split(" ");    //split method returns an array of string splitting
                                              // s1 wherever it finds a space in this case
        for (String element : s3){
            System.out.print("#"+element);
        }
    }
}
