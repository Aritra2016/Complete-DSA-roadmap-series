package Basic_Math;

public class sumOddNum {

    public static int sumOddNmu(int n){
        int sum=0;
        for(int i=0; i<=n; i++){
            if(i%2 !=0){
                sum=sum+i;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        int n=6;
        System.out.println("The sum of odd numbers upto "+ n + " is :-> "+ sumOddNmu(n));
    }
}
