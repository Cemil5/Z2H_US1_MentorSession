package week_05;

import java.util.Scanner;

/*
The coder wants to print out the answer of the question “is this a fast car?”
If its max speed greater 200kph then it should print true and false otherwise.
 */
public class P4_IfElse_FastCar {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int maxSpeed = sc.nextInt();
        System.out.println("Enter the speed of car: ");
        if (maxSpeed >= 200) {
            System.out.println(true);
        } else if (maxSpeed < 200) {
            System.out.println(false);
        }
    }
}
