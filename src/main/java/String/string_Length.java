package String;

public class string_Length {

    public static void check_Length(String str){
        if(str.length()<=5){
            System.out.println("Length is less than or equal to 5");
        }else{
            System.out.println("Invalid Lengthy String ");
        }
    }

    public static void main(String[] args) {

        check_Length("Aritra");
    }
}
