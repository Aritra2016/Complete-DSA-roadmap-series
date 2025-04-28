package MIscellaneous;

public class reverseString {

    public static String reverse(String input) {

        String rev=" ";

        for(int i=input.length()-1; i>=0; i--){
            rev= rev + input.charAt(i);
        }

        return rev;

    }
//        char charac[ ]=input.toCharArray();
//        int left= 0, right= charac.length-1;
//        while(left< right){
//            char temp= charac[right];
//            charac[right] =charac[left];
//             charac[left]=charac[right];
//             left++;
//             right--;
//        }
//        return new String(charac);



    public static void main(String[] args) {

       // String display="I am boy ";

        System.out.println( reverse("I am Boys "));;


    }
}
