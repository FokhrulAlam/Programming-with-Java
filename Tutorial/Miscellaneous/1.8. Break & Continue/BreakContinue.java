public class BreakContinue {
    //break, continue
    public static void main(String[] args){
        for (int i=1;i<=10;i++){
            if (i==5){
                System.out.println("After executing 'continue':");
                continue;
            }
            if (i==8){
                System.out.println("After executing 'break':");
                break;
            }
            System.out.println(i);
        }
    }
}
