package Basic_Math;

public class cubesOfNum {

    public static int cubesList(int num) {

        int cubes = 1;
        for (int i = 1; i <= num; i++) {
            cubes = i * i * i;
            System.out.println("The number is : " +i+"and cube of "+i+"is :"+cubes);
        }
        return cubes;
    }

    public static void main(String[] args) {

        System.out.println(cubesList(4));
    }
}
