package week_08;

import java.util.Scanner;

public class PizzaAppWithBugs {

    public static void main(String[] args) {

        System.out.println("Welcome to Best Pizza in Town");
        System.out.println("Please log in before placing the order");
        login();
    }

    public static void login() {

        String email = "mike@gmail.com";
        String password = "password";

        Scanner scanner = new Scanner(System.in);

        for (int i = 3; i > 0; ) {

            System.out.println("Enter your email:");
            String givenEmail = scanner.next();

            if (!isInputValid(givenEmail)) {
                System.out.println("Invalid Email. Please try again...");
                continue;
            }

            System.out.println("Please enter your password:");
            String givenPassword = scanner.next();

            if ((email.equals(givenEmail) && password.equals(givenPassword))) {
                System.out.println("Successfully logged in with email");
                continue;

            } else { //invalid checking

                if (i != 1) {  //ask again

                    System.out.println("Invalid credentials !! left " + (i - 1) + " chances to try");
                    i--;

                } else {
                    System.out.println("Your account is locked - try again tomorrow");
                    System.exit(0); //close the execution of jvm
                }
            }
        }

    }

    public static boolean isInputValid(String givenEmail) {
        //Check if the email address is valid:  //if @ . available, and @ is before . mikegmail.com
        int firstSignOfIndex = givenEmail.indexOf('@');  // -1
        int secondSignOfIndex = givenEmail.indexOf('.');

        boolean checkEmail = firstSignOfIndex < 0 || secondSignOfIndex < 0 || secondSignOfIndex < firstSignOfIndex; //invalid

        if (checkEmail) {
            return true;
        }

        return isEmailDomainValid(givenEmail);
    }

    public static boolean isEmailDomainValid(String givenEmail) {

        String domain = givenEmail.substring(givenEmail.indexOf('@') + 1, givenEmail.indexOf('.'));

        return domain.equalsIgnoreCase("gail") || domain.equalsIgnoreCase("hotmail");

    }


}
