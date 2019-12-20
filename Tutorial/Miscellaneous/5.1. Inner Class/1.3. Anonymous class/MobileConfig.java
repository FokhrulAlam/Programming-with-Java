package programmingwithjava.tutorial.miscellaneous;

/**
 * MobileConfig is an interface.
 * Different classes will implement this interface.
 */
public interface MobileConfig {
    /**
     * child classes will implement the following method.
     */
    public void showConfig();

}

/**
 * Instead of creating two new classes that will implement the above interface,
 * we can create anonymous class inside the MainClass.
 */
//class Samsung implements MobileConfig{
//    @Override
//    public void showConfig() {
//        System.out.println("The configuration of Samsung is ......");
//    }
//}
//
//class Iphone implements MobileConfig{
//    @Override
//    public void showConfig() {
//        System.out.println("The configuration of Iphone is .....");
//    }
//}


