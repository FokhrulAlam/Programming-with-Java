package programmingwithjava.tutorial.miscellaneous;

public class ExceptionHandling1 {
    public static void main(String[] args) {
        /**
         * program starts executing from the try block.
         */
        try{
            int x = 5;
            int y = 0;
            int result = x/y;
            System.out.println("Output: "+ result);
        }
        /**
         * If we are unsure of the type of exception, we will use Exception class
         */
        catch(Exception e){
            System.out.println(e);
        }
        /**
         * finally block makes sure the statements inside it are executed
         * even if the catch block can not catch the exception
         */
        finally {
            System.out.println("Bye!");
        }
    }
}
