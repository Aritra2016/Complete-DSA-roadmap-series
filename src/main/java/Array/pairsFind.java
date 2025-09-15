package Array;

public class pairsFind {

public static void printSubArray(int arr[]){

    //int arr[]= {2,5, 8, 10, 13};
  //outer loop= array element
    for(int i=0; i<arr.length; i++){
        int curr=arr[i];
        //inner loop= print pairs
        for(int j=i+1; j<arr.length; j++){
            System.out.print("("+curr+", "+arr[j]+")");
        }
        System.out.println();
    }


}
    public static void main(String[] args) {
        int arr[]= {2,5, 8, 10, 13};
        printSubArray(arr);


    }
}
