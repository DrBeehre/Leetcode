import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SumRootToLeafSolutionTest {

    @Test
    public void small_Tree_Test(){

        TreeNode root = new TreeNode(1, new TreeNode(0), new TreeNode(1));
        int resultSum = SumRootToLeafSolution.sumRootToLeaf(root);

        assertEquals(5, resultSum);
    }
}
