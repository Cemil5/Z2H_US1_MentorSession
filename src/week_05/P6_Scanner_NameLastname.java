package week_05;

import java.util.Scanner;

/*
I want to get name and last name of user from terminal.
But this code only takes the name, not the last name.
It directly jumps to printing without waiting user to input the last name.
 */
public class P6_Scanner_NameLastname {
    public static void main(String[] args) {
        Scanner scanMe = new Scanner(System.in);
        String name, lastName;
        System.out.println("Please write your name:");
        name = scanMe.next();
        System.out.println("Please write your last name:");
        lastName = scanMe.nextLine();
        System.out.print(name + " " + lastName);

        name.intern();

    }

}
