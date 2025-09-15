package Array;

public class subArrayFind {

    public static void subArray(int arr[]){
        int n= arr.length;
       for (int i=0; i<n; i++){
           int start=i;
           for(int j=0; j<n; j++){
               int end=j;
               for(int k=start; k<=end; k++){
                   System.out.print(arr[k]);
               }
               System.out.println( );
           }
           System.out.println();
       }

    }
    public static void main(String[] args) {
        int arr[]={12, 45,17,48,68};
        subArray(arr);

    }
}
