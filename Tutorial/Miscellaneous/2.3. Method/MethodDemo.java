public class MethodDemo {
    public static void main(String[] args){
        printNumber();
        System.out.println();
        printName("Md Fokhrul Alam");
        studentsScore("Bangla", 100);

        int sum = Add(10,12,0);
        System.out.println("The sum of the numbers you passed to method Add() is "+sum);
    }

    public static void printNumber(){
        for (int i=0;i<=10;i+=2){
            System.out.print(i+" ");
        }
    }

    public static void printName(String name){
        System.out.println("Your name is "+name);
    }

    public static void studentsScore(String subject, int score){
        System.out.println("You received "+score+" in "+subject+".");
    }

    public static int Add(int a, int b, int c){
        return (a+b+c);
    }
}
