package Array;

public class reverseArr {

     public static void reverseArr(int arr[ ]){
         //first & last index
         int first=0, last= arr.length-1;

         while (first< last){
             int temp= arr[last];
             arr[last]= arr[first];
             arr[first]= temp;

             first++;
             last--;

         }


     }
    public static void main(String[] args) {
        int arr[]={ 12, 17, 24, 56, 45, 34};

        reverseArr(arr);

        //Reverse Array
        for(int value:arr){
            System.out.println(value);
        }
    }
}
