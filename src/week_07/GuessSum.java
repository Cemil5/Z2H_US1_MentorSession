package week_07;

import java.util.Scanner;

public class GuessSum {
    public static void main(String[] args) {
        doWhile();
    }


    static void doWhile() {
        int number1 = (int) (Math.random() * 10);
        int number2 = (int) (Math.random() * 10);

        Scanner input = new Scanner(System.in);

        int sum = number1 + number2;
        int userAnswer = 0;

        System.out.print("What is " + number1 + " + " + number2 + "? ");
        do {
            userAnswer = input.nextInt();
            if (sum != userAnswer){
                System.out.println("Try again !");
            }
        } while (sum != userAnswer);

        System.out.println("You got it!");

    }
}
