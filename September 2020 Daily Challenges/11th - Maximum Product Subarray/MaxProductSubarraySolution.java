public class MaxProductSubarraySolution {
    public static int maxProduct(int[] nums) {

        if(nums.length == 0){
            return 0;
        }

        Integer largestProduct = null;
        Integer runningProduct = null;

        for (int i = 0; i < nums.length; i++) {
            if(runningProduct == null){
                runningProduct = nums[i];
            }else if(nums[i] == 0) {
                runningProduct = null;
            }else{
                runningProduct = runningProduct * nums[i];
            }

            if(largestProduct == null) largestProduct = runningProduct;
            if(runningProduct != null && runningProduct > largestProduct) largestProduct = runningProduct;
        }

        return largestProduct;
    }
}
