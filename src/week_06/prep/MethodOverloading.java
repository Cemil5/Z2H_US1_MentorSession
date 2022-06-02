package week_06.prep;

public class MethodOverloading {

    public static double multiply(int a, int b){
        return a * b;
    }

    public static double multiply(int a, int b, int c){
        return a * b * c;
    }

    public static double multiply(double a, int b){
        return a * b;
    }

    public static double multiply(int a, double b){
        return a * b;
    }

    public static double multiply(double a, double b){
        return a * b;
    }

    public static void main(String[] args) {
        System.out.println(multiply(5, 6));
        System.out.println(multiply(5.5, 6));
        System.out.println(multiply(5, 6.5));
        System.out.println(multiply(5, 6.5));
    }


}
