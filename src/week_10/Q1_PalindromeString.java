package week_10;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

/*
A string is said to be palindrome after converting all uppercase letters into lowercase letters and removing all spaces  it reads the same backward as forward.
For e.g. civic, radar, level, rotor, race car, are palindrome because if we try to read it from backward, it is same as forward.
Write a method that accepts a String as argument and return true
 if it is a palindrome, or false otherwise.
Assume string has only alphanumeric characters include letters
and numbers and spaces, ignore upper-lowercase characters.

Examples:
Radar → true
rotator → true
Summer→false
Was it a car or a cat I saw →true
"" → true
" " → true

 */
public class Q1_PalindromeString {

    public static boolean isPalindrome1(String str) {
        if (str.isBlank()) {
            return true;
        }
        str = str.replace(" ", "").toLowerCase();
        String reverseStr = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reverseStr += "" + str.charAt(i);
        }
        return reverseStr.equals(str);
    }

    public static boolean isPalindrome3(String str) {
        if (str.isBlank()) {
            return true;
        }
        str = str.toLowerCase().replace(" ", "");
        int strLength = str.length();
        for (int i = 0, j = strLength - 1; i < strLength / 2; i++, j--) {
            if (str.charAt(i) != str.charAt(j)) {
                return false;
            }
        }
        return true;
    }

    public static boolean isPalindrome(String input){
        input = input.toLowerCase().replace(" ", "");
        String[] reversed = input.split("");
        String[] sentArr = input.split("");

        Collections.reverse(Arrays.asList(sentArr));

        return Arrays.toString(reversed).equals(Arrays.toString(sentArr));
    }

    // Gadir
    public static boolean isPalindrome5(String text) {
        text = text.replace(" ", "");
        String reverse = "";
        boolean isPalindrome = false;
        for (int i = text.length() - 1; i >= 0; i--) {
            reverse += text.charAt(i);
        }
        if (text.equalsIgnoreCase(reverse)) {
            isPalindrome = true;
        } else {
            isPalindrome = false;
        }
        return isPalindrome;
    }

    //**************************
    // Khashayar
    static void isPalindrome() {
        Scanner input = new Scanner(System.in);
        System.out.println("please enter your word or words: ");
        //  input.nextLine();
        String words = input.nextLine();
        input.close();
        String reverseWords = "";
        words = words.toLowerCase();
        words = words.replaceAll(" ", "");
        char[] newWords = words.toCharArray();
        for (int i = newWords.length - 1; i >= 0; i--) {
            reverseWords += newWords[i];
        }
        System.out.println(reverseWords);
        System.out.println(reverseWords.equals(words));
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome("Radar") == true);
        System.out.println(isPalindrome("rotator") == true);
        System.out.println(isPalindrome("Summer") == false);
        System.out.println(isPalindrome("Was it a car or a cat I saw") == true);
        System.out.println(isPalindrome("") == true);
        System.out.println(isPalindrome(" ") == true);


    }

}
