package programmingwithjava.tutorial.miscellaneous;

// we will find factorial of 5.
public class RecursionDemo {
    public static void main(String[] args){
        int a = 5;

        int b = recursive(a);
        System.out.println(b);

    }
    static int recursive(int a){
        if (a ==1){     //base case
            return 1;
        }
        else{
            return a*recursive(a-1);    // recursive call
        }
    }
}
