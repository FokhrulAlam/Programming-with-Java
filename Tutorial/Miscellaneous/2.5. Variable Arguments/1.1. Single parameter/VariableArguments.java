public class VariableArguments {
    public static void main(String[] args){
        Print obj = new Print();
        obj.display(5);
    };
}

class Print{
    public void display(int a){
        System.out.println(a);
    }

}
