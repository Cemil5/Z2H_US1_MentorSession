package week_09;

import java.util.Locale;

public class Q3_JadenCase {

    public static String toJadenCase1(String phrase) {
        if (phrase == null || phrase.isEmpty()) {
            return "";
        }
        String result = "";
        String[] strings = phrase.split(" ");
        for (String str : strings) {
            result += (str.charAt(0) + "").toUpperCase(Locale.ROOT) + str.substring(1) + " ";
        }
        return result.trim();
    }

    public static String toJadenCase2(String phrase) {
        if (phrase == null || phrase.isEmpty()) {
            return "";
        }
        char[] array = phrase.toCharArray();
        for (int i = 0; i < array.length; i++) {
            if (i == 0 || array[i - 1] == ' ') {
                array[i] = Character.toUpperCase(array[i]);
            }
        }
        return new String(array);
    }

    //Jawid
    public static String toJadenCase3(String str){
        String[] str1 = str.split(" ");
        String result = "";

        for (String each : str1) {
            result+= each.substring(0,1).toUpperCase()+ each.substring(1).toLowerCase()+" ";
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(toJadenCase3("How can mirrors be real if our eyes aren't real"));
        System.out.println(toJadenCase2(""));
        System.out.println(toJadenCase1(null));
        System.out.println(toJadenCase2("most trees are blue"));
    }


}
