package String;

public class checkFirstCharacter {

    public static String checkFirst(String input){
        char ch= input.charAt(0);
        if(ch=='A'||ch=='E'|| ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' || ch=='I' || ch=='O' || ch=='U' ){
            System.out.println("First Element"+ch+"is vowel");
        }else{
            System.out.println("First element"+ch+"is consonant");
        }
        return input;
    }
    public static void main(String[] args) {
        checkFirst("Aritra");
    }
}
