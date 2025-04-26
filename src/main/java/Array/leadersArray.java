package Array;

import java.util.ArrayList;

public class leadersArray {

    public static ArrayList<Integer> leaders(int arr[]){

        ArrayList<Integer> result= new ArrayList<>();

        int largest= Integer.MIN_VALUE;

        //Traverse from the End
        for(int i= arr.length-1; i>=0; i--){
            if(arr[i]> largest){
                largest=arr[i];
                result.add(largest);
            }
        }
    // out of For Loop
        return result;
    }

    public static void main(String[] args) {
        int arr[]={24, 45, 12, 30, 14};

        ArrayList<Integer> leadersList = leaders(arr);

        System.out.println("Leaders in the array: " + leadersList);

    }
}
