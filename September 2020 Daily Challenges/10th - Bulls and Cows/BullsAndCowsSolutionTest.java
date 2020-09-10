import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BullsAndCowsSolutionTest {

    @Test
    public void one_bull_one_cows_test(){
        assertEquals("1A1B", BullsAndCowsSolution.getHint("1478", "3489"));
    }

    @Test
    public void one_bull_three_cows_test(){
        assertEquals("1A3B", BullsAndCowsSolution.getHint("1807", "7810"));
    }

    @Test
    public void three_ones_test(){
        assertEquals("1A1B", BullsAndCowsSolution.getHint("0111", "1123"));
    }

    @Test
    public void three_ones_test_two(){
        assertEquals("1A1B", BullsAndCowsSolution.getHint("1123", "0111"));
    }
}
