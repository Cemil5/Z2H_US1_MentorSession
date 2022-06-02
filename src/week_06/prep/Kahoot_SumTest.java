package week_06.prep;

public class Kahoot_SumTest {

    public static int sum(int a, int b) {
        if (a + b > 1)
            return 0;
        System.out.print(a + b);
        return a + b;
    }

    public static void main(String[] args) {
        System.out.println(sum(1, sum(0, 1)));     // sum(1, 1)
        System.out.println(sum(0, sum(5, 1)));     // sum(1, 1)
        System.out.println(sum(1, sum(6, 1)));     // sum(1, 1)
        // result : 10
    }


}
