package Array;

public class ArrayPair {

public static void printSubArray(int arr[]){

    //int arr[]= {2,5, 8, 10, 13};
   for(int st=0; st<arr.length; st++){
       for(int end=0; end<arr.length; end++){
           for(int k=st; k<=end; k++){
               System.out.print( arr[k]+" ");
           }
           System.out.println();
       }
   }

}
    public static void main(String[] args) {
        int arr[]= {2,5, 8, 10, 13};
        printSubArray(arr);


    }
}
