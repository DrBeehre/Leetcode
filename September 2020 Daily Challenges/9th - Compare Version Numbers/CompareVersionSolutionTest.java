import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CompareVersionSolutionTest {

    @Test
    public void inital_test(){
        String version1 = "0.1";
        String version2 = "1.1";

        assertEquals(-1, CompareVersionSolution.compareVersion(version1, version2));
    }

    @Test
    public void inital_test_2(){
        String version1 = "1";
        String version2 = "01";

        assertEquals(0, CompareVersionSolution.compareVersion(version1, version2));
    }

}
