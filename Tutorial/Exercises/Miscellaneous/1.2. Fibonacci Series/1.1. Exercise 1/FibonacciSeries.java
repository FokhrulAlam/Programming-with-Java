public class FibonacciSeries {
    public static void main(String[] args){
        int previousNumber=0;
        int currentNumber=1;

        for (int i=1;i<=10;i++){
            System.out.print(currentNumber+" ");
            int nextNumber=previousNumber+currentNumber;
            previousNumber=currentNumber;
            currentNumber=nextNumber;
        }
    }
}
