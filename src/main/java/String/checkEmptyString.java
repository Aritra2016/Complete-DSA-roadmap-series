package String;

public class checkEmptyString {

    public static String checkEmpty(String msg){
        if(msg.isEmpty()){
            System.out.println("String is->"+msg+" Empty");
        }else{
            System.out.println( "String is not->"+msg+" empty");
        }
        return msg;
    }

    public static void main(String[] args) {

        checkEmpty("Bali");
    }
}
