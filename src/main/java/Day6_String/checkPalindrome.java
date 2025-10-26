package Day6_String;

public class checkPalindrome {

    public static void checkPalindrome(String input){
        String reverse="";
        for(int i=input.length()-1;i>=0;i--){
            reverse=reverse+ input.charAt(i);
        }

        if(input.equalsIgnoreCase(reverse)){
            System.out.println("It is Palindrome");
        }else{
            System.out.println("It is not Palindrome ");
        }
    }

    public static void main(String[] args) {
        checkPalindrome("Eye");
    }
}
