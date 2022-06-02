package week_06;

import java.util.Scanner;

public class CodeReview_BeforeRefactoring {

    public static void positiveOrNegative() {
        Scanner input = new Scanner(System.in);
        int num = 0;
        int positive = 0;
        int negative = 0;

        for (int i = 0; i < 5; i++) {
            System.out.println("Please, enter positive or negative number:");
            num = input.nextInt();
            if (num >= 0) {
                num = 1;
                positive += num;
                continue;                                       // no need to put "continue"
            } else {
                num = 1;
                negative += num;
                continue;                                       // no need to put "continue"
            }
        }
        System.out.println("Positive numbers: " + positive);
        System.out.println("Negative numbers: " + negative);
        input.close();
    }

    public static void eligibleToVote1(int age, boolean isAmerican) {

        if (age >= 18 && isAmerican == true) {                  // no need to write "isAmerican == true"
            System.out.println("You are eligible to vote");
        } else {
            System.out.println("You are not eligible to vote");
        }
    }

    public static void eligibleToVote(int age, boolean isAmerican) {

        boolean isEligible;

        isEligible = (age >= 18 && isAmerican == true) ? true : false;    // can be simplified

        if (isEligible) {
            System.out.println("You are eligible to vote");
        } else {
            System.out.println("You are not eligible to vote");
        }
    }

    public static void month(String monthName) {
        int numDays = 0;

        monthName = monthName.substring(0, 1).toUpperCase() + monthName.substring(1).toLowerCase();

        if (monthName.equals("January")) {                              // can be converted to switch case
            numDays = 31;
        } else if (monthName.equals("February")) {
            numDays = 28;
        } else if (monthName.equals("March")) {
            numDays = 31;
        } else if (monthName.equals("April")) {
            numDays = 30;
        } else if (monthName.equals("May")) {
            numDays = 31;
        } else if (monthName.equals("June")) {
            numDays = 30;
        } else if (monthName.equals("July")) {
            numDays = 31;
        } else if (monthName.equals("August")) {
            numDays = 31;
        } else if (monthName.equals("September")) {
            numDays = 30;
        } else if (monthName.equals("October")) {
            numDays = 31;
        } else if (monthName.equals("November")) {
            numDays = 28;
        } else if (monthName.equals("December")) {
            numDays = 31;
        } else {
            numDays = 0;
        }

        if (numDays != 0) {
            System.out.println(monthName + " has " + numDays + " days.");
        } else {
            System.out.println(monthName + " is wrong month.");
        }
    }

    public static void monthDays(String monthName) {
        String days = "";
        monthName = monthName.substring(0, 1).toUpperCase() + monthName.substring(1).toLowerCase();

        if (monthName.equals("January") || monthName.equals("March") ||                  // can be converted to switch case
                monthName.equals("May") || monthName.equals("July") ||
                monthName.equals("August") || monthName.equals("October")
                || monthName.equals("December")) {
            days = "31 days";
        } else if (monthName.equals("February")) {
            days = "28 days";
        } else if (monthName.equals("April") || monthName.equals("June") ||
                monthName.equals("September") || monthName.equals("November")) {
            days = "30 days";
        } else {
            days = "month is invalid";
        }

        System.out.println(monthName + " has " + days);
    }

    public static void cydeoApplication() {
        Scanner input = new Scanner(System.in);
        for (int i = 3; i > 0; ) {
            i -= 1;                                 //  should be inside for ()

            System.out.println("Please enter user name:");
            String userName = input.nextLine();
            System.out.println("Please enter password");
            String password = input.nextLine();
            if (((userName.equals("Cydeo")) && (password.equals("Cydeo123")))) {
                System.out.println(" Logged in.");
                System.exit(0);
            } else {
                System.out.println("User name or password is not valid, you have " + i + " attemts left.");
            }
        }
        System.err.println("Your account is locked.");
        input.close();
    }

    /*
    Create a class named DivisibleBy and Write a program that can print the numbers between 1 ~ N that can be divisible by 3, 5, and 15.
	            if the number can be divisible by 3, 5 and 15,
	                then it should only be displayed in DivisibelBy15' section

	            if the number can be divisible by 3 but cannot be divisible by 15,
	                then it should only be displayed in DivisibelBy3' section

	            if the number can be divisible by 5 but cannot be divisible by 15,
	                then it should only be displayed in DivisibelBy5' section

	            EX:
	                input: 100

	                Output:
	                     Divisible By 15: 15 30 45 60 75 90

	                     Divisible By 5:  5 10 20 25 35 40 50 55 65 70 80 85 95 100

	                     Divisible By 3: 3 6 9 12 18 21 24 27 33 36 39 42 48 51 54 57 63 66 69 72 78 81 84 87 93 96 99
     */
    public static void divisibleBy() {

        String divisibleBy15 = "";
        String divisibleBy3 = "";
        String divisibleBy5 = "";

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a Integer: ");
        int N = input.nextInt();                            // no uppercase for variable names

        for (int i = 0; i <= N; i++) {
            if ((i % 3 == 0) && (i % 5 == 0) && (i % 15 == 0)) {    // should be simplified
                divisibleBy15 += " " + i;
            }                                               // else if

            if ((i % 3 == 0) && (i % 15 != 0)) {
                divisibleBy3 += " " + i;
            }                                                // else

            if ((i % 5 == 0) && (i % 15 != 0)) {
                divisibleBy5 += " " + i;
            }

        }
        System.out.println("Divisible By 15: " + divisibleBy15);
        System.out.println("Divisible By 5:  " + divisibleBy5);
        System.out.println("Divisible By 3:  " + divisibleBy3);
    }

    /*
    Create a class named UntilNegative and Write a program that calculates the sum of numbers entered
    by the user until user enters a negative number.
     */
    public static void untilNegative() {

        double sum = 0;
        Scanner input = new Scanner(System.in);

        for (int i = 0; ; ) {                   // should be converted to while like below method

            System.out.print("Please enter any number: ");
            double number = input.nextDouble();
            if (number >= 0) {
                sum += number;
                System.out.println("Sum of the numbers are: " + sum);
            } else {
                System.err.println("You entered a negative number.");
                break;
            }
        }
        input.close();
    }

    public static void untilNegativeAlternativeWay() {

        Scanner input = new Scanner(System.in);
        double sum = 0;
        double number = 0;

        while (number >= 0) {
            System.out.print("Please enter any number: ");
            number = input.nextDouble();
            if (number >= 0) {
                sum += number;
                System.out.println("Sum of the numbers are: " + sum);
            }
        }
        System.err.println("You entered a negative number.");
        input.close();
    }


}
