package Day6_String;

public class reverse_String {

    public static void reverseString(String input){
        String reverse="";
        for(int i=input.length()-1;i>=0;i--){
            reverse=reverse+ input.charAt(i);
        }
        System.out.println("Reverse String is "+ reverse);
    }

    public static void main(String[] args) {
        reverseString("Aritra");
    }
}
