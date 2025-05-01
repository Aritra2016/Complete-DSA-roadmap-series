package Method;

public class binaToDeci {

    public static void binToDec(int binNum){
        int pow=0;
        int deci=0;

        int myNum= binNum;

        while(binNum > 0){
            int lastDigit= binNum % 10;
            deci= (int) (deci + lastDigit * (Math.pow(2,pow)));

            pow++;
            binNum=binNum /10;

        }

        System.out.println("Decimal of -> "+  myNum +" is ="+deci);
    }
    public static void main(String[] args) {

        System.out.println("Let master");
        binToDec(101);

    }
}
