package Basic_Math;

public class ReverseNum {
    public static void main(String[] args) {

        int number=2356;
        int last_digit=0 , reverse=0;
        while(number >0){
            last_digit=number%10;
            number= number /10;
            reverse= (reverse*10)+last_digit;


        }

        System.out.println(reverse);
    }
}
