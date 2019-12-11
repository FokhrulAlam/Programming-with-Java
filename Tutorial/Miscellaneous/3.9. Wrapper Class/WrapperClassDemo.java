package programmingwithjava.tutorial.miscellaneous;

/**
 * Wrapper class can convert primitive data type into object
 * and object to primitive data type
 * Autoboxing >> converting primitive data to object
 * Unboxing >> converting objects into primitive data type
 */
public class WrapperClassDemo {
    public static void main(String[] args) {
        /**
         * Autoboxing
         */
        int a = 10;
        Integer b = a;  //converting a into an object
        System.out.println(b);

        /**
         * Unboxing
         */
        Double d = 4.5;     //creating an object d
        double e = d.doubleValue();    //converting the object into primitive data
        System.out.println(e);
    }
}
