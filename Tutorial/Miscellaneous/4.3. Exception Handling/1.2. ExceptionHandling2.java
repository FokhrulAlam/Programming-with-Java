package programmingwithjava.tutorial.miscellaneous;

public class ExceptionHandling2 {
    public static void main(String[] args) {
        /**
         * program starts executing from the try block.
         */
        try{
            int[] a = new int[4];
            a[4] = 10;
            int x = 5;
            int y = 0;
            int result = x/y;
            System.out.println("Output: "+ result);
        }
        /**
         * we can use multiple catch blocks.
         * the block that catches the exception will execute.
         */
        catch(ArithmeticException e1){
            System.out.println("Exception: "+e1);
        }

        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Exception: "+e);
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
