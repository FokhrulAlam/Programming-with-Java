package programmingwithjava.tutorial.miscellaneous;

/**
 * enum is a set of predefined constants.
 * we can create enum outside a class and inside a class as well.
 * but we can not create an enum inside a method.
 * BUT we can create variables and methods inside an enum.
 * we can create constructors inside an enum.
 * Every enum extends a class Enum.
 */

/**
 * create the enum.
 */
enum Mobile{
    APPLE(300), SAMSUNG, HTC(150);

    int price;    //variable
    // create constructors.
    Mobile(){
        price = 100;
    }
    Mobile(int price){
        this.price = price;
    }

    public int getPrice(){
        return price;
    }
}

/**
 * once we created enum, the compiler creates a class with the same name.
 * the constants of the enum are static final objects of that class.
 */
//class Mobile{
//    static final Mobile APPLE = new Mobile();
//    static final Mobile SAMSUNG = new Mobile();
//    static final Mobile HTC = new Mobile();
//
//    int age;    //variable
//    public int getAge(){
//        return age;
//    }
//}

public class EnumDemo {
//    enum Mobile{
//        APPLE, SAMSUNG, HTC;
//    }

    public static void main(String[] args) {
//        /**
//         * We will use switch.
//         */
//        Mobile m = Mobile.APPLE;  //creating an object
//        switch(m) {
//            case APPLE:
//                System.out.println(Mobile.APPLE);
//                System.out.println("Price of APPLE is "+Mobile.APPLE.price);
//                break;
//            case SAMSUNG:
//                System.out.println(Mobile.SAMSUNG);
//                System.out.println("Price of SAMSUNG is "+ Mobile.SAMSUNG.price);
//                break;
//        }
        /**
         * use of some methods.
         */
        System.out.println("Serial of SAMSUNG "+Mobile.SAMSUNG.ordinal());  //shows the serial
        /**
         * printing all the constants of an enum
         */
        Mobile [] constants = Mobile.values();
        for (Mobile s : constants){
            System.out.println(s);
        }


    }
}
