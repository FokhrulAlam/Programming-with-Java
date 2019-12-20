package programmingwithjava.tutorial.miscellaneous;

public class MainClass {
    public static void main(String[] args) {
        /**
         * As StaticInnerClass is a static inner class, to create objects of it,
         * we do not need to create objects of InnerClassDemo first.
         * We can directly create objects of the static inner class.
         */

        InnerClassDemo.StaticInnerClass refugee = new InnerClassDemo.StaticInnerClass("StaticInnerClass",
                "InnerClassDemo");
        /**
         * Let's print the output.
         */
        System.out.println(refugee);
    }
}
