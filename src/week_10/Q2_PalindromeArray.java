package week_10;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

/*
Write a method that takes in a non-empty array of Strings that will return an ArrayList 
which consist of palindromic strings in given array. 
The input string can be assumed to contain only alphabets (both uppercase and lowercase) and numeric digits.
Examples:
Input: String[] arr = {"abc", "car", "ada", "racecar", "cool"}
Output: ["ada", "racecar"]
Explanation: These two are the only palindrome strings in the given array
Input: String[] arr = {"def", "ab"}
Output:[]
 */
public class Q2_PalindromeArray {

    public static ArrayList<String> getPalindromes(String[] input) {

        ArrayList<String> result = new ArrayList<>();
        for (String str : input) {
            String s = str.toLowerCase().replace(" ", "");
            boolean flag = true;
            for (int i = 0, j = s.length() - 1; i < s.length() / 2; i++, j--) {
                if (s.charAt(i) != s.charAt(j)) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                result.add(str);
            }
        }
        return result;
    }

    public static ArrayList<String> getPalindromes2(String[] array) {
        ArrayList<String> result = new ArrayList<>();
        for (String s : array) {
            //call the method you have created for question-1
            if (Q1_PalindromeString.isPalindrome(s)) {
                result.add(s);
            }
        }
        return result;
    }

    public static ArrayList<String> findPalindromes(String[] array){
        ArrayList<String> arrayList = new ArrayList<>(Arrays.asList(array));
        arrayList.removeIf(p-> !isPalindrome(p));
        return arrayList;
    }

    //Gadir
    public static ArrayList addPalindrome(String[] arr) {

        ArrayList<String> list = new ArrayList<>();
        for (String each : arr) {
            String reverse = "";
            for (int i = each.length() - 1; i >= 0; i--) {
                reverse += each.charAt(i);
            }
            if (each.equalsIgnoreCase(reverse)) {
                list.add(each);
            }
        }
        return list;
    }

    // Khashayar
    static void getPalindromes() {
        ArrayList<String> words = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        System.out.println("How many words do you want to enter? ");
        int numberOfWords = input.nextInt();
        input.nextLine();
        for (int i = 0; i < numberOfWords; i++) {
            String word = "";
            System.out.println("please enter your words: ");
            word = input.nextLine();
            word = word.toLowerCase().replaceAll(" ", "");
            String reverseWord = "";
            char[] newWord = word.toCharArray();
            for (int j = newWord.length - 1; j >= 0; j--) {
                reverseWord += newWord[j];
            }
            if (reverseWord.equals(word)) {
                words.add(word);
            }
        }
        System.out.println("Output: " + words);
        input.close();
    }

    //dilara Question-1
    public static boolean isPalindrome(String str) {
        if (str == null || str.isEmpty()) {
            return false;
        }
        str = str.toLowerCase();
        str = str.trim();
        str = str.replace(" ", "");
        String reverse = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reverse += str.charAt(i);
        }
        if (str.equals(reverse)) return true;
        return false;
    }

    //dilara Question-2
    public static ArrayList<String> palindromeList(String[] list) {
        ArrayList<String> palindromeList = new ArrayList<>();
        for (int i = 0; i < list.length; i++) {
            if (isPalindrome(list[i])) {
                palindromeList.add(list[i]);
            }
        }
        return palindromeList;
    }


    public static void main(String[] args) {
        String[] arr1 = {"abc", "car", "ada", "race car", "cool", "Was it a car or a cat I saw", " ", "abba"};
        String[] arr2 = {"def", "ab"};
        System.out.println(getPalindromes(arr1));
        System.out.println(getPalindromes(arr2));
        System.out.println(addPalindrome(arr1));
        System.out.println(addPalindrome(arr2));


    }


}
