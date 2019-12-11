package programmingwithjava.tutorial.miscellaneous;

/**
 * StringBuffer allows to change the elements of the string
 * without assigning the changed string to a new string.
 * We do not need to create a new string for this purpose.
 */
public class StringBufferDemo {
    public static void main(String[] args) {
        StringBuffer name = new StringBuffer("Md Fokhrul");
        name.append(" Alam"); // append  Alam to name
        name.append(29);    //integer can be appended too
        name.reverse();     // reverses all the characters
        name.delete(10, 14); // deletes characters frome index 10 to index 14
        name.setLength(2);  // trims name and takes the first two characters.
        
    }
}
