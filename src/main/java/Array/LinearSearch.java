package Array;

public class LinearSearch {

    public static int searchId(int id[], int key){
        for(int i=0; i<id.length; i++) {
            if (id[i] == key) {
                return i; //return value
            }
        }

                return -1;
    }


    public static void main(String[] args) {

        int id[]={203, 210, 223, 240, 236};
        int key= 240;
      int index=  searchId(id,key);
      if(index== -1)
        System.out.println("Result is not found->"+ index);
      else
          System.out.println("Result is at "+ index);
    }
}
