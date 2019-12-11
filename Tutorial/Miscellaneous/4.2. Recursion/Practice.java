package programmingwithjava.tutorial.miscellaneous;


public class Practice {
    public static void main(String[] args){
        int a = 5;

        int b = recursive(a);
        System.out.println(b);

    }
    static int recursive(int a){
        if (a ==1){
            return 1;
        }
        else{
            return a*recursive(a-1);
        }
    }
}
