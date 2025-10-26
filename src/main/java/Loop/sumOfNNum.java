package Loop;

public class sumOfNNum {

    public static void sumNNum(int num){
        int sum=0;
        for(int i=0;i<=num;i++){
            sum= sum+i;
        }
        System.out.println("Summation of natural number ->"+sum);
    }
    public static void main(String[] args) {
        sumNNum(10);
    }
}
