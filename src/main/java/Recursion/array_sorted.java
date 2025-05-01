package Recursion;

public class array_sorted {

    public static boolean is_Sorted(int arr[], int i) {
        //base case
        if(i== arr.length-1)
            return true;

     //sorted or not
      if(arr[i]>arr[i+1]){
          return false;
      }
        return   is_Sorted(arr, i+1);


    }

    public static void main(String[] args) {
        int arr[]={12, 16, 19, 23, 45};

        System.out.println(is_Sorted(arr,0));
    }
}
