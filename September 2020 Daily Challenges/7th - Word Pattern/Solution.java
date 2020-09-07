import java.util.ArrayList;
import java.util.List;

class Solution {
    public static boolean wordPattern(String pattern, String str) {

        String[] words = str.split(" ");

        // Easy quick check
        // If the number of words doesn't match the char length of the pattern, there is no way the words
        // will match the pattern, so we can just simply return false;
        if(words.length != pattern.length()) return false;

        List<Character> characters = new ArrayList<>();
        List<String> strings = new ArrayList<>();

        for (int i = 0; i < words.length; i++) {

            final char patternChar = pattern.charAt(i);

            // Firstly, we need to check if the letter in the pattern has been seen before
            characters.stream()
                    .anyMatch(character -> character == patternChar);

        }

        return false;
    }
}