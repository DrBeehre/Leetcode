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



        return false;
    }
}