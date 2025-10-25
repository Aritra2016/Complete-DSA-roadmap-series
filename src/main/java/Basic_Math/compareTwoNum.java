package Basic_Math;

import java.util.Scanner;

public class compareTwoNum {

    public static boolean compareNum(int a, int b){

        if(a==b ){
            System.out.println("They are equal ");
        }else{
            System.out.println("They are not equal ");
        }
      return true;
    }

    public static void main(String[] args) {

        boolean result= compareNum(10, -10);
        System.out.println(result);
    }
}
