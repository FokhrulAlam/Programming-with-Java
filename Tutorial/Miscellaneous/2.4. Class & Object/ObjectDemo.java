public class ObjectDemo {
    public static void main(String[] args){
        // Please consider ClassDemo as Student and think that way.
        ClassDemo salman = new ClassDemo();     //Created a new object salman from ClassDemo

        salman.id = 4653728;
        salman.age = 20;
        salman.name = "Salman Shah";
        System.out.println(salman.name+" is "+salman.age+" years old.");

        ClassDemo jack = new ClassDemo();     //Created a new object jack from ClassDemo

        jack.id = 4653728;
        jack.age = 20;
        jack.name = "Jackie Chan";
        System.out.println(jack.name+" is "+jack.age+" years old.");

    }
}
