package Method;

public class factorial {

    public static int factorial(int n){
      int f=1;
        for(int i=n; i>0; i--){
            f=f*i;
        }
        return f;
    }
    public static void main(String[] args) {

        System.out.println("Result of factorial -> "+ factorial(5));
    }
}
