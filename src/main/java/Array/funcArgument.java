package Array;

import java.util.Arrays;

public class funcArgument {

    public static void update(int marks[]){
        for(int i=0; i<marks.length;i++){
            marks[i]=marks[i]+10;
        }
    }
    public static void main(String[] args) {

        int marks[]={89, 84, 72, 75, 90};
      update(marks);

      //print our Updated Array
        for(int i=0; i<marks.length;i++){
            System.out.println("Update marks are ->  "+marks[i]);
        }

        System.out.println( );

    }
}
