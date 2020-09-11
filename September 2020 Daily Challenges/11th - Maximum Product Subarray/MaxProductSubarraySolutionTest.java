import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MaxProductSubarraySolutionTest {

    @Test
    public void passing_test() {
        assertEquals(6, MaxProductSubarraySolution.maxProduct(new int[]{2, 3, -2, 4}));
    }

    @Test
    public void failing_test() {
        assertEquals(0, MaxProductSubarraySolution.maxProduct(new int[]{-2,0,-1}));
    }

    @Test
    public void singlton_test() {
        assertEquals(-2, MaxProductSubarraySolution.maxProduct(new int[]{-2}));
    }

    @Test
    public void two_value_test() {
        assertEquals(2, MaxProductSubarraySolution.maxProduct(new int[]{0,2}));
    }
}
