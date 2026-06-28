class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] leftProduct = new int[nums.length];
        int[] rightProduct = new int[nums.length];
        int[] output = new int[nums.length];
        int product = 1;
        
        //1. calculate cumulative product to the left of each index
        leftProduct[0] = 1;
        for (int i = 1; i < nums.length; i++) {
            product *= nums[i-1];
            leftProduct[i] = product;
        }

        //2. calculate cumulative product to the right of each index
        product = 1;
        rightProduct[nums.length-1] = 1;
        for (int i = nums.length-2; i >= 0; i--) {
            product *= nums[i+1];
            rightProduct[i] = product;
        }

        //3. calculate output
        for (int i = 0; i < nums.length; i++) {
            output[i] = leftProduct[i] * rightProduct[i];
        }

        return output;
    }
}