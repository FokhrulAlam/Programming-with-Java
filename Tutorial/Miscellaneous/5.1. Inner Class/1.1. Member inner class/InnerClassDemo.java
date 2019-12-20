package programmingwithjava.tutorial.miscellaneous;

/**
 * Inside InnerClassDemo, another class named "RefugeeClass" is created.
 */
public class InnerClassDemo {
    /**
     * let's create the member inner class.
     */
    public class RefugeeClass{
        String refugeeClassName;
        String hostClassName;

        //constructor
        RefugeeClass(String refugeeClassName, String hostClassName){
            this.refugeeClassName = refugeeClassName;
            this.hostClassName = hostClassName;
        }

        @Override
        public String toString(){
            return "Refugee class name: " + refugeeClassName+ "\n" + "Host class name: " + hostClassName;
        }
    }
}
