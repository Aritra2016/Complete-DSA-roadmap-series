package Array;

public class LargestNum {

    public static int largestNum(int num[]){
        int largest=Integer.MIN_VALUE;
        int smallest=Integer.MAX_VALUE;

        for (int i=0; i<num.length; i++){
            if(num[i]>largest){
                largest= num[i];
            }
            if(smallest>num[i]){
                smallest= num[i];
            }
        }
        System.out.println("Smallest number is :"+smallest);
        return largest;
    }
    public static void main(String[] args) {
        int num[ ]={35, 67, 50, 24, 80, 89};
        int result_lar=largestNum(num);


        System.out.println("The largest number is ->"+ result_lar);
    }
}
