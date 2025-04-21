package String;

public class reverseString {
    public static void main(String[] args) {

        String s01=" Apple ";
        char[] ch_01=s01.toCharArray();
        int start=0;
        int end= ch_01.length-1;

        while(start<end){
            char temp= ch_01[start];
            ch_01[start]=ch_01[end];
            ch_01[end]=temp;

            start++;
            end--;
        }

        String r01= new String(ch_01);

        System.out.println("Original String ="+  s01);
        System.out.println("Reversed String ="+  r01);
    }
}
