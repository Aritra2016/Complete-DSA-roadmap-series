package Basic_Math;

public class greatest_threenum {

    public static int greatest_threenum(int a, int b, int c){
        if(a>=b && a>=c){
            return a;
        }else if(b>=a && b>=c){
            return b;
        }else{
            return c;
        }
    }

    public static void main(String[] args) {
        int a=10, b=25, c=15;
        System.out.println("The greatest number is :->"+ greatest_threenum(a, b, c));
    }
}
