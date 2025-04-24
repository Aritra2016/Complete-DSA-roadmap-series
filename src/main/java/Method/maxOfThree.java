package Method;

import java.util.Scanner;

public class maxOfThree {

    public static int findMaxThree(int a, int b, int c){

       if(a>b && a> c) {
           System.out.println(" Max number is -> "+ a);
       }else if (b>a && b>c){
           System.out.println(" Max number is -> "+ b);
       }else{
           System.out.println(" max number is -> "+ c);
       }


       return 1;
    }

    public static void main(String[] args) {

//        Scanner sc1 = new Scanner(System.in);
//
//        System.out.println("Enter the 1st Number -->" );
//        int first= sc1.nextInt();
//
//        System.out.println("Enter the 2nd Number --> ");
//        int second= sc1.nextInt();
//
//        System.out.println("Enter the 3rd Number -->  ");
//        int third= sc1.nextInt();

        findMaxThree(12, 45, 166);
    }
}
