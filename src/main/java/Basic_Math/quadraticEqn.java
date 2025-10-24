package Basic_Math;

public class quadraticEqn {
    public static int quadraticEqn(int a, int b, int c){
        int d= b*b-4*a*c;
        int root1 = 0, root2=0;
        if(d>0){
            root1= (int) ((-b + Math.sqrt(d)) / (2*a));
            root2= (int) ((-b - Math.sqrt(d)) / (2*a));
            System.out.println("Roots are real and different");
            System.out.println("Root1: "+ root1);
            System.out.println("Root2: "+ root2);
        }else if(d==0){
            root1= root2= (int) (-b / (2*a));
            System.out.println("Roots are real and same");
            System.out.println("Root1 and Root2: "+ root1);
        }else{
            System.out.println("Roots are complex and different");
        }

        return root1;
    }
        public static void main(String[] args) {
        int a=1, b=-7, c=12;
            System.out.println("The root is :->"+ quadraticEqn(a, b, c));
    }

    }


