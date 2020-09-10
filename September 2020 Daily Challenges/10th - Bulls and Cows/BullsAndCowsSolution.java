public class BullsAndCowsSolution {

    public static String getHint(String secret, String guess) {

        int bulls = 0;
        int cows = 0;

        char[] secretChars = secret.toCharArray();
        char[] guessChars = guess.toCharArray();

        for (int i = 0; i < secretChars.length; i++) {
            if(secretChars[i] == guessChars[i]){
                bulls++;
                secretChars[i] = 'x'; // being set to x, means it can't be used again
            }else if (isInArray(secretChars, guessChars[i])){
                cows++;
            }
        }

        // TODO: needs to be replaced with an actual return value
        return bulls + "A" + cows +"B";
    }

    private static boolean isInArray(char[] chars, char x){
        for (int i = 0; i < chars.length; i++) {
            if(chars[i] == x){
                chars[i] = 'x';
                return true;
            }
        }
        return false;
    }
}
