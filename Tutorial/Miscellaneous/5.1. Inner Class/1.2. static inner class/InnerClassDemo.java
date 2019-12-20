package programmingwithjava.tutorial.miscellaneous;

/**
 * Inside InnerClassDemo, another class named "RefugeeClass" is created.
 */
public class InnerClassDemo {
    /**
     * let's create the static inner class.
     */
    public static class StaticInnerClass{
        String refugeeClassName;
        String hostClassName;

        //constructor
        StaticInnerClass(String refugeeClassName, String hostClassName){
            this.refugeeClassName = refugeeClassName;
            this.hostClassName = hostClassName;
        }

        @Override
        public String toString(){
            return "Refugee class name: " + refugeeClassName+ "\n" + "Host class name: " + hostClassName;
        }
    }
}
