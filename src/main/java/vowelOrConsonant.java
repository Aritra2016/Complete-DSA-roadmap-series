public class vowelOrConsonant {

    public static String checkVowelOrConsonanat(char ch){
        String result;
        if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' || ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U'){
            result= ch + " is a Vowel";
        } else {
            result= ch + " is a Consonant";
    }
        return result;
    }

    public static void main(String[] args) {
        char ch='E';
        System.out.println(checkVowelOrConsonanat(ch));
    }
}
