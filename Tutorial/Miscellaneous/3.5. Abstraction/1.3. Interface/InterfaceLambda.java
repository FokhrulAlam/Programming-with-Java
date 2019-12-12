package programmingwithjava.tutorial.miscellaneous;


public class interfaceLambda{
    public static void main(String[] args) {
        /**
         * create an object of class B.
         * call method show() passing A.i as an argument.
         * A.i means the i variable of interface A. i is static.
         */
        B obj = new B();
        obj.show(A.i);      //variable i of interface A. i is static.

        /**
         * implement interface A creating an anonymous class.
         */
        A anonymousClass = new A(){
            public void show (int k){
                System.out.println("\nHi, from the anonymous class created from interface A.\nYou entered "+k);
            }
        };
        anonymousClass.show(5);

        /**
         * the above anonymous class could be created implementing interface A using lambda expression.
         */
        A lambda = (int h) -> System.out.println("\nFrom lambda expression.   "+h);   //implementing interface A
        lambda.show(5);     //calling method show() of interface A

    }
}

/**
 * create an interface. Declare a variable and a method.
 * The variable inside an interface is always public static final.
 * The methods inside an interface is by default public.
 */
interface A{
    int i = 10;     //public static final
    void show(int j);
}

/**
 * create a class that will implement A.
 * Class B inherits the variable i of interface A.
 */
class B implements A{
    public void show(int j){
        System.out.println("Hi from class B implementing interface A.\nYou got 10 out of "+j);
    }
}
