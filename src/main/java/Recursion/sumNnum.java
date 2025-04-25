package Recursion;

public class sumNnum {

   // f(n)=n+f(n-1)
    public static int sumNnum(int n){
        if(n==1){
            return 1;
        }
      int fnm1=sumNnum(n-1);
        int fn=n+fnm1;
        return  fn;
    }

    public static void main(String[] args) {

        System.out.println(sumNnum(10));
    }
}
