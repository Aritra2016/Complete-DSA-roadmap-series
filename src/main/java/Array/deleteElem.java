package Array;

public class deleteElem {

    public static int delete(int arr[], int key) {

        int i;
        for (i = 0; i < arr.length - 1; i++) {
            if (arr[i] == key) {
                break;
            }
        }
        //Element not found condition
        if(i== arr.length){
            return arr.length;
        }
        for (int j = i; j < arr.length - 1; j++){
            arr[j]=arr[j+1];
        }

        return arr.length-1;

    }

    public static void main(String[] args) {

        int arr[]={ 12, 16, 24, 115, 32,1};
       int size= delete(arr, 32);
        System.out.println("The resultant array :-->"+ size);

        //Print New Array
        for(int value:arr){
            System.out.println(value+" ");
        }
    }
}
