package Loop;

public class reverseNum {

    public static void reverseNum(int Number){
        int ans=0;

        while(Number>0){
         int last_Digit=Number%10;
         ans=ans*10+last_Digit;
         Number=Number/10;
        }
        System.out.println("Reverse number is "+ans);
    }

    public static void main(String[] args) {
        reverseNum(137);
    }
}
