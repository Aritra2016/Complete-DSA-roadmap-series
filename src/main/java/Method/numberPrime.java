package Method;

public class numberPrime {

    public static boolean primeCheck(int n){
        boolean isPrime=true;

        //Optimised Loop
        for(int i=2; i<=Math.sqrt(n); i++){
            if(n%i==0){
                isPrime=false;
               break; //coming out of loop
            }

        }
        return isPrime;
    }


    public static void main(String[] args) {

        System.out.println(primeCheck(5));
    }
}
