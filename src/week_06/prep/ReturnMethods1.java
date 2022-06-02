package week_06.prep;

public class ReturnMethods1 {

    public static void main(String[] args) {
        System.out.println(max1(10, 15));
        System.out.println(max2(10, 15));
    }

    public static int max(int n1, int n2) {
        if (n1 > n2) {
            return n1;
        } else {
            return n2;
        }
    }

    public static int max1(int n1, int n2) {
        if (n1 > n2) {
            return n1;
        } else {
            return n2;
        }
    }

    public static int max2(int n1, int n2) {
        if (n1 > n2) {
            return n1;
        }
        return n2;
    }


}
