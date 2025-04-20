package Basic_Math;

public class CountOfDigits {
    public static void main(String[] args) {

        int number=1234;
        int last_digit=0;

        while(number>0){
            last_digit=number%10;
            number= number/10;
            System.out.println(last_digit);
        }


    }
}
