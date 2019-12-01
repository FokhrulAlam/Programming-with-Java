public class VariableArguments {
    public static void main(String[] args){
        Print obj = new Print();
        obj.display(5);
    };
}

class Print{
    public void display(int ... a){     //Varargs. When we are unsure of how many arguments we will pass.....
        for (int i : a) {               // a is like an array here.
            System.out.println(i);
        }
    }
    public void display(int a){
        System.out.println("Repeated display method: "+a);
    }

}
