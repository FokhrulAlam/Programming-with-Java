package programmingwithjava.tutorial.miscellaneous;

public class MathClassDemo {
    public static void main(String[] args){
        int x = 50;
        int y = -20;

        /* The following methods are static.
        So we don't need to create objects.
         */
        int minimum = Math.min(x,y);    //Minimum value
        int maximum = Math.max(x,y);    //Maximum value
        int absoluteValue = Math.abs(y);    //Absolute value
        double power = Math.pow(x, y);  // Result always double; x=base, y=power
        int round = Math.round(8.8f);   //rounded to the nearest integer

        System.out.println("The minimum of x and y is "+minimum);
        System.out.println("The maximum of x and y is "+maximum);
        System.out.println("Absolute value of y is "+absoluteValue);
        System.out.println("x to the power y = "+power);
        System.out.println("8.8 rounded to the nearest integer is "+round);

    }
}
