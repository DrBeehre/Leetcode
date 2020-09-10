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
                guessChars[i] = 'y';
            }
        }

        for (int i = 0; i < secretChars.length; i++) {
            if(isInArray(secretChars, guessChars[i])){
                cows++;
            }
        }

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
