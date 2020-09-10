import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BullsAndCowsSolutionTest {

    @Test
    public void one_bull_two_cows_test(){
        String secret = "1478";
        String guess = "3489";

        assertEquals("1a2b", BullsAndCowsSolution.getHint(secret, guess));
    }
}
