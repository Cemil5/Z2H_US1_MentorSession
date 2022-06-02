package week_07;

public class FirstNon_repeatingVowel {
    public static void main(String[] args) {
        int index = getFirstNonRepeatingVowel("google");
        System.out.println(index);
        System.out.println(getFirstNonRepeatingVowel("bbddeeaffgi"));
        System.out.println(getFirstNonRepeatingVowel("aaabbbeeeoouu"));
    }

    public static int getFirstNonRepeatingVowel(String input) {
        int length = input.length();
        for (int i = 0; i < length; i++) {
            char ch = input.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                int vowelCount = 0;
                for (int j = 0; j < length; j++) {
                    if (ch == input.charAt(j)) {
                        vowelCount++;
                    }
                }
                if (vowelCount == 1)
                    return i;
            }
        }
        return -1;
    }
}