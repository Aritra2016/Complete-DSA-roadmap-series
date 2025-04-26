package Binary_Search;

public class Binary_Search_01 {

    public static int binarySearch(int arr[], int key){
        //start,end
        int start=0, end= arr.length-1;



        while(start <=end){
            int mid= (start+end)/2; //define mid inside loop

            if(arr[mid]==key){
                return mid;
            }

            else if(key< arr[mid]){
                end= mid-1;
            }
            else {
                start=mid+1;
            }

        }
        return -1;
    }

    public static void main(String[] args) {

        int arr[]= { 23, 35, 50, 60, 78};
      // int key= 35;
        System.out.println("Index of the key is ->"+ binarySearch(arr, 60));
    }
}
