import java.util.ArrayList;
import java.util.List;

public class SumRootToLeafSolution {
    public int sumRootToLeaf(TreeNode root) {


        List<Integer> binaries = getValuesFromRootToLeafs(root);

        return 0;
    }

    private List<Integer> getValuesFromRootToLeafs(TreeNode root){

        List<Integer> binaryValues = new ArrayList<>();

        if(root.left == null && root.right == null) {
            // We are at a leaf
            binaryValues.add(root.val);
            return binaryValues;
        }

        if(root.left != null){
            // Move down left side
            binaryValues.addAll(getValuesFromRootToLeafs(root.left, root.val));
        }

        if(root.right != null){
            // Move down right side
            binaryValues.addAll(getValuesFromRootToLeafs(root.right, root.val));
        }

        return binaryValues;
    }

    private List<Integer> getValuesFromRootToLeafs(TreeNode parent, Integer currentValue){

        List<Integer> binaryValues = new ArrayList<>();
        Integer currentVal = concatIntegers(currentValue, parent.val);

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

    private Integer concatIntegers(Integer a, Integer b){
        return Integer.parseInt(a.toString() + b.toString());
    }
}
