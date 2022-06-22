package week_10;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/*
Highest and Lowest Num From String

You are given a string of space separated numbers, and have to return the highest and lowest number.

Examples
highAndLow("1 2 3 4 5")  // return "5 1"
highAndLow("1 2 -3 4 5") // return "5 -3"
highAndLow("1 9 3 4 -5") // return "9 -5"
Notes
All numbers are valid Int32, no need to validate them.
There will always be at least one number in the input string.
Output string must be two numbers separated by a single space, and highest number is first.
 */
public class Q3_HighestLowestNumFromString {

    static String highAndLow1(String str) {
        String[] strings = str.split(" ");
        ArrayList<Integer> list = new ArrayList<>();
        for (String s : strings) {
            list.add(Integer.valueOf(s));
        }
        return Collections.max(list) + " " + Collections.min(list);
    }

   static String highAndLow(String str){
        String[] strings = str.split(" ");
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (String s : strings){
            int num = Integer.parseInt(s);
            min = Math.min(num, min);
            max = Math.max(num, max);
        }
        return max + " " + min;
    }

    static String highAndLow3(String str){
        String[] strings = str.split(" ");
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (String s : strings){
            int num = Integer.parseInt(s);
            if (num>max){
                max = num;
            }
            if (num<min){
                min = num;
            }
        }
        return max + " " + min;
    }

    static String highAndLow4(String str){
        String[] strings = str.split(" ");
        int[] ints = new int[strings.length];
        for (int i =0;i< ints.length; i++){
            ints[i] = Integer.parseInt(strings[i]);
        }
        Arrays.sort(ints);
        return ""+ints[ints.length-1] + " " + ints[0];
    }

    public static void main(String[] args) {
        System.out.println(highAndLow("8 3 -5 42 -1 0 0 -9 4 7 4 -4").equals("42 -9"));
        System.out.println(highAndLow("1 2 3").equals("3 1"));
    }

}
