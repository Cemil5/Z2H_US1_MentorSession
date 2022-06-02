package week_05;

/*
If number is greater than 90, I want to print only "Number is greater than 90"
But it prints "Number is greater than 50" after "Number is greater than 90" for numbers greater than 90.
 */

public class P1_IfElse_Numbers {
    public static void main(String[] args) {
        int number = 95;
        System.out.println("Number " + number);
        if (number > 90) {
            System.out.println("Number is greater than 90");
        }
        if (number > 50) {
            System.out.println("Number is greater than 50");
        }

    }
}
