import java.util.HashMap;

class Solution {
    public static boolean wordPattern(String pattern, String str) {

        String[] words = str.split(" ");

        // Easy quick check
        // If the number of words doesn't match the char length of the pattern, there is no way the words
        // will match the pattern, so we can just simply return false;
        if(words.length != pattern.length()) return false;

        HashMap<Character, String> matchingHash = new HashMap<>();

        for (int i = 0; i < words.length; i++) {

            final char patternChar = pattern.charAt(i);
            final String patternStr = words[i];


            if(matchingHash.containsKey(patternChar)){
                // if here,
                // we have a matching pair.

                // check matching str equals the current word,
                // else return false.
                if(!matchingHash.get(patternChar).equals(patternStr)){
                    return false;
                }
            }else{
                if(matchingHash.containsValue(patternStr)){
                    return false;
                }else{
                    matchingHash.put(patternChar, patternStr);
                }
            }
        }

        return true;
    }
}