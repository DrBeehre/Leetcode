import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionTest {

    @Test
    public void test_Matching_Pattern_abba(){

        String pattern = "abba";
        String str = "dog cat cat dog";

        assertEquals(true, Solution.wordPattern(pattern, str));
    }

    @Test
    public void test_Not_Matching_Pattern_abba(){

        String pattern = "aaaa";
        String str = "dog cat cat fish";

        assertEquals(false, Solution.wordPattern(pattern, str));
    }

    @Test
    public void test_Not_Matching_Pattern_aaaa(){

        String pattern = "aaaa";
        String str = "dog cat cat dog";

        assertEquals(false, Solution.wordPattern(pattern, str));
    }

    @Test
    public void test_Not_Matching_Pattern_abba_two(){

        String pattern = "abba";
        String str = "dog dog dog dog";

        assertEquals(false, Solution.wordPattern(pattern, str));
    }

    @Test
    public void test_Not_Matching_Pattern_Word_Length(){

        String pattern = "abbac";
        String str = "dog dog dog dog";

        assertEquals(false, Solution.wordPattern(pattern, str));
    }
}
