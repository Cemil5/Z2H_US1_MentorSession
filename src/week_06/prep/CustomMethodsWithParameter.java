package week_06.prep;

public class CustomMethodsWithParameter {

    public static void main(String[] args) {

        int num1 = 100;
        oddOrEven(num1);

        oddOrEven(45);
    }

    public static void oddOrEven(int number) {
        if (number % 2 == 0) {
            System.out.println(number + " is even number");
        } else {
            System.out.println(number + " is odd number");
        }
    }
}
