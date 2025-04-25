package Recursion;

public class printNumber {

    public static void printDec(int n){
        //Base Case
        if(n==1){
            System.out.println(n);
            return ;
        }
        //f(n)= n+ f(n-1) && then print n
        System.out.println(n);
        //call (n- 1) function
        printDec(n-1);

    }

    public static void printInc(int n){
        //Base case
    if(n==0){
//        System.out.println(1);
        return;
    }
        //f(n)= f(n-1)+ n , then call first f(n-1)
        printDec(n-1);
     System.out.println(n + " ");
    }


    public static void main(String[] args) {
        int n=10;
        printDec(10);
        System.out.println("------------------");
        printInc(5);
    }
}
