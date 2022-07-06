package week_12;

import java.util.stream.Collectors;

/*
Break camelCase
Write a function that will break up camel casing, using a space between words.

Example
"camelCasing"  =>  "camel Casing"
"weLoveProgramming"  =>  "we Love Programming"
"identifier"   =>  "identifier"
""             =>  ""
 */
public class BreakCamelCase {

    public static String camelCase(String input) {
        String output = "";
        for (char ch : input.toCharArray()) {
            output = Character.isUpperCase(ch) ? output + " " + ch : output + ch;
        }
        return output;
    }


    public static String camelCase2(String input) {
        String sentence = "";
        for (int i = 0; i < input.length(); i++) {
            String str = Character.toString(input.charAt(i));
            if (str.equals(str.toUpperCase())) {//checks each letter if it's upper case or not, if yes it adds space in front of it
                sentence += " ";// creates new sentence with a space
            }
            sentence += str;
        }
        return sentence.trim();// if input starts with upper case, it removes a space in the beginning of new sentence
    }

    public static void main(String[] args) {
        System.out.println(camelCase("camelCasing"));
        System.out.println(camelCase("weLoveProgramming"));
        System.out.println(camelCase("camelcasingtest"));
    }
}
