public class Pair {

    private char patternChar;
    private String matchingString;

    public Pair(char patternChar, String matchingString) {
        this.patternChar = patternChar;
        this.matchingString = matchingString;
    }

    public char getPatternChar() {
        return patternChar;
    }

    public void setPatternChar(char patternChar) {
        this.patternChar = patternChar;
    }

    public String getMatchingString() {
        return matchingString;
    }

    public void setMatchingString(String matchingString) {
        this.matchingString = matchingString;
    }
}
