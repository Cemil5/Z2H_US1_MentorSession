package week_09;

public class WrapperTest {
    public static void main(String[] args) {
        Integer integer1 = new Integer("10");
        Integer integer2 = Integer.valueOf("20");
        Integer integer3 = 10;
        System.out.println("integer1 = " + integer1);
        System.out.println("integer2 = " + integer2);
        System.out.println("integer3 = " + integer3);
    }
}
