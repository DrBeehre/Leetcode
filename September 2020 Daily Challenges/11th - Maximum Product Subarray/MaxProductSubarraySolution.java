public class MaxProductSubarraySolution {
    public static int maxProduct(int[] nums) {

        if(nums.length == 0){
            return 0;
        }

        Integer absoluteLargestProduct = null;

        for (int j = 0; j < nums.length; j++) {

            Integer largestProduct = null;
            Integer runningProduct = null;

            for (int i = j; i < nums.length; i++) {
                if(runningProduct == null){
                    runningProduct = nums[i];
                }else if(nums[i] == 0) {
                    runningProduct = null;
                }else{
                    runningProduct = runningProduct * nums[i];
                }

                if(largestProduct == null) largestProduct = runningProduct;
                if(runningProduct != null && runningProduct > largestProduct) largestProduct = runningProduct;
                else if (nums[i] > largestProduct) largestProduct = nums[i];
            }

            if(absoluteLargestProduct == null && largestProduct != null) absoluteLargestProduct = largestProduct;
            if(absoluteLargestProduct < largestProduct) absoluteLargestProduct = largestProduct;
        }


        return absoluteLargestProduct;
    }
}
