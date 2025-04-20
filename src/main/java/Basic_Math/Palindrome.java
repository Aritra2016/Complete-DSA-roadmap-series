package Basic_Math;

public class Palindrome {
    public static void main(String[] args) {

        int number=3478; int last_digit=0; int reverse=0;
        int dup= number;

        while(number>0){
            last_digit=number%10;
            reverse= (reverse *10)+last_digit;
            number= number/10; // at-last number=0;
        }

        if(dup== reverse){
            System.out.println("Palindrome it is ");
        }else{
            System.out.println("Not Palindrome ");
        }
    }
}
