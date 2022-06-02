package week_04;

import java.util.Scanner;

/*
Write a java program to check whether the input year is a leap year or not.
 Three criteria must be considered to identify leap years:
 The leap year must be evenly divisible by 4.
 But if the year can also be evenly divided by 100, it is not a leap year.
 If the year is also evenly divisible by 400, it is a leap year.

 According to these rules, the years 2000 and 2400 are leap years,
 while 1800, 1900, 2100, 2200, 2300, and 2500 are not leap years.
 */
public class LeapYear {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter any Year:");
        int year = scan.nextInt();
    }

    public static void option1(int year) {
        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
            System.out.println("leap year");
        } else {
            System.out.println("not leap year");
        }
    }

    public static void option2(int year) {
        boolean isLeap;
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                isLeap = year % 400 == 0;
            } else {
                isLeap = true;
            }
        } else {
            isLeap = false;
        }
        if (isLeap) System.out.println(year + " is a Leap Year.");
        else System.out.println(year + " is not a Leap Year.");
    }
}
