import java.util.ArrayList;
import java.util.List;

public class SumRootToLeafSolution {
    public int sumRootToLeaf(TreeNode root) {


        List<String> binaries = getValuesFromRootToLeafs(root);

        int sum = 0;
        for (String binary : binaries) {
            sum += Integer.parseInt(binary, 2);
        }

        return sum;
    }

    private List<String> getValuesFromRootToLeafs(TreeNode root){

        List<String> binaryValues = new ArrayList<>();

        if(root.left == null && root.right == null) {
            // We are at a leaf
            binaryValues.add(Integer.toString(root.val));
            return binaryValues;
        }

        if(root.left != null){
            // Move down left side
            binaryValues.addAll(getValuesFromRootToLeafs(root.left, Integer.toString(root.val)));
        }

        if(root.right != null){
            // Move down right side
            binaryValues.addAll(getValuesFromRootToLeafs(root.right, Integer.toString(root.val)));
        }

        return binaryValues;
    }

    private List<String> getValuesFromRootToLeafs(TreeNode parent, String currentValue){

        List<String> binaryValues = new ArrayList<>();
        String currentVal = currentValue + parent.val;

        if(parent.left == null && parent.right == null) {
            // We are at a leaf
            binaryValues.add(currentVal);
            return binaryValues;
        }

        if(parent.left != null){
            // Move down left side
            binaryValues.addAll(getValuesFromRootToLeafs(parent.left, currentVal));
        }

        if(parent.right != null){
            // Move down right side
            binaryValues.addAll(getValuesFromRootToLeafs(parent.right, currentVal));
        }

        return binaryValues;
    }
}
