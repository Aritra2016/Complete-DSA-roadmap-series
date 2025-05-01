package Recursion;

public class basic_recursion_01 {

     public static int fun1( int n){
       //Base Condition
         if(n==0){
             System.out.println(n);
         }
       int result= fun1(n-1);
         return n;
     }

    public static void main(String[] args) {

        System.out.println("Numbers are --> "+ fun1(5));
    }
}
