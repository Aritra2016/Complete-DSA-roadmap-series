package Array;

public class secLargest {

   public static int secLargest(int arr[]){
       int largest=0;
       int secLargest= -1;

       if(arr.length<2){
           return -1;
       }

       for(int i=1; i< arr.length; i++){
           if(arr[i] >arr[largest]){
               largest=i;
               secLargest=largest;
           } else if (arr[i]<arr[largest]) {
               if(arr[i]> arr[secLargest] || secLargest==-1){
                   secLargest=i;
               }
           }
       }


       return secLargest;
   }




    public static void main(String[] args) {

       int arr[]={12, 26,  21, 45, 1,10};

       int index=secLargest(arr);

        System.out.println("Second Largest element is-->"+ arr[index]);
    }
}
