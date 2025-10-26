package Loop;

public class countDigits {

    public static void countDigits(int num){
        int counting=0;
        while(num >0){
            int last_night=num%10;
            num=num/10;
            counting++;
        }
        System.out.println("Total number of digits= "+counting);
    }
    public static void main(String[] args) {
        countDigits(3456567);
    }
}
