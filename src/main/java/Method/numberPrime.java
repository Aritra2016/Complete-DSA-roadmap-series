package Method;

public class numberPrime {

    public static boolean primeCheck(int n){
        boolean isPrime=true;

        for(int i=2; i<=n-1; i++){
            if(n%i==0){
                isPrime=false;
                break; //coming out of loop
            }

        }
        return isPrime;
    }


    public static void main(String[] args) {

        System.out.println(primeCheck(17));
    }
}
