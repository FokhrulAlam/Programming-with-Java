package programmingwithjava.tutorial.miscellaneous;

public class MainClass {
    public static void main(String[] args) {
        /**
         * Anonymous class for MobileConfig interface.
         * Instead of creating two separate classes implementing the interface,
         * we are creating anonymous class and implementing the method.
         * For samsung phone----
         */
//       MobileConfig samsung = new MobileConfig() {
//           @Override
//           public void showConfig() {
//               System.out.println("The configuration of Samsung is ......");
//           }
//       };   // semi-colon
//
//        /**
//         * For Iphone.....
//         */
//        MobileConfig iPhone = new MobileConfig() {
//            @Override
//            public void showConfig() {
//                System.out.println("The configuration of IPhone is ......");
//            }
//        };

        /**
         * The above example can be shortened in terms of codes and memory.
         * We can use lambda expression.
         * Use the parenthesis, then an arrow sign, then implement the method.
         */
//        MobileConfig samsung = () -> {
//            System.out.println("The configuration of Samsung is ......");
//        };

        /**
         * As the method to be implemented has a single statement, we don't even need {} bracket.
         * The following lambda expression will work too.
         */
        MobileConfig samsung  = () -> System.out.println("The configuration of Samsung is ......");

        /**
         * Now let's call the showConfig() method
         */
        samsung.showConfig();
    }
}
