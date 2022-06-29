package week_10;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Stack;

/*
leetcode medium

151. Reverse Words in a String
https://leetcode.com/problems/reverse-words-in-a-string/

Given an input string s, reverse the order of the words.

A word is defined as a sequence of non-space characters. The words in s will be separated by at least one space.

Return a string of the words in reverse order concatenated by a single space.

Note that s may contain leading or trailing spaces or multiple spaces between two words. The returned string should only have a single space separating the words. Do not include any extra spaces.

Example 1:

Input: s = "the sky is blue"
Output: "blue is sky the"
Example 2:

Input: s = "  hello world  "
Output: "world hello"
Explanation: Your reversed string should not contain leading or trailing spaces.
Example 3:

Input: s = "a good   example"
Output: "example good a"
Explanation: You need to reduce multiple spaces between two words to a single space in the reversed string.

Example: Let the input string be “i like this program very much”.
The function should change the string to “much very program this like i”
 */
public class Q4_ReverseWords {
    static String reverseWord(String input){
        String [] strs = input.split(" ");
        String result = "";
        for (int i = strs.length-1; i>=0; i--){
            if(!strs[i].isBlank()) {
                result += strs[i]+ " ";
            }
        }
        return result.trim();
    }

    public static String reverseWords1(String s) {
        ArrayList<String> list = new ArrayList<>();

        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);

            if(ch != ' '){
                sb.append(ch);
            }else{
                if(sb.length() != 0) list.add(sb.toString());
                sb = new StringBuilder();
            }
        }

        // for last word
        if(sb.length() != 0) list.add(sb.toString());

        Collections.reverse(list);

        sb = new StringBuilder();

        for(int i = 0; i < list.size(); i++){
            sb.append(list.get(i));
            if(i != list.size() - 1) sb.append(" ");
        }

        return sb.toString();
    }

    public static String reverseWords(String s) {
        String [] tokens  = s.trim().split(" ");
        Stack<String> stack = new Stack<>();
        for(String t: tokens){
            if(t!=""){
                stack.push(t);
            }
        }
        StringBuilder sb = new StringBuilder();
        while(stack.size()>0){
            String ss = stack.pop();
            if(stack.size()==0){
                sb.append(ss);
            }else{
                sb.append(ss).append(" ");
            }

        }
        return  sb.toString();
    }

    public static void main(String[] args) {
      //  String s = "i like this program very much ";
        String s = "a good   example";
        System.out.println(reverseWords(s));
    }
}
