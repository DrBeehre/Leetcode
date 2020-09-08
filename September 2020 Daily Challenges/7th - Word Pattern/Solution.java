import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

class Solution {
    public static boolean wordPattern(String pattern, String str) {

        String[] words = str.split(" ");

        // Easy quick check
        // If the number of words doesn't match the char length of the pattern, there is no way the words
        // will match the pattern, so we can just simply return false;
        if(words.length != pattern.length()) return false;

        List<Pair> matchingPatternStrings = new ArrayList<>();

        for (int i = 0; i < words.length; i++) {

            final char patternChar = pattern.charAt(i);
            final String patternStr = words[i];

            // Firstly, we need to check if the letter in the pattern has been seen before
            Optional<Pair> matchingPairOnChar = matchingPatternStrings.stream()
                    .filter(pair -> pair.getPatternChar() == patternChar)
                    .findFirst();

            if(matchingPairOnChar.isPresent()){
                // if here,
                // we have a matching pair.

                // check matching str equals the current word,
                // else return false.
                if(!matchingPairOnChar.get().getMatchingString().equals(words[i])){
                    return false;
                }
            }else{
                Optional<Pair> matchingPairOnWord = matchingPatternStrings.stream()
                        .filter(pair -> pair.getMatchingString().equals(patternStr))
                        .findFirst();

                if(matchingPairOnWord.isPresent()){
                    return false;
                }else{

                    Pair newPair = new Pair(patternChar, patternStr);
                    matchingPatternStrings.add(newPair);
                }
            }
        }

        return true;
    }
}