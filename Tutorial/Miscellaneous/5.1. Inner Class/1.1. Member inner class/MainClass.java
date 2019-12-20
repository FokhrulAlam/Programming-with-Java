package programmingwithjava.tutorial.miscellaneous;

public class MainClass {
    public static void main(String[] args) {
        /**
         * As RefugeeClass is a member inner class, to create objects of it,
         * we need to create objects of InnerClassDemo first.
         */
        InnerClassDemo innerClass = new InnerClassDemo();
        /**
         * Now, utilizing the reference variable "innerClass", let's create the object of RefugeeClass
         */
        InnerClassDemo.RefugeeClass refugee = innerClass.new RefugeeClass("RefugeeClass",
                "InnerClassDemo");
        /**
         * Let's print the output.
         */
        System.out.println(refugee);
    }
}
