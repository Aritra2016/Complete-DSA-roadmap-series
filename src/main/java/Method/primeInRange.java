package Method;

public class primeInRange {

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

    public static void primesInRange(int n){

        for(int i=2; i<=n; i++){
          if(primeCheck(i)){
              System.out.print(i+" ");
          }
        }
        System.out.println();
    }

    public static void main(String[] args) {

       primesInRange(20);
    }
}
